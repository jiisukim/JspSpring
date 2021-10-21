<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	response.addCookie(
		Cookies.createCookie("id", "ddit", "/", -1)
	);
%>    
<!DOCTYPE html>
<html>
<head>
<title>Cookies 클래스 사용 예 </title>
</head>
<body>
<a href="/chapter09/readCookieUsingCookies.jsp">보기</a>
</body>
</html>