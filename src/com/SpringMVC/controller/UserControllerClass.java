package com.SpringMVC.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringMVC.model.User;
import com.SpringMVC.service.UserService;

@Controller
@Scope("request")
public class UserControllerClass {
	
	@Autowired
	private UserService userService;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String register() {
		return "index";
	}
	
//	@RequestMapping(value="/register", method = RequestMethod.POST)
/*	public String successMessage(@RequestParam Map<String,Object> map) {
		user.setAge((String)map.get("age"));
		user.setCountry((String)map.get("country"));
		user.setEmail((String)map.get("email"));
		user.setName((String)map.get("name"));
		
		userService.createUser(user);
		return "redirect:/listUsers";
	}*/
	
//	We can also use @ModelAttribute at the method instead of above @RequestParam
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String successMessage(@ModelAttribute()User user) {		
		userService.createUser(user);
		return "redirect:/listUsers";
	}
	
	
	@RequestMapping(value="listUsers", method=RequestMethod.GET)
	public String showUsersPage(Model model) {
		model.addAttribute("userList", userService.getUserList());
		return "UserList";
		
	}
}
