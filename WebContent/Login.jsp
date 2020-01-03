<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/login-style.css">
		<title>Welcome to (insert title here)!</title>
	</head>

	<body>
	    <div>
	      <h1>Login</h1>
	      <form action="Controller" method="POST">
	        <label>Email: <input type="email" name="email" required></label>
          <br>
	        <label>Password: <input type="password" name="password" required></label>
          <br>
          <br>
          <div class="buttons">
            <input type="submit" value="Login">
            <button><a href="SignUp.jsp">Sign Up</a></button>
          </div>
	      </form>
	    </div>

	</body>
</html>
