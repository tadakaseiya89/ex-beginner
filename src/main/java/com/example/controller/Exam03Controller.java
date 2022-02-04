package com.example.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex3")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/sum")
	public String sum(Integer num1, Integer num2, Integer num3) {
		Integer ans = num1 + num2 + num3;
		Integer ans2 = (int) (ans * 1.1);

		application.setAttribute("ans", ans);
		application.setAttribute("ans2", ans2);
		return "exam03-result";
	}
}