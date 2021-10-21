package mvc.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class HelloHandler implements CommandHandler{
	public String process(HttpServletRequest req,HttpServletResponse res) {
		req.setAttribute("hello", "나는 이석호. 수고했어");
		return "/WEB-INF/view/hello.jsp";
	}
	
}
