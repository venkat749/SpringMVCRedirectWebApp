package com.SpringMVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMVC.dao.UserDAO;
import com.SpringMVC.model.User;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;

	public void createUser(User user) {
		userDAO.addUser(user);
		
	}
	
	public List<User> getUserList(){
		return userDAO.getUserList();
	}
}
