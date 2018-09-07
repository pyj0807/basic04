<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Cookie[] ar = request.getCookies();
	String value = null;
	if(ar != null){
		for(int i=0; i<ar.length; i++){
			if(ar[i].getName().equals("season")){
				URLDecoder.decode(ar[i].getValue(), "HTF-8");
				value = ar[i].getValue();				
			}
		}
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>
		가져온 season : <%=value %>
	</p>
	<p>
		<%if(value == null){ %>
			당신이 가지고 온 쿠키중엔 season은 없습니다
		<%}else{%>
			당신의 season 쿠키를 가지고 왔고, 값은 <%=value%>였다
		<%} %>
	</p>
</body>
</html>