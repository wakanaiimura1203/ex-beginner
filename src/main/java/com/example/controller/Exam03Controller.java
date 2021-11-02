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

	@RequestMapping("/result")
	public String result(Integer price1, Integer price2, Integer price3) {
		int subTotal = price1 + price2 + price3;
		int tax = (int) (subTotal * 0.1);
		int total = subTotal + tax;

		application.setAttribute("subTotal", subTotal);
		application.setAttribute("total", total);
		
		return "exam03-result";

	}
	
}
