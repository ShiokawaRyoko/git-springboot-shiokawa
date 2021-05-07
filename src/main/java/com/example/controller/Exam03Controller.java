package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {

	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/input")
	public String count(int pro1, int pro2, int pro3) {
		int sum1 = pro1 + pro2 + pro3;
		int sum2 = (int)(sum1 + (sum1*0.1));
		application.getAttribute("sum1");
		application.getAttribute("sum2");
		application.setAttribute("sum1", sum1);
		application.setAttribute("sum2", sum2);
		return "exam03-result";
	}
}
