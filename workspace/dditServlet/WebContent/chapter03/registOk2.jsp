<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("memId")==null?"":request.getParameter("memId");
String name= request.getParameter("memName")==null?"":request.getParameter("memName");
String gender = request.getParameter("memGen")==null?"":request.getParameter("memGen");
String age = request.getParameter("memAge")==null?"":request.getParameter("memAge");
  
%>   
<!DOCTYPE html>
<html>
<head>
<title>ok</title>
</head>
<body>
<%-- 이름 : <%=session.getAttribute("name") %> --%>
<%-- 아이디 : <%=session.getAttribute("id") %> --%>
<%-- 성별 : <%=session.getAttribute("gender") %> --%>
<%-- 이름 : <%=session.getAttribute("age") %> --%>
아이디 : <%=id %><br>
이름 : <%=name %><br>
성별 : <%=gender %><br>
나이 : <%=age %><br>
</body>
</html>