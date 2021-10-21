<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page buffer="8kb" autoFlush="true"%>
<%
//page 디렉티브
//buffer 속성의 값을 8kb 로 설정
// autoFlush : false => 페이지의 결과 데이터가 8kb를 초과 시 오류 발생

%>

    
<!DOCTYPE html>
<html>
<head>
<title>버퍼 정보</title>
</head>
<body>
<%
	for(int i = 0; i<1000; i++){
		out.print("개똥이");
	}
%>
<br>
버퍼 크기(8192)  <%=out.getBufferSize() %><br>
버퍼의 남은 크기(8082) : <%=out.getRemaining() %><br>
auto flush 여부(false) : <%=out.isAutoFlush() %>
</body>
</html>