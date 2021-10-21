package auth.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import auth.service.LoginFailException;
import auth.service.LoginService;
import auth.vo.User;
import mvc.command.CommandHandler;

public class LoginHandler implements CommandHandler{
	private static final String FORM_VIEW = "/WEB-INF/view/loginForm.jsp";
	private LoginService loginService = new LoginService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")){
			return FORM_VIEW;
		}else if(req.getMethod().equalsIgnoreCase("POST")) {  //equalsIgnoreCase : ��ҹ��� ���о��� ��
			String memberid = req.getParameter("memberid");
			String password = req.getParameter("password");
			
			System.out.println("memberid : " + memberid);
			System.out.println("password : " + password);
			
			Map<String, Boolean> errors = new HashMap<>();
			//java�� JSP���� errors ���� ����
			req.setAttribute("errors", errors);
			//���̵� ���� ����ִٸ�..
			if(memberid == null || memberid.isEmpty()) {
				errors.put("memberid", Boolean.TRUE);
			}
			//��й�ȣ ���� ����ִٸ�
			if(password==null || password.isEmpty()) {
				errors.put("password", Boolean.TRUE);
			}
			//errors.isEmpty() : ������ ���ٸ�
			if(!errors.isEmpty()) { //������ ���� �ʴٸ�
				return FORM_VIEW;	//�ٽ� ���ư� (errors��� ���� ������ ���ư�)
			}
			try {
				//��й�ȣ�� ��ġ�ϴ� ȸ���� �ִٸ�..
				User user = loginService.login(memberid,password);
				//jsp������ session.setAttribute()�� ���������� �ڹٿ����� �⺻������ �����ϰ� ���� �ʴ�.
				//req.getSession(): ���� ����[������ ������]. ������ ������ �α���ó��
				req.getSession().setAttribute("authUser", user);
				System.out.println("req.getContextPath(): " + req.getContextPath());
				res.sendRedirect(req.getContextPath()+"/index.jsp");
				
				return null;
			}catch (LoginFailException e) {	//loginService.login() => ���̵�/��� ���� �߻���
				errors.put("idOrPwNotMatch", Boolean.TRUE);
				return FORM_VIEW;
			}
			
			
			
		}else {
			return null;			
		}
		
		
		
	}

}
