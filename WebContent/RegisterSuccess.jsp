<%@page import="com.garg.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <h1>Registration Success<h1>
   <% Customer cust = (Customer)request.getAttribute("cust")
   
   
   %>
   
   
   Customer Id  : <%= cust.getCustId()%><br>
   UserName     : <%= cust.getCustomerName()%><br>
   password     : <%= cust.getPassword()%><br>
   Mobile No    : <%= cust.getMobile()%><br>
   Email        : <%= cust.getEmail()%><br>
   City         : <%= cust.getCity()%><br>

</body>
</html>