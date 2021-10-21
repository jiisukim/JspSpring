package mvc.controller;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;
import mvc.command.NullHandler;

//서블릿 클래스
public class ControllerUsingURI extends HttpServlet{
	//커맨드, 핸들러 인스턴스 매핑 정보 저장
	private Map<String, CommandHandler> commandHandlerMap = new HashMap<>();
	
	public void init() throws ServletException {
		// /WEB-INF/commandHandlerURI.properties
		String configFile = getInitParameter("configFile");
		Properties prop = new Properties();
		// D:\A_TeachingMaterial\6.JspSpring\workspace\board\WebContent\WEB-INF\commandHandlerURI.properties
		String configFilePath = getServletContext().getRealPath(configFile);
		try {
			//hello.do = mvc.hello.HelloHandler
			FileReader fis = new FileReader(configFilePath);
			prop.load(fis);
		}catch (IOException e) {
			throw new ServletException(e);
		}
		Iterator keyIter = prop.keySet().iterator();
		
		while(keyIter.hasNext()) {
			//hello.do
			String command = (String)keyIter.next();
			String handlerClassName = prop.getProperty(command);
			try {
				Class<?> handlerClass = Class.forName(handlerClassName);
				CommandHandler handlerInstance = (CommandHandler)handlerClass.newInstance();
				//hello.do, mvc.hello.HelloHandler
				commandHandlerMap.put(command,handlerInstance);
			}catch (ClassNotFoundException | InstantiationException | IllegalAccessException e ) {
				throw new ServletException(e);
			}
		}
		
	} //init()
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		process(request, response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		process(request, response);
	}
	private void process(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		// http://localhost:8090/hello.do
		String command = request.getRequestURI();
		if(command.indexOf(request.getContextPath())==0) {
			//request.getContextPath() : http://localhost:8090
			//command : /hello.do
			command = command.substring(request.getContextPath().length());
		}
		
		//commandHandlerMap => /hello.do, mvc.hello.HelloHandler
		//handler => mvc.hello.HelloHandler 객체(인스턴스)
		CommandHandler handler = commandHandlerMap.get(command);
		if(handler ==null) {
			handler = new NullHandler();
		}
		
		String viewPage = null;
		try {
			viewPage = handler.process(request, response);
		}catch (Throwable e) {
			throw new ServletException(e);
		}
		if(viewPage !=null) {
			RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
			dispatcher.forward(request, response);
		}
		
	}
	
}
