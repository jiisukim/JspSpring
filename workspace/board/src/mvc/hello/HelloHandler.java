package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class HelloHandler implements CommandHandler{
	public String process(HttpServletRequest req,HttpServletResponse res) {
		req.setAttribute("hello", "���� �̼�ȣ. �����߾�");
		return "/WEB-INF/view/hello.jsp";
	}
	
}
