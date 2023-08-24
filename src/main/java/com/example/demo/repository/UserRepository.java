package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modal.*;

public interface UserRepository extends JpaRepository<User, Integer>{
  //save method
	
	//public List<User> findByUserName(); //custom method
}
