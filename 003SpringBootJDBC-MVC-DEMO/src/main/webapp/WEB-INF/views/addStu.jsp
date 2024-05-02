<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Add Student</h1>

	<hr>
	<form action="/saveStu" method="post">
		<table>
			<tr>
				<td>Sid :</td>
				<td><input type="text" name="sid"></td>
			</tr>
			<tr>
				<td>Sname :</td>
				<td><input type="text" name="sname"></td>
			</tr>
			<tr>
				<td>Sfee :</td>
				<td><input type="text" name="sfee"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Save"></td>
				<td><input type="reset" name="Reset"></td>
			</tr>
		</table>
		<a href="./findAllStu">All Students</a>
	</form>

</body>
</html>