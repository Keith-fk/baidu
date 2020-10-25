package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 这是一个接收前端参数的控制器
 * */
@RestController
public class IndexController {
	@PostMapping("/here")
	public String hello(@RequestParam(name="name",defaultValue="xxx") String name,
			@RequestParam(name="age",required = false) Integer age) {
		return "你的传输值name:"+name+"\nage:"+age;
	}
}
