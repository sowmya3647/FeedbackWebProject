<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center><div class="container"
		style="width: 30%; box-shadow: 10px 10px 8px 10px black; box-shadow: 1px 0px 7px 3px black; margin-top: 28px; border: 1px solid black;">
		<center>
			<h1 style="color: blue; font-family: Helvetica Neue">LOGIN</h1>
		</center>
		<form action="RetriveJobServlet?username&password" method="get">
			<h3>Username:</h3>
			<input id="username" type="text" name='username' required></input>

			<h3>Password:</h3>
			<input id="password" type="password" name='password' required></input>
			<button text-align:right type="submit" class="btn btn-dark">signin</button>
			</form>
			</div>
			</center>
</body>
</html>