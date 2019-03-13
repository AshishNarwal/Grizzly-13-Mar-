<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<title>Login Page</title>

</head>
<body>
<div class="container text-center">
        <h1>Login</h1>
        <img src="webapp/WEB_INF/images/logingrizzly.jpg"   width=100%  ><br>
        <form action="login.html" method="post">
            <div class="form-group">
                <label for="userName">Username</label>
                <input type="text" name="userName" id="userName" class="form-control">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" name="password" id="password" class="form-control">
            </div> 
            <input type="submit" value="Login" class="btn btn-success">
        </form>
    </div>
</body>
</html>