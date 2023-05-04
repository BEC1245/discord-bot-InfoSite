<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>

<body>
 <h1 align="left">역행마편 창에 오신걸 환영합니다</h1>
 <c:forEach	items="${input}" var="list">
 	<span> 전송한 유저 ${list.uname}|  전달받은 유저 ${list.resiver}</span> <br>
 	<span>   내용: ${list.wisper}</span> <br><br>
 </c:forEach>
 
 <h4>역행마편은 해당 봇의 명령어 기능중 하나로</h4>
<h4>자신에게 보내진 내용을 제외하고 전송및 받은 사람의 정보를 가져올 수 있습니다</h4>
	
<h4>위의 정보는 해당 봇을 사용하여 작성이 가능 합니다</h4>
 
<a href="${pageContext.request.contextPath}/data/mainPage" align="center">돌아가기</a>
 
</body>

</html>