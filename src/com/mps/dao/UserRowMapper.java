package com.mps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mps.bean.User;


public class UserRowMapper implements RowMapper<User> {
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User u=new User();
		u.setUserId(rs.getInt("user_id"));
		u.setLoginId(rs.getString("login_id"));
		u.setPassword(rs.getString("password"));
		u.setUserName(rs.getString("user_name"));
		u.setUserType(rs.getString("user_type"));
		return u;
	}

}
