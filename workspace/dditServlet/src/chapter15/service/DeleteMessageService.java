package chapter15.service;

import java.sql.Connection;
import java.sql.SQLException;

import chapter15.dao.MessageDao;
import chapter15.jdbc.ConnectionProvider;
import chapter15.jdbc.JdbcUtil;
import chapter15.vo.Message;

public class DeleteMessageService {
	//�̱��� ���� 
	private static DeleteMessageService instance = new DeleteMessageService();
	private DeleteMessageService() {}
	public static DeleteMessageService getInstance() {return instance;}
	
	public void deleteMessage(int messageId,String password) {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			MessageDao messageDao = MessageDao.getInstance();
			
			//�ش� �޽����� ����?
			Message message =  messageDao.select(conn,messageId);
			if(message == null) {
				throw new MessageNotFoundException("�޽��� ����");	//���� ������ �����ؼ� catch������ ����
			}
			//��й�ȣ�� ��ġ�ϴ°�?
			if(!message.matchPassword(password)) { //�ʵ� ��ü�� �Ѿ�� �Ķ���� ��  // ������ true ����, �ٸ��� false����
				throw new InvalidPasswordException("��й�ȣ�� �ٸ��ϴ�.");
			}
			
			//�ش� ������ ����
			messageDao.delete(conn,messageId);
			//Ʈ����� ����(T1�� ���� -> T2�� ����)
			conn.commit();
		} catch (SQLException e) {	
			//catch��Ͽ��� ���� �߻� �� rollback ó��
			//Ʈ����� ? �����ͺ��̽� ������ �ϱ� ���� ����Ǿ�� �� ���� ����
			//���ڼ�(all or nothing), �ϰ���(�� �������� �귯��), ����(ȭ���), ���Ӽ� (TCL�� ���ӵ�)
			JdbcUtil.rollback(conn);
			e.printStackTrace();
		}catch(InvalidPasswordException | MessageNotFoundException ex) {
			JdbcUtil.rollback(conn); // ���ڼ�
			throw ex;
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
