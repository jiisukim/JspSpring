package member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import jdbc.ConnectionProvider;
import member.dao.MemberDao;
import member.vo.JoinRequest;
import member.vo.Member;
import util.JdbcUtil;

public class JoinService {
	
	private MemberDao memberDao = new MemberDao();
	//ȸ������
	public void join(JoinRequest joinReq) {
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			//insert, update, delete�� �����ϸ� �ڵ����� commit�� �Ͼ���� ���� �ʰڴ�.
			conn.setAutoCommit(false);
			//joinReq [memberid=a001, name=ȫ�浿, password=1234, confirmPassword=1234]
			//������ a001ȸ���� �̹� �ִ��� üŷ(member�� null�̸� �ű�ȸ��)
			Member member = memberDao.selectById(conn, joinReq.getMemberid());
			if(member!=null) { //�̹� �ش� ���̵� �ִٸ�..
				JdbcUtil.rollback(conn);
				//�ߺ�. ���̵�. ����(JoinHandler�� ������ ����)
				throw new DuplicateIdException();
			}
			System.out.println("����1");
			//�ش� ���̵� �űԶ��
			memberDao.insert(conn, 
					new Member(joinReq.getMemberid(), joinReq.getName(), 
							joinReq.getPassword(), new Date()));
			
			//Ʈ����� ���� �� ���ο� Ʈ����� ����. DB�� ��ȭ �ݿ���
			conn.commit();
		}catch (SQLException e) {
			JdbcUtil.rollback(conn);
			throw new RuntimeException(e);
		}finally {
			JdbcUtil.close(conn);
		}
		
	}
}














