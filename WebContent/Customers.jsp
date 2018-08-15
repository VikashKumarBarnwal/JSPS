<%@page import="com.garg.model.Customer"%>
<%@page import="java.util.List"%>
<%@ taglib  prefix="c"   uri="http://java.sun.com/jstl/core"  %>
<%@page session="true"  language="java" isThreadSafe="true" %>

<html>
<head><title>First JSP</title></head>
<body>
    <table border="1" width="50%" > 
    <% List<Customer> list = (List)request.getAttribute("custs");
     
       for (Customer cus : list) {
    %>
      
     <tr style="text-align=left">
    	    <td align="center">
                 <input type="radio" name="custId" value=<%=cus.getCustId()%> />
            </td>
    	    <td><%=cus.getUserName()%></td>
    	    <td><%=cus.getEmail()%></td> 
    	    <td> <%=cus.getCity()%></td>
    	    <td><%=cus.getMobile()%></td>
      </tr>	   
    <%	   
       }
    %>
    </table>
<!-- <tr>
<td>

<input type="submit" name="update" value="update"></td>

</tr>
<td><input type="submit" name="delete" value="delete"></td></tr>
</tr>
</table> -->
    
</body>
</html>
