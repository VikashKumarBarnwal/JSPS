/**
 * 
 */
package com.garg.service;

import java.util.List;

import com.garg.dao.RegistrationDao;
import com.garg.dao.RegistrationDaoImpl;
import com.garg.model.Customer;

/**
 * @author Orange PC
 *
 */
public class RegistrationServiceImpl implements RegistrationService {

	public RegistrationServiceImpl() {
		registrationDao = new RegistrationDaoImpl();
	}


	RegistrationDao   registrationDao;
	
	@Override
	public int registerCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return registrationDao.registerCustomer(cust);
	}

	
	@Override
	public String deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Customer updteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public Customer getCustomer(String uname,String pwd) {
		// TODO Auto-generated method stub
		return registrationDao.getCustomer(uname, pwd);
	}

	
	@Override
	public List<Customer> getAllCustomers() {
		return registrationDao.getAllCustomers();
	}

}
