<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
	<h1>환영합니다 ${userInfo.uname}이시여!!</h1>
	<h3>디스코드 활동 기록은 아래에 있습니다!!</h3>

	<hr>
	
	<h3>지금까지 눌렀던 버튼의 개수 입니다!</h3>
	<h4>${userInfo.click_count}</h4>
		
	<hr>
	
	<h3>지금까지 입력했던 채팅의 총 개수 입니다!</h3>
	<h4>${userInfo.chat_count}</h4>
	
	<hr>
	
	<a href="${pageContext.request.contextPath}/data/wisperList">현 역행마편 로그 보기!</a> <br>
	<a href="${pageContext.request.contextPath}/data/buttonLeaderBord">현 버튼 누르기 리더보드 보기!</a> <br>
	<a href="${pageContext.request.contextPath}/login">로그아웃</a> <br>

</body>

</html>