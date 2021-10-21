package member.command;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.service.DuplicateIdException;
import member.service.JoinService;
import member.vo.JoinRequest;
import member.vo.Member;
import mvc.command.CommandHandler;

public class JoinHandler implements CommandHandler {
	//ȸ������ �⺻ Form URI
	private static final String FORM_VIEW = "/WEB-INF/view/joinForm.jsp";
	private JoinService joinService = new JoinService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return "/WEB-INF/view/joinForm.jsp";
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req, res);
		}else {
			return null;
		}
	}
	
	private String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		JoinRequest joinReq = new JoinRequest();
		joinReq.setMemberid(req.getParameter("memberid"));
		joinReq.setName(req.getParameter("name"));
		joinReq.setPassword(req.getParameter("password"));
		joinReq.setConfirmPassword(req.getParameter("confirmPassword"));
		
		System.out.println("joinReq.toString() : " + joinReq.toString());
		
		Map<String, Boolean> errors = new HashMap<>();
		//Handler�� jsp�� �����ؼ� ����ϴ� request��ü�� errors�� ���Ե�
		req.setAttribute("errors", errors);
		
		joinReq.validate(errors);
		
		//errors�� ��������� ��� �ʵ忡 ���� ����ְ�,
		//password�� confirmPassword�� ���� ���ٴ� �ǹ�
		if(!errors.isEmpty()) {
			//joinForm.jsp�� ����. errors�� ������
			return FORM_VIEW;
		}
		
		try {
			//member���̺� �ش� �����͸� �Է� ��� ����
			joinService.join(joinReq);
			return "/WEB-INF/view/joinSuccess.jsp";
		}catch(DuplicateIdException e) {
			//������ ����� ���̵� �ִٸ� joinForm.jsp�� �ǵ��� ��
			errors.put("duplicateId", Boolean.TRUE);
			return FORM_VIEW;
		}
	}
	
}







