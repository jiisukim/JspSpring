<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		text-align: center;
	}
</style>
</head>
<body>
<img alt="error" src="../chapter06/error.png" width="300px;">
<br>
오류가 발생했습니다.<br>
빠른 시간 내에 문제를 해결하도록 하겠습니다. <br>	
오류 타입 : <%=exception.getClass().getName() %><br>
<!--  오류 메시지를 출력  -->
오류 메시지 : <%=exception.getMessage() %>

</body>
</html>