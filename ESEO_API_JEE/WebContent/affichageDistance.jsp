<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Distance entre les deux villes : </title>
</head>
<body>
	distance
	<% String distance = request.getSession().getAttribute("distance").toString(); %>
	<%=distance %>
</body>
</html>