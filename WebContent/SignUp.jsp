<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   <head>
     <meta charset="UTF-8">
     <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
     <title>Sign Up</title>
   </head>

   <body>
     <div class="container">
       <h1>Sign Up</h1>
       <form action="Controller" method="POST">
         <input type="hidden" name="command" value="SIGNUP">
         <div class="form-group">
           <label>First Name: <input class="form-control" type="text" name="first-name" required></label>
         </div>
         <div class="form-group">
           <label>Last Name: <input class="form-control" type="text" name="last-name" required></label>
         </div>
         <div class="form-group">
           <label>Email: <input class="form-control" type="email" name="email" required></label>
         </div>
         <div class="form-group">
           <label>Password: <input class="form-control" type="password" name="password" required></label>
         </div>
         <div class="form-group">
           <label>Confirm Password: <input class="form-control" type="password" name="password"></label>
         </div>
         <div class="form-group">
           <button class="btn btn-primary" type="submit">Sign Up</button>
           Already have an account? <a href="Login.jsp">Login</a>
         </div>
       </form>
      </div>
     </body>
</html>
