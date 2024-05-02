<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Employee</h1>
<hr>
<form action="./updateEmp" method="post">
<table>
   <tr>
   		<td>Eid : </td>
   		<td><input type="text" name="eid" value="${employee.eid}" readonly="readonly"></td>
   </tr>
   <tr>
   		<td>Ename : </td>
   		<td><input type="text" name="ename" value="${employee.ename}"></td>
   </tr>
	<tr>
   		<td>Esal : </td>
   		<td><input type="text" name="esal" value="${employee.esal}"></td>
   </tr>
   <tr>
   		<td><input type="submit" value="Update"></td>
   		<td><input type="reset" value="Reset"></td>
   </tr>
</table>
<a href="./findAllEmp">All Employees</a>
</form>
</body>
</html>