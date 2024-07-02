<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="model.Employee" %>
<%@page import="dao.EmployeeDao" %>
<%@page import="java.util.*" %>

<%
List<Employee> empList=EmployeeDao.viewAllEmployee();
request.setAttribute("empList",empList);

%>

<table border="1">

        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Address</th>
                <th>Action</th>
    
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${empList}" >
            <tr>
                <td>${employee.getId()}</td>
                <td>${employee.getName()}</td>
                <td>${employee.getEmail()}</td>
                <td>${employee.getAddress()}</td>
                <td>
                    <a href="updateemployeeform.jsp?id=${employee.getId()}">Edit</a>
                    <a href="deleteemployee.jsp?id=${employee.getId()}">Delete</a>
                </td>
            </tr>
            </c:forEach>

        </tbody>

    </table>
