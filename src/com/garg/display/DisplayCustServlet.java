package com.garg.display;

import java.io.IOException;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
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

/**
 * Servlet implementation class RegServlet
 */


public class DisplayCustServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	RegistrationService registrationService;
       
    ServletConfig servletConfig;
    public DisplayCustServlet() {
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
       
       Customer cust1 = new Customer("vikash","vks@gmail.com", "bangalore","12345","vks","abc");
       Customer cust2 = new Customer("vikash2","vks@gmail.com2", "bangalore2","12345111","vks2","abc");

		List<Customer>  custs =new ArrayList<Customer>();//registrationService.getAllCustomers();
		custs.add(cust1);
		custs.add(cust2);
		request.setAttribute("custs", custs);
	    RequestDispatcher rd = request.getRequestDispatcher("displayCustomer.jsp");
		
		//response.sendRedirect("www.google.com");
		rd.forward(request, response);
		
		
	     
	}

	public void delete() {
		// TODO Auto-generated method stub
	}
	
	
}
