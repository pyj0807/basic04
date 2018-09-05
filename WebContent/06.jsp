<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="beans.*" %>
<%@ page import="java.util.*" %>
<%
	SampleDao sdao = new SampleDao();
	Map p = new HashMap();
	p.put("serial", "03fe2f19");
	p.put("player", "박영준");
	p.put("tried", 3);
	p.put("elapsed", 6.15451);
	int r  = sdao.addBaseResult(p);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mybatis</title>
</head>
<body>
	<h2>마이바티스를 통한 작업</h2>
	<p>
		insert 결과 : <%=r %>
	</p>
</body>
</html>


