package com.SpringMVC.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.SpringMVC.model.User;

@Repository
public class UserDAO {

	static List<User> list = new ArrayList<User>();
	public void addUser(User user) {
		// TODO Auto-generated method stub
		list.add(user);
	}

	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return list;
	}
	
	

}
