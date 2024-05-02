<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Update Student</h1>

	<form action="./updateStu" method="post">
		<table>
			<tr>
				<td>Sid :</td>
				<td><input type="text" name="sid" value="${student.sid}"
					readonly="readonly"></td>
			</tr>
			<tr>
				<td>Sname :</td>
				<td><input type="text" name="sname" value="${student.sname}"></td>
			</tr>
			<tr>
				<td>Sfee :</td>
				<td><input type="text" name="sfee" value="${student.sfee}"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
		<a href="./findAllStu">All Students</a>

	</form>

</body>
</html>