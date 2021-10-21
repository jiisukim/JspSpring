package article.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.service.WriteArticleService;
import article.vo.WriteRequest;
import article.vo.Writer;
import mvc.command.CommandHandler;

public class WriteArticleHandler implements CommandHandler{
	private static final String FORM_VIEW = "/WEB-INF/view/newArticleForm.jsp";
	private WriteArticleService writeService = new WriteArticleService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {
		if(req.getMethod().equalsIgnoreCase("GET")) {
			return FORM_VIEW;
		}else if(req.getMethod().equalsIgnoreCase("POST")) {
			return processSubmit(req , res);
		}else {
			return null;
		}
		
		
		
	}
	
	private String processSubmit(HttpServletRequest req, HttpServletResponse res) {
		WriteRequest writeReq = 
		new WriteRequest(
				new Writer(req.getParameter("writerId"), req.getParameter("writerName")), 
				req.getParameter("title"), 
				req.getParameter("content")
				);
		System.out.println("req.getParameter(\"writerName\"): " +req.getParameter("writerName")  );	
		System.out.println("writeReq : " + writeReq.toString());
		//writeReq : jsp�κ��� ��û�� �Ķ���� ������ ��� �׸� : writerId, writeName, title, content
		//article/ article_contnet ���̺� �Էµ� article_no�� ����
		int newArticleNo = writeService.write(writeReq);
		req.setAttribute("newArticleNo", newArticleNo);
		
		return "/WEB-INF/view/newArticleSuccess.jsp";
		
	}
	

}
