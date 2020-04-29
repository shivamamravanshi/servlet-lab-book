<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show Date</title>
</head>
<body>
	<a href="Date">Show Date</a>
	<button onclick="window.location.href='Date'">Show Date</button>
	<br>
	<% if (request.getParameter("date") != null) { %>
	<h4>Today is
	<%=request.getParameter("date")%></h4>
	<% } %>
</body>
</html>