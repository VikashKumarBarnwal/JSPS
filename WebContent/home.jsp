<%@page import="com.garg.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style ="color: yellow;">
   Welcome : <%= request.getAttribute("custName")%>
<form action ="Registeration.hello" method="post">
<table style ="background-color: lightgreen; margin-left: 20px;margin-left: 20px">
<tr>
<td><h3 Style ="color: red">Home page !!!</h3> </td>
<td></td>
</tr>
<tr><td><input type="Submit" name = "operation" value ="DisplayCustomers"></td>
</table>
</form>

</body>
</html>