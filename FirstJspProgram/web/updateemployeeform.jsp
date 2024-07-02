<%-- 
    Document   : updateemployeeform
    Created on : Jul 2, 2024, 5:11:15 PM
    Author     : Admin
--%>
<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>
<%

String id=request.getParameter("id");
Employee e=EmployeeDao.getById(Integer.parseInt(id));

%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee Update Form</h1>
        <form action="updateemployee.jsp" method="post">
            
            <input type="hidden" name="id" value="<%=e.getId()%>">
            
            Name: <input type="text" name="name" value="<%=e.getName()%>"> <br><br>
            Email: <input type="email" name="email" value="<%=e.getEmail()%>"> <br><br>
            Address: <input type="text" name="address" value="<%=e.getAddress()%>"> <br><br>
            
            <input type="submit" value="Update">
            
        </form>
    </body>
</html>
