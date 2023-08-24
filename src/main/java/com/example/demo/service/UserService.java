package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	//UserRepository obj=new UserRepository();
	
	public User add(User user) {
		
		User user1=userRepo.save(user);
		return user1;
		
	}
	
	public List<User> getAll(){
		List<User> users=userRepo.findAll();
		
      return users;
	}
}
