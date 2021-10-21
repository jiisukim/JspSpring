package kr.or.ddit.chart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// /*는 생략가능
@RequestMapping(value = "/chart/*")
@Controller
public class ChartMainController {
	
	@RequestMapping("/chartMain")
	public String chartMain() {
		
		
		//forwarding
		return "chart/chartMain"; 
	}
	
}
