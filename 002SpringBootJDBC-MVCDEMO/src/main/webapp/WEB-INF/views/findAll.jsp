<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All Employees</h1>
<hr>
	<table border="1px;">
		<tr>
			<th>Eid</th>
			<th>Ename</th>
			<th>Esal</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		
		<c:forEach items="${employees}" var="employee">
		<tr>
			<td><c:out value="${employee.eid}"></c:out></td>
			<td><c:out value="${employee.ename}"></c:out></td>
			<td><c:out value="${employee.esal}"></c:out></td>
			<td><a href="./deleteEmpById?eid=${employee.eid}">Delete</a></td>
			<td><a href="./updateEmpById?eid=${employee.eid}">Update</a></td>
		</tr>
		
		</c:forEach>

	</table>
	<a href="./addEmpForm">Add Employee</a> 
</body>
</html>