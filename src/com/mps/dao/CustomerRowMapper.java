package com.mps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mps.bean.Customer;


public class CustomerRowMapper implements RowMapper<Customer> {

	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer c=new Customer();
		c.setCustomerId(rs.getInt("cust_id"));
		c.setCustomerName(rs.getString("cust_name"));
		c.setCustomerAddress(rs.getString("cust_address"));
		c.setContactNo(rs.getString("cust_contact"));
		c.setCustomerEmail(rs.getString("cust_email"));
		c.setBalance(rs.getFloat("balance"));
		
		return c;
	}

}
