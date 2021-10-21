<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	//아이디가 a001이면서 비밀번호가 1234이면 로그인 성공
	if(id.equals("a001") && password.equals("1234")){
// 		Cookie cookie = new Cookie("id", id);  // util이 없으면 다이렉트로생성
		response.addCookie(
				Cookies.createCookie("id", id,"/",-1)	// util에 만들어놓은 Cookies 이용
		);
		
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<body>
	로그인에 성공했습니다.
	<div class="count" style="font-size: 15pt;">5</div>
	<script type="text/javascript">
		const countDisplay = document.querySelector(".count");
		//1초마다 실행
		setInterval(countDown, 1000);
		var time = 5;	//5초
		function countDown() {
			if(time > 0){
				time--;
				countDisplay.innerText = time;
			}else{	// 0
				location.href = "main.jsp";
			}
		}
	</script>
<%
}else{	// if문 끝 [로그인에 성공했습니다.]찍기 위해서
	out.print("<script>alert('로그인 실패');history.go(-1)</script> ");
}
%>
</body>
</html>