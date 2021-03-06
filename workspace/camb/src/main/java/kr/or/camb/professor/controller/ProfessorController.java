package kr.or.camb.professor.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.camb.home.HomeController;

@Controller
public class ProfessorController {
	
	private static Logger logger = LoggerFactory.getLogger(ProfessorController.class);
	
	@RequestMapping("/professor/list")
	public String proList() {
		return "professor/study/list";
	}
	@RequestMapping("/professor/detail")
	public String proDetail() {
		return "professor/study/detail";
	}
	@RequestMapping("/professor/update")
	public String proUpdate() {
		return "professor/study/update";
	}
	@RequestMapping("/professor/insert")
	public String proInsert() {
		return "professor/study/insert";
	}
	@RequestMapping("/professor/attendance/list")
	public String proAtendList() {
		return "professor/attendance/list";
	}
	@RequestMapping("/professor/grade/list")
	public String proGradeList() {
		return "professor/grade/list";
	}
	@RequestMapping("/professor/study/lectureEvaluationList")
	public String lectureEvaluationList() {
		return "professor/study/lectureEvaluationList";
	}
	@RequestMapping("/professor/study/lectureEvaluationDetail")
	public String lectureEvaluationDetail() {
		return "professor/study/lectureEvaluationDetail";
	}
	@RequestMapping("/professor/consulting/consultingList")
	public String consultingList() {
		return "professor/consulting/consultingList";
	}
	@RequestMapping("/professor/salary/salaryList")
	public String salaryList() {
		return "professor/salary/salaryList";
	}
	@RequestMapping("/professor/academic/academicList")
	public String academicList() {
		return "professor/academic/academicList";
	}
	
	
	
}
