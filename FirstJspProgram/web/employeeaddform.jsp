<%-- 
    Document   : employeeaddform
    Created on : Jul 1, 2024, 3:37:33 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Employee Form</h1>
        <form action="saveemployee.jsp" method="POST">
            
            Name: <input type="text" name="name"> <br><br>
            Email: <input type="email" name="email"> <br><br>
            Address: <input type="text" name="address"> <br><br>
            
            <input type="submit" value="Save">
            
        </form>
    </body>
</html>
