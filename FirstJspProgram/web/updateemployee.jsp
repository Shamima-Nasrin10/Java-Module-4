<%-- 
    Document   : updateemployee
    Created on : Jul 2, 2024, 5:28:55 PM
    Author     : Admin
--%>

<jsp:useBean class="model.Employee" id="e"/>
<%@page import="dao.EmployeeDao" %>
<jsp:setProperty name="e" property="*"/>

<%
EmployeeDao.updateEmployee(e);

   response.sendRedirect("viewallemployee.jsp");

%>
