<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html style = "background-color: teal">
	<head>
		<meta charset="UTF-8">
		<title>Welcome to (insert title here)!</title>
	</head>

	<body class = "bodyClass">
		<h1 style="font-family: Calibri">Login</h1>
    <form action = "Controller.java" method = "POST">
    <input type = "hidden" name = "command" value = "LOGIN">
	    <table align = "center">
	    <tr>
	      	<td style = "font-family: Calibri"><strong>Email: </strong></td>
	        <td><input type = "text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        </tr>  
        <tr>
        	<td style = "font-family: Calibri"><strong>Password: &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</strong></td>
        	<td><input type = "text">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        </tr>
        <tr>
        	<td><input type = "submit" value = "Log In"></td>
        </tr>
	    </table>
    </form>

	</body>

  <style>
    .bodyClass{
      text-align: center;
      border: solid black 5px;
      background-color: gold;
      margin-right: 250px;
      margin-left: 250px;
      padding: 20px;
    }
  </style>

</html>
