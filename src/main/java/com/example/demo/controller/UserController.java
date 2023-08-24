package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.User;
import com.example.demo.service.UserService;

@RestController  //  @RequestBody and @ResponseBody and @Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/add")
	public String addUser(@RequestBody User user) {
		
		User user1=userService.add(user);
		if(user1 !=null) {
			return "Data inserted successfully";
		}else {
			return "Somthing went wrong";
		}
		
		
	}
	@RequestMapping("/getAll")
	public List<User> findAllUsers(){
		List<User> users=userService.getAll();
		
		return users;
	}
}
