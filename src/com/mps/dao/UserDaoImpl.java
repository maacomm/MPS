package com.mps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.mps.bean.User;


public class UserDaoImpl implements UserDao {

	
	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
	public int CreateUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int UpdateUser(User u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteUser(int userId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HashMap<Integer, String> GetUsers() {
		
		String sql = "SELECT user_id,user_name FROM customer";
		Map<Integer,String> itemList= new HashMap<Integer,String>();
		itemList = jdbcTemplate.query(sql, new ResultSetExtractor<Map>(){
			@Override
			public Map<Integer, String> extractData(ResultSet rs) throws SQLException,DataAccessException {
				HashMap<Integer, String> mapRet= new HashMap<Integer,String>();
				while(rs.next()){
					mapRet.put(rs.getInt("user_id"),rs.getString("user_name"));
				}
				return mapRet;
			}
		});
		return (HashMap<Integer, String>) itemList;
	}

	@Override
	public List<User> GetUserList() {

		String sql = "select * from user";

		return jdbcTemplate.query(sql,new UserRowMapper());

	}

	@Override
	public User GetUserById(int userId) {
		
	String sql = "select * from user where user_id='"+userId+"'";
		
		return jdbcTemplate.queryForObject(sql,new UserRowMapper());

	}

	@Override
	public User GetUserByLoginId(String loginId) {
		
		String sql = "select * from user where login_id='"+loginId+"'";
		
		return jdbcTemplate.queryForObject(sql,new UserRowMapper());


	}

	@Override
	public String GetUserTypeByUserId(int userId) {

		String sql = "select user_type from user where user_id='"+userId+"'";

		return jdbcTemplate.queryForObject(sql,String.class);

	}

	@Override
	public String GetUserTypeByLodinId(String loginId) {

		String sql = "select user_type from user where user_id='"+loginId+"'";

		return jdbcTemplate.queryForObject(sql,String.class);
	}

	@Override
	public int GetUserIdByLoginId(String loginId) {

		String sql = "select user_id from user where login_id='"+loginId+"'";

		return jdbcTemplate.queryForObject(sql,Integer.class);
	}

	@Override
	public String GetLoginIdByUserId(int userId) {

		String sql = "select login_id from user where user_id='"+userId+"'";

		return jdbcTemplate.queryForObject(sql,String.class);
	}

	
}
