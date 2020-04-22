<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Counter</title>
	</head>
	<body>
		<h2>You have visited https://localhost:8080/ <c:out value="${counter}"></c:out> times.</h2>
		<a href="/">Test another visit</a>
		<a href="/reset">Reset counter</a>
	</body>
</html>