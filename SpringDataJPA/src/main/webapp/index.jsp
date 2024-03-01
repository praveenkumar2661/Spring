<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CRUD-SpringDataJPA</title>
</head>
<body>
	<form action="add" method="post"><b>Add User</b>
    <table>
        <tr>
            <td>MailID</td>
            <td><input type="email" name="mail"></td>
        </tr>
        <tr>
            <td>Password</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
        	<td><button>Submit</button></td>
        </tr>
    </table>
</form>
<br><br>
<form action="findUser" method="post"><b>Find User</b>
    <table>
        <tr>
            <td>Enter the MailID</td>
            <td><input type="email" name="mail"></td>
            <td><button>Search</button></td>
        </tr>
    </table>
</form>

<br><br>
<form action="removeUser" method="post"><b>Remove User</b>
    <table>
        <tr>
            <td>Enter the MailID</td>
            <td><input type="email" name="mail"></td>
            <td><button>Remove</button></td>
        </tr>
    </table>
</form>
<br><br>
<form action="updateUser" method="post"><b>Update User</b>
    <table>
        <tr>
            <td>Enter MailID</td>
            <td><input type="email" name="mail"></td>
        </tr>
         <tr>
            <td>Enter New MailID</td>
            <td><input type="email" name="newmail"></td>
        </tr>
        <tr>
            <td>Enter New Password</td>
            <td><input type="password" name="newpassword"></td>
        </tr>
        <tr>
        	<td><button>Submit</button></td>
        </tr>
    </table>
</form>
<br>
<br>
<form action="findAll" method="post">
	<button>Find All</button>
</form>


</body>
</html>