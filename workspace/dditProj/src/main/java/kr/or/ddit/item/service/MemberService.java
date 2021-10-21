package kr.or.ddit.item.service;

import javax.servlet.http.HttpSession;

import kr.or.ddit.item.vo.MemberVO2;

public interface MemberService {

	public MemberVO2 selectMember(MemberVO2 memberVo);

	public void logout(HttpSession session);

}
