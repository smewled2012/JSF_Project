<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringBoot Web Application</title>
</head>


<body>
	<h1>Welcome to the SpringBoot Web Application</h1>

	<h2>My facebook page</h2>
	<br>
	<a href ="https://www.facebook.com/semeneh.mewled"> Click here to see my facebook page</a>
	<br>
	<hr>
	<br>
	<h3>Registration Form </h3>
	
	<form action="action">
		Id:<br>
		<input type= "text" name = "id">
		<br>
		First Name:<br>
		<input type ="text" name = "firstname" >
		<br>
		Last Name:<br>
		<input type ="text" name ="lastname" >
		<br>
		Email:<br>
		<input type="text" name = "email">
		<br>
		Password:<br>
		<input type ="text"  name= "password">
		<br>
		<br>
		<input type="submit" value ="Submit">
	
	</form>

</body>
</html>