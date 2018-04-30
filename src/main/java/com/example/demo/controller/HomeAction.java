package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.UserDetails;
import com.example.demo.service.UserDetailsService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport {
	@Autowired
	private UserDetailsService userService;
	
	private String userId;
	private String userName;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String index() {
		return SUCCESS;
	}
	
	public String userList() {
		List<UserDetails> users = userService.getUsers();
		System.out.println("struts-tags: userList.jsp");
		for(UserDetails user : users) {
			System.out.println(user.getEmail() + " " + user.getName());
		}
		
		ActionContext ctx = ActionContext.getContext();
        ctx.put("users", users);
		
		return SUCCESS;
	}
	
	public String userDetails() {
		List<UserDetails> users = userService.getUsers();
		
		System.out.println("JSTL: userList.jsp");
		for(UserDetails user : users) {
			System.out.println(user.getEmail() + " " + user.getName());
		}
		
		ActionContext ctx = ActionContext.getContext();
        ctx.put("users", users);
		
		return SUCCESS;
	}
	
	public String userSingle() {
		System.out.println(userId);
		
		UserDetails user = userService.findUserById(this.userId);
		ActionContext ctx = ActionContext.getContext();
        ctx.put("user", user);
		return SUCCESS;
	}
	
	public String delUserById() {
		userService.delUserById(Integer.valueOf(userId));
		
		userList();
		return SUCCESS;
	}
	
	public String insertUser() {
		UserDetails user = new UserDetails();
		user.setName("test");
		user.setAddress("wuhan-hanyang");
		user.setEmail("test4@163.com");
		user.setUserName("test4");
		// Bcrypt-4(length)
		user.setPasswrod("$2a$04$HcffZJMrgN0.lmEFpC4KTeeQhitLYzrH0uTCpGRJRBw4o03ms.qWa");
		userService.insertUser(user);
		
		userList();
		return SUCCESS;
	}
	
	public String updateUser() {
		System.out.println(userName + "-" + userId);
		userService.updateUser(userName, Integer.valueOf(userId));
		
		userList();
		return SUCCESS;
	}

}
