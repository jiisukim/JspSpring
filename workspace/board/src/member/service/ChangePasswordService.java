package member.service;

import java.sql.Connection;
import java.sql.SQLException;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.vo.Member;
import util.JdbcUtil;

public class ChangePasswordService {
	private MemberDao memberDao = new MemberDao();
	//String userId(������), String curPwd(����), String newPwd(�ٲ�)
	public void changePassword(String userId, String curPwd, String newPwd) {
		//service���� connection ��ü�� ������
		Connection conn = null;
		try {
			conn = ConnectionProvider.getConnection();
			conn.setAutoCommit(false);
			Member member= memberDao.selectById(conn,userId);
			
			//select * from member where memberid = ${userId} ����� ������..
			if(member==null) {
				throw new MemberNotFoundException();
			}
			//��й�ȣ�� ��ġ���� ������	
			System.out.println("curPwd : " + curPwd + "member.getPassword : " + member.getPassword());
			if(!member.matchPassword(curPwd)) {
				System.out.println("�Դ�");
				throw new InvalidPasswordException();
			}
			//member VO�� ��й�ȣ�� �ű� ��й�ȣ�� ������
			member.changePassword(newPwd);
			//��й�ȣ ������Ʈ ó��
			memberDao.update(conn,member);
			
			conn.commit();
		}catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException();
		}finally {
			JdbcUtil.close(conn);
		}
	}
}
