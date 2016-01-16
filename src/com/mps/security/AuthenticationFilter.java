package com.mps.security;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import com.mps.bean.User;
import com.mps.service.UserService;


public class AuthenticationFilter implements AuthenticationSuccessHandler {
	

	 
	    UserService userService;
	    
	    public UserService getUserService() {
			return userService;
		}
		public void setServiceInter(UserService userService) {
			this.userService = userService;
		}
	    @Override
	    public void onAuthenticationSuccess(HttpServletRequest request, 
	      HttpServletResponse response, Authentication authentication) throws IOException {
	        
	    	Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
	    	for(String s:roles)
	    		System.out.println(s);
	        if (roles.contains("ADMIN") || roles.contains("USER") || roles.contains("CUSTOMER")) {
	        	UserDetails userDetails = (UserDetails)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	        	String loginId = userDetails.getUsername();
	        	
	        	User user = userService.GetUserByLoginId(loginId);
	        	request.getSession().setAttribute("user", user);
	            response.sendRedirect("/PMT/welcome.html");
	        }
	    	
	    }
	 
	    
}