package mvc.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommandHandler {
	//��� ��ɾ �ٷ�� Ŭ�������� ���������� �����ؾ� �ϴ� �޼��带 ������
	public String process(HttpServletRequest req,HttpServletResponse res) throws Exception;
		
	
	
}
