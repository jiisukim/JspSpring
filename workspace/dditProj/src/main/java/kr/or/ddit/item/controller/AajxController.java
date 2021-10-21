package kr.or.ddit.item.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import kr.or.ddit.item.service.MemberService;
import kr.or.ddit.item.vo.MemberVO2;
import kr.or.ddit.vo.MemberVO;

@RequestMapping(value="/item")
@Controller
public class AajxController {
   private static Logger logger = LoggerFactory.getLogger(AajxController.class);
   //MemberService를 DI(의존성주입)을 하여 MemberServiceImpl의 메소드를 사용할 수 있도록함.
   
   @Autowired
   MemberService memberService;
   
   // /iteml/ajax?id=a001&name=ked
   @RequestMapping(value="/ajax", method=RequestMethod.GET)
   public String ajax(String id, String name, @RequestParam Map<String, Object> map) {
      logger.info("id : " + id + ", name : " + name);
      logger.info("map : " +map.toString());
      // forwarding 
      return "item/ajax";
      
   }
//   @RequestMapping(value = "/background", method =RequestMethod.POST)
//   public @ResponseBody Map<String, Object> background(){
//	   Map<String, Object> map = new HashMap<String, Object>();
//	   map.put("id", "a001");
//	   map.put("name", "김은대");
//	   
//	   return map;
//   }
   
   //pom.xml
   @ResponseBody
   @RequestMapping(value = "/background",method = RequestMethod.POST)
   public MemberVO background() {
	   MemberVO memberVo = new MemberVO();
	   memberVo.setId("a001");
	   memberVo.setName("김은대");
	   
	   return memberVo;
	   
   }
   
   @RequestMapping(value = "/login", method = RequestMethod.GET)
   public String login() {
	   //forwarding
	   return "item/login";
   }
   
   
   @RequestMapping(value = "/login_result",method = RequestMethod.POST)
   public String login_result(String id,String pwd, @RequestParam Map<String,Object> map,Model model
		   ,HttpSession session) {
	   String result ="";
	   String loginOk = "false";
	   MemberVO2 memberVo = new MemberVO2();
	   memberVo.setMemberid(id);
//	   memberVo.setPassword(pwd);
	   //memberVoDb ==> select 결과를 담음
	   MemberVO2 memberVoDb = this.memberService.selectMember(memberVo);
	   
	   if(memberVoDb !=null) {//해당 아이디의 회원이 있다면..
		   //memberVoDb.getPassword() => 해당 아이디 회원의 비밀번호 정보
		   // pwd : 텍스트박스에 고객이 입력한값
		   if(memberVoDb.getPassword().equals(pwd)) {	//비밀번호 일치
			   	result ="환영합니다";
			   	loginOk = "true";
			   //세션변수 등록
//			   session.setAttribute("memberid", memberVoDb.getMemberid());
//			   session.setAttribute("name", memberVoDb.getName());
			   	//세션에 VO객체를 넣을 수 있음
			   	session.setAttribute("memberVo", memberVoDb);
		   }else {//해당 회원은 있으나 비밀번호 불일치
			   result = "비밀번호가 틀렸습니다.";
		   }
	   }else { //해당 아이디의 회원이 없다면
		   result = "해당 회원이 없습니다.";
	   }
	   model.addAttribute("result",result);
	   model.addAttribute("loginOk",loginOk);
	   //forwarding
	   return "item/login_result";
   }
   	
   //속성이 1개면 생략가능
   @RequestMapping("/logout")
   public ModelAndView logout(HttpSession session, ModelAndView mav) {
	  //세션 초기화 작업 수행(뷰단에서 넘어온 session 객체를 파라미터로 던짐)
	   this.memberService.logout(session);
	   // 이동할 페이지 이름 지정(forwarding시 데이터를 담을 수 있음)
	   mav.setViewName("item/login");	//포워드는 폴더의 jsp / 리다이렉트는 경로
	   // message 속성에 logout이라는 문자열 저장
	   mav.addObject("message","logout");
	   // 해당 페이지로 이동
	   return mav;
	   
  }
   
   
}