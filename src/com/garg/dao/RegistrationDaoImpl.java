/**
 * 
 */
package com.garg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import com.garg.connection.JDBCUtil;
import com.garg.model.Customer;

/**
 * @author Orange PC
 *
 */
public class RegistrationDaoImpl implements RegistrationDao {

	
	public RegistrationDaoImpl() {
		
		
	}


	@Override
	public int registerCustomer(Customer cust) {
		// TODO Auto-generated method stub
		// String custId = "";
		PreparedStatement ps = null;
		Connection con = null;
        //int custId = (int) Math.random()+100;
        int custId = ThreadLocalRandom.current().nextInt();
		String email = cust.getEmail();
		String city = cust.getCity();
		String cname = cust.getCustomerName();
		String mobile = cust.getMobile();
		String password = cust.getPassword();
		
		String sql = "insert into customer values ('"+custId+"','"+cname+"','"+email+"','"+mobile+"','"+city+"','"+password+"')";
		try {
			 con = JDBCUtil.getConnection();
			 ps = con.prepareStatement(sql);
			 ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
			
			

		}finally {
			JDBCUtil.closeConnection(con);
		}
		return custId;
	} 

	
	@Override
	public boolean deleteCustomer(int custId) {
				PreparedStatement ps = null;
				Connection con = null;
				boolean deltedec =false;
		        
				
				String sql = "delete customer where custId ='"+custId+"'";
				try {
					 con = JDBCUtil.getConnection();
					 ps = con.prepareStatement(sql);
					  deltedec = ps.execute();
				} catch (SQLException e) {
					e.printStackTrace();
					
					

				}finally {
					JDBCUtil.closeConnection(con);
				}
       
		
		
		
		return deltedec;
	}

	
	@Override
	public Customer updteCustomer(Customer cust) {
		
		return null;
	}

	
	@Override
	public Customer getCustomer(String uname, String pwd) {
		Customer cust = new  Customer();
		PreparedStatement ps = null;
		Connection con = null;
		String sql = "select * from customer where customerName ='"+uname+"' and password = '"+pwd+"'";
		try {
			 con = JDBCUtil.getConnection();
			 ps = con.prepareStatement(sql);
			 ResultSet resultSet = ps.executeQuery();
			 int columnNbr = 0;
			 if(resultSet.next()) {
				System.out.println("Creating  result...");
				int custId = resultSet.getInt(++columnNbr);
                String cname = resultSet.getString(++columnNbr);
        		String email = resultSet.getString(++columnNbr);
        	    String mobile = resultSet.getString(++columnNbr);
        		String city = resultSet.getString(++columnNbr);
        	    String password = resultSet.getString(++columnNbr);
	           cust = new Customer(String.valueOf(custId) ,cname, email, city, mobile, password);
			 }       
		} catch (SQLException e) {
			e.printStackTrace();

		}finally {
			JDBCUtil.closeConnection(con);
		}
		return cust;
	}

	
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer>  custs = new ArrayList<Customer>();
		
		PreparedStatement ps = null;
		Connection con = null;
		String sql = "select * from customer";
		try {
			 con = JDBCUtil.getConnection();
			 ps = con.prepareStatement(sql);
			 ResultSet resultSet = ps.executeQuery();
			 System.out.println("Creating  result...");
			 while (resultSet.next()) {
	                int custId = resultSet.getInt(1);
	                String cname = resultSet.getString(2);
	        		String email = resultSet.getString(3);
	        	    String mobile = resultSet.getString(4);
	        		String city = resultSet.getString(5);
	                Customer c = new Customer(String.valueOf(custId) , cname, email, city, mobile,null);
	                custs.add(c);
	            }
			 
		} catch (SQLException e) {
			e.printStackTrace();
			
			

		}finally {
			JDBCUtil.closeConnection(con);
		}
		return custs;
	}

}
