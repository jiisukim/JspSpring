package jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

//���� Ŭ������ ��ӹ���
//�� ���ø����̼��� ���� �� �ڵ����� JDBC ����̹��� �ε�
public class OracleDriverLoader extends HttpServlet{
	//Servlet�� �ʱ�ȭ �� �� ȣ��Ǵ� init()�޼��带 ����
	//init() �޼���� �������� �������ִ� �޼���. ���� �ʱ�ȭ�� ���� 1ȸ ����
	public void init(ServletConfig config) throws ServletException {
		try {
			//Oracle JDBC ����̹��� �ε���.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch (Exception e) {
			throw new ServletException(e);
		}
	}
}
