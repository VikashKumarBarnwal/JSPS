/**
 * 
 */
package com.garg.service;

import java.util.List;

import com.garg.model.Customer;

/**
 * @author Orange PC
 *
 */
public interface RegistrationService {
	
	 
	  public int registerCustomer(Customer cust);
	  public String   deleteCustomer(int custId);
	  public Customer   updteCustomer(Customer cust);
	  public Customer  getCustomer(String uname,String pwd);
	  public List<Customer> getAllCustomers ();
	  
	  

}
