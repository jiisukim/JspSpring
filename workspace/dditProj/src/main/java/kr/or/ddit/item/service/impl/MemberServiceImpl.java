package kr.or.ddit.item.service.impl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.ddit.item.dao.MemberDao;
import kr.or.ddit.item.service.MemberService;
import kr.or.ddit.item.vo.MemberVO2;

//spring에게 이 클래스는 일반 클래스가 아닌 Service역할을 하는 클래스야. 라고 알려줌
@Service
public class MemberServiceImpl implements MemberService{
	//MemberDao를 주입하여 해당 객체의 메소드를 사용할 수 있도록 해야함
	@Autowired
	MemberDao memberDao;
	
	@Override
	public MemberVO2 selectMember(MemberVO2 memberVo) {
		return this.memberDao.selectMember(memberVo);
	}

	@Override
	public void logout(HttpSession session) {
		//로그아웃 처리(세션 초기화)
		session.invalidate();
		
	}
}
