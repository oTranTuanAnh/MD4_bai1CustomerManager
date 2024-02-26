<%@ page import="com.example.customermanagement.model.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2/1/2024
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<h1>Customers</h1>
<p>
    <a href="/customer?action=create">Create new customer</a>
</p>
<%
    List<Customer> customers = (List<Customer>) request.getAttribute("customer");
%>
...
There are <%= customers.size() %> customer(s) in list.
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Address</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="c" items="${requestScope.customer}">
        <tr>
            <td>
                <c:out value="${c.id}"/>
            </td>
            <td>
                <a href="customer?id=${c.id}">${c.name}</a>
            </td>
            <td>
                <c:out value="${c.email}"/>
            </td>
            <td>
                <c:out value="${c.address}"/>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
