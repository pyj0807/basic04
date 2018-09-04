<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String s = request.getParameter("search");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Web APP</title>
</head>
<body>
	<h2>EventListenee.!</h2>
	<p>
		search param's value is <%=s %> (<%=application.getAttribute("r") %>)
	</p>
</body>
</html>