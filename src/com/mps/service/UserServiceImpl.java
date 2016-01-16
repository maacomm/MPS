package com.mps.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.bean.User;
import com.mps.dao.UserDao;

public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public int CreateUser(User u) {
		
		return userDao.CreateUser(u);
	}

	@Override
	public int UpdateUser(User u) {

		return userDao.UpdateUser(u);
	}

	@Override
	public int DeleteUser(int userId) {
		
		return userDao.DeleteUser(userId);
	}

	@Override
	public HashMap<Integer, String> GetUsers() {

		return userDao.GetUsers();
	}

	@Override
	public List<User> GetUserList() {
		
		return userDao.GetUserList();
	}

	@Override
	public User GetUserById(int userId) {
		
		return userDao.GetUserById(userId);
	}

	@Override
	public User GetUserByLoginId(String loginId) {
		
		return userDao.GetUserByLoginId(loginId);
	}

	@Override
	public String GetUserTypeByUserId(int UserId) {

		return userDao.GetUserTypeByUserId(UserId);
	}

	@Override
	public String GetUserTypeByLodinId(String loginId) {
		
		return userDao.GetUserTypeByLodinId(loginId);
	}

	@Override
	public int GetUserIdByLoginId(String loginId) {
		
		return userDao.GetUserIdByLoginId(loginId);
	}

	@Override
	public String GetLoginIdByUserId(int userId) {
		
		return userDao.GetLoginIdByUserId(userId);
	}

}
