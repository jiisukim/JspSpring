package chapter17;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//������ 3.0. tomcat7 or tomcat8 �� ���� ����
//tomcat���� WebServlet ������̼��� ����� Ŭ������ �˻��ؼ� ���������� �ڵ� ���
@WebServlet(urlPatterns = "/hello")
public class HelloServlet extends HttpServlet{
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