/**
 * 
 */
package com.garg.dao;

import java.util.List;

import com.garg.model.Customer;

/**
 * @author Orange PC
 *
 */
public interface RegistrationDao {
	
	  public int registerCustomer(Customer cust);
	  public boolean   deleteCustomer(int custId);
	  public Customer   updteCustomer(Customer cust);
	  public Customer  getCustomer(String uname,String pwd);
	  public List<Customer> getAllCustomers ();
	  
	  

}
