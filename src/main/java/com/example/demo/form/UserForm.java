package com.example.demo.form;

import java.io.Serializable;

import org.springframework.ui.ModelMap;

public class UserForm implements Serializable{
	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String index(ModelMap map) {
		map.put("username", "入门案例");
	    UserForm user = new UserForm();
	    user.setPassword("test_ps");
	    user.setUsername("test");
	    map.put("userInfo", user);
		return "test";
	}
}
