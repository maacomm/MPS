package com.mps.controller;

import java.security.Principal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mps.bean.User;
import com.mps.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	
	 @Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/index", method = RequestMethod.GET) 
	public ModelAndView index(ModelMap model) { 
		List<User> ll=userService.GetUserList();
		System.out.println(ll.size());
		
		
		return new ModelAndView("login", "command",null); 
	} 
		
	@RequestMapping(value = "/logout") 
	public ModelAndView logout() { 	
		return new ModelAndView("login", "command",null); 
	} 
}