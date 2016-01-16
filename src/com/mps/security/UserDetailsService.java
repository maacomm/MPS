package com.mps.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
		//UserDetails user = itemDao.findByUserName(login);

        //if(null == user) throw new UsernameNotFoundException("User not found");
        //return userAssembler.buildUserFromUser(user);
		return null;
	}
}
