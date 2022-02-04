package com.example.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex2")
public class Exam02Controller {
	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "exam02";
	}

	@RequestMapping("/cal")
	public String cal(Integer num1, Integer num2) {
		Integer num3 = num1 + num2;
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("num3",num3);
		return "exam02-result";
	}
	@RequestMapping("/output2")
	public String output2() {
		return "exam02-result2";
	}
}