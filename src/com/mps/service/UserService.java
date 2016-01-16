package com.mps.service;

import java.util.HashMap;
import java.util.List;

import com.mps.bean.User;

public interface UserService {
	
	int CreateUser(User u);
	int UpdateUser(User u);
	int DeleteUser(int userId);
	HashMap<Integer,String> GetUsers();
	List<User> GetUserList();
	User GetUserById(int userId);
	User GetUserByLoginId(String loginId);
	String GetUserTypeByUserId(int UserId);
	String GetUserTypeByLodinId(String loginId);
	int GetUserIdByLoginId(String loginId);
	String GetLoginIdByUserId(int userId);

}
