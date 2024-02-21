<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Welcome Praveen!!!<br><br>
<!-- <form action="add" method="post"> -->
<!-- Enter the 1st number:<input type="number" name="num1"><br><br> -->	
<!--	Enter the 2nd number:<input type="number" name="num2"><br><br> -->
<!--	<button>Submit</button> -->
<!-- </form> -->

<form action="addUser" method="post">
	ID: <input type="number" name="id"><br><br>
	Name: <input type = "text" name = "name"><br><br>
	Contact: <input type="number" name="contact"><br><br>
	<button>Submit</button>
</form>

</body>
</html>