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
			Connection conn = ConnectionProvider.getConnection(); //ConnectionProvider Connection을 제공해주는 것
			
			//where memberid = ${memberid}
			Member member =  memberDao.selectById(conn, memberid);
			//select * from member where memberid = 'a001'; 의 결과가 없을 때...
			if(member==null) {
				//사용자 정의 Exception생성 (RuntimeException 클래스를 상속받음)
				//throw : 던진다 ... 어디로? LoginHandler로 던짐
				throw new LoginFailException();
			}
			//회원이 있다면 .. 다음은 비밀번호가 일치하는지 체킹
			//password : 사용자가 입력한 비밀번호
			//member.getPassword() : select 실행 후에 가져와진 비밀번호 [getter setter로 저장되어 있는]
			if(!member.matchPassword(password)) { //입력한 비밀번호와 select문을 거쳐 가져온 비밀번호가 일치하지 않는다면
				throw new LoginFailException();
			}
			return new User(member.getMemberid(),member.getName());
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
