<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<c:if test="${loginOk=='true'}">
<h2>${sessionScope.memberVo.name}님(${sessionScope.memberVo.memberid})환영합니다.</h2>
</c:if>
${result}
</body>
</html>