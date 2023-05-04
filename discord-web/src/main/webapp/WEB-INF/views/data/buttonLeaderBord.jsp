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

	<h1>역행마편</h1>

	<c:forEach items="${leaderBordInfo}" var="chacking" varStatus="status">
	
		<c:choose>
			<c:when test="${status.index == 0}">
				<h1 align="center">
					1등!!! || 유저 이름 : ${chacking.uname} || 클릭 횟수 : ${chacking.click_count} 
				</h1>
			</c:when>
			
			<c:when test="${status.index == 1}">
				<h2 align="center">
					2등! || 유저 이름 : ${chacking.uname} || 클릭 횟수 : ${chacking.click_count} 
				</h2>
			</c:when>
			
			<c:when test="${status.index == 2}">
				<h3 align="center">
					3등 || 유저 이름 : ${chacking.uname} || 클릭 횟수 : ${chacking.click_count} 
				</h3>
			</c:when>
		
			<c:otherwise>
				<div align="center"> 유저 이름 : ${chacking.uname} || 클릭 횟수 : ${chacking.click_count}</div> <dr>
			</c:otherwise>
		</c:choose>
	</c:forEach>

	<h3>위의 기능은 해당 봇을 사용하여 사용이 가능 합니다</h3>

	<a href="${pageContext.request.contextPath}/data/mainPage" align="center">돌아가기</a>
</body>
</html>