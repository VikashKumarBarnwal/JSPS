package com.garg.ragister;

import java.io.IOException;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.SingleThreadModel;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.garg.connection.JDBCUtil;
import com.garg.model.Customer;
import com.garg.service.RegistrationService;
import com.garg.service.RegistrationServiceImpl;
import com.garg.util.Constants;

/**
 * Servlet implementation class RegServlet
 */


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	RegistrationService registrationService;
       
    ServletConfig servletConfig;
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
       this.servletConfig = config;
       registrationService = new RegistrationServiceImpl();
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String process = servletConfig.getInitParameter("Process");
        ServletContext servletContext = servletConfig.getServletContext();	
        String appName = servletContext.getInitParameter("AppName");
        
        String operation = request.getParameter("operation");
        
        
		
		if(operation.equals(Constants.LOGIN)) {
			String userName = request.getParameter("uname");  
			String password = request.getParameter("pwd"); 
		Customer cust = registrationService.getCustomer(userName,password);
		 if(cust!=null) {
		   request.setAttribute("custName",cust.getCustomerName());
		   RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
		   rd.forward(request, response);
		 }
		}else if(operation.equals("register")) {
			String customerName = request.getParameter("uname");
    		String password = request.getParameter("pwd");
    		String mobile = request.getParameter("mobile");
    		String email = request.getParameter("email");
    		String city = request.getParameter("city");
    		Customer cust = new Customer(null,customerName,email,city,mobile,password);
    		int custId =registrationService.registerCustomer(cust);
    		cust.setCustId(String.valueOf(custId));
    		request.setAttribute("successMessage", "Registration done,please login to continue");
    		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
    		rd.forward(request, response);
		}
    	else if(operation.equals("DisplayCustomers")) {
    		List<Customer> cust= registrationService.getAllCustomers();
    		request.setAttribute("cust", cust);
    		RequestDispatcher rd = request.getRequestDispatcher("Customers.jsp");
    		rd.forward(request, response);
    	}
    	else if(operation.equals("update")) {
    		String customerName = request.getParameter("uname"); 
    		String password = request.getParameter("pwd");
    		String mobile = request.getParameter("mobile");
    		String email = request.getParameter("email");
    		String city = request.getParameter("city");
    		Customer cust = new Customer(null,customerName,email,city,mobile,password);
    		Customer cust1 = registrationService.updteCustomer(cust);
    		RequestDispatcher rd = request.getRequestDispatcher("updateCustomer.jsp");
    	}
    	else if(operation.equals("delete")) {
    		
    	}
    	else {
			request.setAttribute("message","Data Not found,click on Register");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
			
        
        
        
        
        if (Constants.DISPLAY_ALL.equals(operation)) {
        	
        }
		
		
		
		
		
		
		
		
		
		
		
	     
	}

	public void delete() {
		// TODO Auto-generated method stub
	}
	
	
}
