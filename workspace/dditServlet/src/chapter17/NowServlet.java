package chapter17;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//���� Ŭ������ �����Ϸ��� HttpServlet Ŭ������ ��� �޾ƾ���
/*
 * <����?>
 * JSP�� ������ ���� ǥ��. JAVA�� �� ���ø����̼� ����.
 * ���� vs JSP => JSP�� �� ������
 * �ٵ� why Servlet ? MVC ���Ͽ��� ���� ��� �ڵ�� �����ϴ� ��찡 ���� 
 * <���� ����?>
 * 1) ���� �Ծ࿡ ���� �ڹ� �ڵ� �ۼ�
 * 1-2) �ڹ� �ڵ� ������ ( Ŭ���� ���� ���� )
 * 1-3) Ŭ���� ������ /WEB-INF/classes ������ ����
 * 2) web.xml�� ���� Ŭ������ ����
 * 3) Tomcat ����
 * 4) �� ���������� Ȯ��
 */




public class NowServlet extends HttpServlet{
	//doGet() : ������ GET ����� ��û�� ó��
	//HttpServletRequest : JSP�� request �⺻ ��ü
	//HttpServletResponse : Jsp�� response �⺻ ��ü
	
	@Override
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException {
		//requset : �� �������� ��û ������ �о��
		//response: ������ ������ ������ �� ����
		//������ �����Ϸ��� ������ ������ Ÿ���� UTF-8�� ������ �����
		response.setContentType("text/html;charset=UTF-8");
		//�������� �� �������� ����
		PrintWriter out = response.getWriter();
		//println() �޼��忡 ������ �����ʹ� �� �������� ���۵Ǿ� ȭ�鿡 ǥ�õ�
		out.println("<html>");
		out.println("<head><title>����ð�</title></head>");
		out.println("<body>");
		out.println("���� �ð���?");
		out.println(new Date());
		out.println("�Դϴ�.");
		out.println("</body></html>");
		
		
		
	}
}
