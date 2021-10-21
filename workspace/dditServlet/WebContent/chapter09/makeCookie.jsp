<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
/*
	<쿠키의 구성>
	- 이름 : 각각의 쿠키를 구별 ***
	- 값	  : 쿠키의 이름과 관련된 값 ***
	
*/	
	//추가할 쿠키 정보를 담고 있는 Cookie 객체를 생성
	Cookie cookie = new Cookie("name",URLEncoder.encode("개똥이","UTF-8"));
	
	//응답 데이터 쿠키를 추가
	response.addCookie(cookie);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키생성</title>
<script type="text/javascript">
	function fn_view() {
		location.href = "/chapter09/viewCookies.jsp";
	}
</script>
</head>
<body>
<%=cookie.getName() %> 쿠키의 값 = <%=URLDecoder.decode(cookie.getValue(),"UTF-8") %>
<!-- 쿠키 동작방식
1. 생성 : 웹 서버 측에서 생성함. 생성한 쿠키를 응답 데이터의 헤더에 저장하여 웹 브라우저에 전송함
2. 저장 : 웹 브라우저는 응답 데이터에 포함된 쿠키를 쿠키 저장소에 보관함
3. 전송: 웹 브라우저는 요청이 있을 때마다 쿠키를 웹 서버에 전송함. 

 -->
<input type="button" value="쿠키보기" onclick="fn_view()" >
</body>
</html>