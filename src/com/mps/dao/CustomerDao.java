package com.mps.dao;

import java.util.HashMap;
import java.util.List;

import com.mps.bean.Customer;

public interface CustomerDao {
	
	int CreateCustomer(Customer c);
	int UpdateEmployee(Customer c);
	Customer GetCustomerDetails(int customerId);
	HashMap<Integer, String> GetCustomers();
	List<Customer> GetCustomerList();
	List<Customer> SearchEmployee(String keyword);

}
