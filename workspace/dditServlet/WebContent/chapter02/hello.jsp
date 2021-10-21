<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>헬로 jsp</title>
</head>
<body>
<% // 스크립트 릿 (< % % > 변수선언)
	String str = "헬로jsp!!";
%>
<!-- 표현식(< %= %>) ㅣ 화면 출력-->
<h2><%=str %></h2>

</body>
</html>