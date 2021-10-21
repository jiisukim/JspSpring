<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그아웃 처리
	session.invalidate();

	//로그아웃처리 2  : 로그인 상태를 보관시 사용한 session 기본 객체 삭제
// 	session.removeAttribute("MEMBERID");
// 단점 ) session 기본 객체에 추가하는 속성이 늘어나면 각각을 처리해야 하므로 비효율적임
%>    
    
<!DOCTYPE html>
<html>
<head>
<title>세션 로그아웃</title>
</head>
<body>
로그아웃하였습니다.<br/>
<a href="/chapter10/member/sessionLoginCheck.jsp">인증 여부 판단</a><br/>
</body>
</html>