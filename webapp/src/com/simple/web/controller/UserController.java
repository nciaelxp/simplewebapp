package com.simple.web.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.simple.database.dto.User;
import com.simple.web.service.UserService;

/**
 * UserController
 */
public class UserController implements Controller {

	@Autowired
	private UserService userService;

	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		User user = new User();
		user.setName("name");
		user.setPassword("password");
		user.setEmail("email@email");
		user.setCreateTime(new Date());
		userService.register(user);
		
		String aMessage = "this is genernal request.";
		ModelAndView modelAndView = new ModelAndView("simple1");
		modelAndView.addObject("message", aMessage);
		return modelAndView;
	}

}