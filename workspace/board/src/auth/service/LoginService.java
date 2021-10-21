package auth.service;

import java.sql.Connection;
import java.sql.SQLException;

import auth.vo.User;
import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.vo.Member;

public class LoginService {
	private MemberDao memberDao = new MemberDao();
	
	public User login(String memberid,String password) {
		try{
			Connection conn = ConnectionProvider.getConnection(); //ConnectionProvider Connection�� �������ִ� ��
			
			//where memberid = ${memberid}
			Member member =  memberDao.selectById(conn, memberid);
			//select * from member where memberid = 'a001'; �� ����� ���� ��...
			if(member==null) {
				//����� ���� Exception���� (RuntimeException Ŭ������ ��ӹ���)
				//throw : ������ ... ����? LoginHandler�� ����
				throw new LoginFailException();
			}
			//ȸ���� �ִٸ� .. ������ ��й�ȣ�� ��ġ�ϴ��� üŷ
			//password : ����ڰ� �Է��� ��й�ȣ
			//member.getPassword() : select ���� �Ŀ� �������� ��й�ȣ [getter setter�� ����Ǿ� �ִ�]
			if(!member.matchPassword(password)) { //�Է��� ��й�ȣ�� select���� ���� ������ ��й�ȣ�� ��ġ���� �ʴ´ٸ�
				throw new LoginFailException();
			}
			return new User(member.getMemberid(),member.getName());
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
