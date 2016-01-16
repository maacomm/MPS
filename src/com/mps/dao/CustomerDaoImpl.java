package com.mps.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.authentication.encoding.PasswordEncoder;

import com.mps.bean.Customer;




public class CustomerDaoImpl implements CustomerDao {

	@Autowired
    JdbcTemplate jdbcTemplate;
	
	@Override
	public int CreateCustomer(Customer c) {
	

	
		String query="insert into customer values('0',?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";  

		return jdbcTemplate.update(query,new Object[]{ });


	
	}

	@Override
	public int UpdateEmployee(Customer c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Customer GetCustomerDetails(int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HashMap<Integer, String> GetCustomers() {


		String sql = "SELECT cust_id,cust_name FROM customer";
		Map<Integer,String> itemList= new HashMap<Integer,String>();
		itemList = jdbcTemplate.query(sql, new ResultSetExtractor<Map>(){
			@Override
			public Map<Integer, String> extractData(ResultSet rs) throws SQLException,DataAccessException {
				HashMap<Integer, String> mapRet= new HashMap<Integer,String>();
				while(rs.next()){
					mapRet.put(rs.getInt("cust_id"),rs.getString("cust_name"));
				}
				return mapRet;
			}
		});
		return (HashMap<Integer, String>) itemList;
	}

	@Override
	public List<Customer> GetCustomerList() {
		
		String sql = "select * from customer" ;
		List<Customer> items = new ArrayList();
		items = jdbcTemplate.query(sql, new CustomerRowMapper());
		return items;
	}

	@Override
	public List<Customer> SearchEmployee(String keyword) {
		
		String key=("%"+keyword+"%").toUpperCase();
		String	sql = "SELECT * FROM CUSTOMER WHERE UPPER(CUST_NAME) LIKE '"+key+"' OR UPPER(CUST_ADDRESS) LIKE '"+key+"' OR UPPER(CUST_CONTACT) LIKE '"+key+"' OR UPPER(CUST_EMAIL) LIKE '"+key+"'";	
		return jdbcTemplate.query(sql, new CustomerRowMapper());
		
	}

	
	
}
