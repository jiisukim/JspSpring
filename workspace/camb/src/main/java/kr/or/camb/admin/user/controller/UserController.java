package kr.or.camb.admin.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping(value = "/admin/user/*")
@Controller
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String userManage() {
		return "admin/user/list";
	}
	
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String userDetail() {
		return "admin/user/detail";
	}

}
