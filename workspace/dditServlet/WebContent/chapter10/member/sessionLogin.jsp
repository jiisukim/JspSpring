<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// name이 id와 password인 파라미터를 받음
String id = request.getParameter("id");
String password = request.getParameter("password");

//id 요청 파라미터가 a001이고 동시에 password가 1234인 경우 로그인 성공
if(id.equals("a001")&&password.equals("1234")){
	//session 기본 객체의 MEMBERID 속성을 사용하여 로그인 상태를 저장함
	session.setAttribute("MEMBERID", id); // id : a001
	
%>

<!DOCTYPE html>
<html>
<head>
<title>로그인 성공</title>
</head>
<body>
로그인에 성공했습니다. <br/>
<a href="/chapter10/member/sessionLoginCheck.jsp">인증 여부 판단</a><br/>
<a href="/chapter10/member/sessionLogout.jsp">로그아웃</a> <br/>

</body>

</html>

<%
}else{
%>
	<script>
		alert("로그인에 실패했습니다.");
		location.href= "/chapter10/member/sessionLoginForm.jsp";
	</script>
<%
}
%>