package com.zt.sale.mapper;

import java.util.List;
import java.util.Map;

import com.zt.sale.po.Customer;

public interface CustomerMapper {
	public int addCustomer(Customer c);
	public int updateCustomer(Customer c);
	public int delCustomer(int customerId);
	public Customer getCustomerById(int customerId);
	
	public int countCustomerByFilter(Map filter);
	public List<Customer> seachCustomerByFilter(Map filter);
}
