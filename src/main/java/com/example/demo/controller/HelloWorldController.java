package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.form.UserForm;


@Controller
@RequestMapping("/index")
public class HelloWorldController {
	@RequestMapping("/hello")
	public String hello() {
		System.out.print("hello");
		return "uu";
	}
	@RequestMapping("/add")
	public String add(@ModelAttribute(value = "user") UserForm user){
	    String username = user.getUsername();
	    String password = user.getPassword();
	    return username+"__"+password;
	}
}
