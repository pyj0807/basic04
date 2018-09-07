<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 사용자자가 이 페이지를 요청하게 될때,
	// 어떤쿠키들을 가지고 왔고, 해당쿠키등 가지고 있는 데이터(백류)를 학인해야 된다면,
	// request 객체를 이용해서 작업
	Cookie[] ar = request.getCookies();	// 사용자가 가지고 온 쿠키들이 배열로 확보 된다
	
	// 사용자측으로부터 전달받은 쿠키가 없다며 null이 나옴
	if(ar != null){
		System.out.println("전달받은 쿠키 개수 : "+ar.length);
		for(int i=0; i<ar.length; i++){
			Cookie c = ar[i];	// 변수로 받아서 제어하나 ar[i]를 직접제어하나 같아
			System.out.println(i+"번째 쿠키 분석");
			String name = c.getName();
			String value = c.getValue();
			String path = c.getPath();	// -톰캣기준
			String domain = c.getDomain();	// X 데이터가 안나옴 - 톰캣기준
			int maxage = c.getMaxAge();	// X 데이터가 안나옴 - 톰캣기준
			System.out.println("->" + name+"/"+value+"/"+path+"/"+domain+"/"+maxage);
		}
	}else{
		System.out.println("전달받은 쿠키 개수 : 0");
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키</title>
</head>
<body>
	<h2>쿠키확보</h2>
	<p>
		사용자가 요청을 보낼깨, 브라우저는 해당 서버측으로 보내야될 쿠키를 알아서 같이 전송을 시켜준다.<br/>
		서버측에서서는 클라이언트측으로 전달받은 쿠키를 request 객체로부터 배열로 확보해서 처리가 가능하다
	</p>
	<p>
		주이해야되는 점은,<br/> 
		사용자가 전달한 쿠키가 하나도 없다면 WAS는 배열을 null로 리턴하기 때문에, 무조건
		반복을 돌려서 처리하면 안된다는것과,<br/>
		특정쿠키를 사용자가 가지고 왔는지, 가지고 왔다면 해당 쿠키에 설정된 값이 무엇인지 확인하기 위해서는
		배열을 돌려서 일일이 찾아야 한다는 것이다.
	</p>
</body>
</html>