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
 <h1 align="left">���ึ�� â�� ���Ű� ȯ���մϴ�</h1>
 <c:forEach	items="${input}" var="list">
 	<span> ������ ���� ${list.uname}|  ���޹��� ���� ${list.resiver}</span> <br>
 	<span>   ����: ${list.wisper}</span> <br><br>
 </c:forEach>
 
 <h4>���ึ���� �ش� ���� ��ɾ� ����� �ϳ���</h4>
<h4>�ڽſ��� ������ ������ �����ϰ� ���۹� ���� ����� ������ ������ �� �ֽ��ϴ�</h4>
	
<h4>���� ������ �ش� ���� ����Ͽ� �ۼ��� ���� �մϴ�</h4>
 
<a href="${pageContext.request.contextPath}/data/mainPage" align="center">���ư���</a>
 
</body>

</html>