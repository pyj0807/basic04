<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebApp</title>
</head>
<body>
	<h2>session!</h2>
	<p>
		your session destoryed.!
	</p>
</body>
</html>
<%
	session.invalidate();
%>
