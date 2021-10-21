<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Calendar cal = Calendar.getInstance();
%>    
<!DOCTYPE html>
<html>
<head>

<title>calender 클래스 사용</title>
</head>
<body>
<!-- 
완전한 클래스 이름을 사용해도 JSP페이지가 올바르게 실행됨.
but, 번거롭다.
따라서, import 속성을 사용하기.
 -->
오늘은
<%=cal.get(Calendar.YEAR) %>년
<%=cal.get(Calendar.MONTH)+1 %>월
<%=cal.get(Calendar.DATE) %>일
</body>
</html>