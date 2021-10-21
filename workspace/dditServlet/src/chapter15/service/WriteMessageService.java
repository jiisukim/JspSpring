package chapter15.service;

import java.sql.Connection;
import java.sql.SQLException;

import chapter15.dao.MessageDao;
import chapter15.jdbc.ConnectionProvider;
import chapter15.jdbc.JdbcUtil;
import chapter15.vo.Message;

public class WriteMessageService {
	//�̱��� ���� ����(�������)
	private static WriteMessageService instance = new WriteMessageService();
	public static WriteMessageService getInstance() {return instance;}
	private WriteMessageService() {}
	
	public void write(Message messageVo) {
		System.out.println("messageVo : " + messageVo.toString());
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			//MessageDao.insert() �޼��带 �̿��ؼ� �޽����� ���̺� insert
			MessageDao messageDao = MessageDao.getInstance();
			messageDao.insert(conn, messageVo);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		
	}
}



