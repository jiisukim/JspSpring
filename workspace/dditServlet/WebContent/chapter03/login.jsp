<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//삼항 연산자 사용해 request.getParameter의 Null을 체크함
	String id = request.getParameter("memberId")==null?"":request.getParameter("memberId");
if(id.equals("ddit")){
// 	String name = request.getParameter("name")==null?"없다":request.getParameter("name");
	String name = "개똥이";
	String encodeName = URLEncoder.encode(name,"UTF-8");
	
	
	response.sendRedirect("/chapter03/index.jsp?name="+ encodeName);
}else{
	
%>
<!DOCTYPE html>
<html>
<head>
<title>로그인 실패</title>
</head>
<body>
아이디가 ddit가 아닙니다.
</body>
</html>
<%
}
 %>