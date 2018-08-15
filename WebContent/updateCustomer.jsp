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
<% Customer cust = (Customer)request.getAttribute("cust");
   
   
   %>
   
   
   Customer Id  : <%= cust.getCustId()%>
<form action ="Registeration.hello" method="post">
<table style ="background-color: lightgreen; margin-left: 20px;margin-left: 20px">
<tr>
<td><h3 Style ="color: red">UpdateCustomer !!!</h3> </td>
<td></td>
</tr>
<tr><td><%=cust.getUserName()%></td></tr>
<tr><td><%=cust.getEmail()%></td></tr> 
<tr><td> <%=cust.getCity()%></td></tr>
<tr><td><%=cust.getMobile()%></td></tr>

<tr><td><input type="Submit" name = "submit" value ="update"></td>
</table>
</body>
</html>