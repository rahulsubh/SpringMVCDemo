<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>

	<form action="process" method = "post">
	
		<table>
		
			<tr>
				<td>Name</td>
				<td><input type = "text" name = "sName"/></td>
			</tr>
			
			<tr>
				<td>RollNo</td>
				<td><input type = "number" name = "sRollNo"></td>
			</tr>
			
			<tr>
				<td>Department</td>
				<td><input type = "text" name = "sDept"></td>
			</tr>
			
			<tr>
				<td><input type = "submit" /></td>
			</tr>
			
			
		
		</table>
	
	</form>

</body>
</html>