<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="true"%>   
<!DOCTYPE html>
<html>
<head>

<title>autoFlush 속성값 true 예제</title>
</head>
<body>

<%
/*
	<request 기본 객체 - 주요 정보 제공 메서드>
	- getRemoteAddr() : 클라이언트(작성자)의 IP주소를 구함
	- getMethod() : 웹 브라우저가 정보 전송시 사용한 방식(get,post)
	- getRequestURI() : 웹 브라우저가 요청한 URL 경로
	- getContextPath() : 웹 어플리케이션의 컨텍스트 경로
	- getServerName() : 연결 시 사용한 서버 이름을 구함
	- getServerPort() : 서버가 실행중인 포트번호를 구함
	
*/
// 	for(int i = 0; i<1000; i++){
// 		out.print("1234");
// 	}
%>

웹 어플리케이션 컨텍스트 경로 : <%=request.getContextPath() %><br>
클라이언트(작성자)의 IP주소 : <%=request.getRemoteAddr() %><br>
웹 브라우저가 요청한 URL 경로 : <%=request.getRequestURI() %><br>
연결 시 사용한 서버 이름: <%=request.getServerName() %><br>
서버가 실행중인 포트번호 :<%=request.getServerPort() %><br>
</body>
</html>