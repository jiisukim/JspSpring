package kr.or.camb.home;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//RestController 어노테이션 : JSON데이터를 리턴하는 메소드가 있을 경우 사용
@Controller
public class HomeController {
	
	private static Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "home/home";
	}
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2() {
		return "home/test";
	}
}
