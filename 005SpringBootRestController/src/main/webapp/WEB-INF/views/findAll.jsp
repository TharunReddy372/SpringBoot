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
<h1>All Students</h1>

<hr>

<table border="1px;">
<tr>
<th>Sid</th>
<th>Sname</th>
<th>Sfee</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach items="${students}" var="student">
		<tr>
			<td><c:out value="${student.sid}"></c:out></td>
			<td><c:out value="${student.sname}"></c:out></td>
			<td><c:out value="${student.sfee}"></c:out></td>
			<td><a href="./deleteStuById?sid=${student.sid}">Delete</a></td>
			<td><a href="./updateStuById?sid=${student.sid}">Update</a></td>
		</tr>
		
		</c:forEach>

	</table>
	<a href="./addStuForm">Add Student</a> 
</body>
</html>