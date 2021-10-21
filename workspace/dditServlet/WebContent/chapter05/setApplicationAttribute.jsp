<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String name = request.getParameter("name");
String value = request.getParameter("value");
//name : a001 , value : 김은대
application.setAttribute(name, value);
%>    
<!DOCTYPE html>
<html>
<head>
<title>application 속성 지정</title>
</head>
<body>
application 기본 객체의 속성 설정 : 
<%=name %> = <%=value %>
<br>
<input type="button" id="btn" value="application의  attribute 보기" onclick="javascript:location.href='viewApplicationAttribute.jsp'">
</body>
</html>