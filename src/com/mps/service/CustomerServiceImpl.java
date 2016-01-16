package com.mps.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mps.bean.Customer;
import com.mps.dao.CustomerDao;


public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public int CreateCustomer(Customer c) {
		
		return customerDao.CreateCustomer(c);
	}

	@Override
	public int UpdateEmployee(Customer c) {
		
		return customerDao.UpdateEmployee(c);
	}

	@Override
	public Customer GetCustomerDetails(int customerId) {
	
		return customerDao.GetCustomerDetails(customerId);
	}

	@Override
	public HashMap<Integer, String> GetCustomers() {
		
		return customerDao.GetCustomers();
	}

	@Override
	public List<Customer> GetCustomerList() {
		
		return customerDao.GetCustomerList();
	}

	@Override
	public List<Customer> SearchEmployee(String keyword) {
		
		return customerDao.SearchEmployee(keyword);
	}

}
