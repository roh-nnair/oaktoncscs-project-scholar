<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
     <meta charset="UTF-8">
     <title>Sign Up</title>
   </head>

   <body>
     <h1>Sign Up</h1>
     <form action="Controller" method="POST">
       <input type="hidden" name="command" value="SIGNUP">
        <br>
       <input type="hidden" name="command" value="LOGIN">
       <label>First Name: <input type="text" name="first-name" required></label>
       <br>
       <label>Last Name: <input type="text" name="last-name" required></label>
       <br>
       <label>Email: <input type="email" name="email" required></label>
       <br>
       <label>Password: <input type="password" name="password" required></label>
       <br>
       <label>Confirm Password: <input type="password" name="password"></label>
       <br>
       <button type="submit">Sign Up</button>
     </form>
   </body>
</html>
