/**
 * 
 */
package com.garg.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Orange PC
 *
 */
public class JDBCUtil {
	
	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/test";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";

	public static Connection  getConnection() {
		Connection con = null;
		
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName(JDBC_DRIVER);
		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      con = DriverManager.getConnection(DB_URL,USER,PASS);
		   } catch (Exception e) {
			// TODO: handle exception
		}

		return con;
	}
	public static void main(String[] args) {
		Connection con = getConnection();
		System.out.println("con ="+con);
	}
	
	public static void closeConnection(Connection con) {
		if (con != null) {
			try {
				con.close();
				con.rollback();
			} catch (SQLException e) {
				System.out.println(e);
			}
			
		}
	}
}
