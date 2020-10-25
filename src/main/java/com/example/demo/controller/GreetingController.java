package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.Greeting;

//@Controller
public class GreetingController {
	@GetMapping("/greeting")
	public String greetingForm(Model model) {
		model.addAttribute("greeting",new Greeting());
		return "greeting";
	}
	@PostMapping("/greeting")
	public String greetingSumbit(@ModelAttribute Greeting greeting) {
		return "result";
	}
	
	/*
	 * 2020年10月22日22:30
	 * Writer:Mr.Hkuai
	 * 这是一个SpringBoot运行的HelloWorld实例，采用控制器返回页面的方法
	 * 
	 * */
	@RequestMapping("/say")
	public String say(){
		return "index";
	}
}