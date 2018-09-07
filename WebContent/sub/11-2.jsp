<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	if(request.getCookies()!=null){
		Cookie[] ar = request.getCookies();
		for(int i=0; i<ar.length; i++){
			if(ar[i].getName().equals("fast"))
				out.println("fast 쿠키 발견");
				break;
		}
	}

%>