/**
 * 
 */
package com.garg.model;

/**
 * @author Orange PC
 *
 */
public class Customer {
	
	private String custId;
	private String customerName;
	private String email;
	private String city;
	private String mobile;
	private String userName;
	private String password;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String custId ,String customerName, String email, String city, String mobile, String password) {
		super();
		this.customerName = customerName;
		this.email = email;
		this.city = city;
		this.mobile = mobile;
		this.userName = userName;
		this.password = password;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	
	
	

}
