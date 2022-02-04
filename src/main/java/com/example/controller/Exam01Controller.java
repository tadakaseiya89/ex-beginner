package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex1")
public class Exam01Controller {
	@RequestMapping("")
	public String index() {
		return "exam01";
	}

	@RequestMapping("/receive")
	public String receive(String name, Model model) {
		model.addAttribute("name", name);
		return "exam01-result";
	}
}