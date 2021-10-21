package auth.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mvc.command.CommandHandler;

public class LogoutHandler implements CommandHandler{
	//�α׾ƿ� ����
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//������ ���۵�
		HttpSession session = req.getSession();
		System.out.println("authUser : " +session.getAttribute("authUser"));
		//������ �ִٸ�.. �α׾ƿ�
		if(session != null) {
			session.invalidate();
		}
		
		res.sendRedirect(req.getContextPath() + "/index.jsp");
		
		return null;
	}
	
	
}
