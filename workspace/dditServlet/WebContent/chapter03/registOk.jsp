<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
String id = request.getParameter("memId")==null?"":request.getParameter("memId");
String name= request.getParameter("memName")==null?"":request.getParameter("memName");
String gender = request.getParameter("memGen")==null?"":request.getParameter("memGen");
String age = request.getParameter("memAge")==null?"":request.getParameter("memAge");


String encodeId = URLEncoder.encode(id,"UTF-8");
String encodeName = URLEncoder.encode(name,"UTF-8");
String encodeGen = URLEncoder.encode(gender,"UTF-8");
String encodeAge = URLEncoder.encode(age,"UTF-8");
%>   
<!DOCTYPE html>
<html>
<head>
<title>ok</title>
</head>
<body>

<%
// session.setAttribute("name", name);
// session.setAttribute("id", id);
// session.setAttribute("gender", gender);
// session.setAttribute("age", age);
response.sendRedirect("/chapter03/registOk2.jsp?memId="+encodeId+"&memName="+encodeName+"&memGen="+encodeGen+"&memAge="+encodeAge);
%>
</body>
</html>