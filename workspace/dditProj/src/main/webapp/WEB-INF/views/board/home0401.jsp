<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>home</title>
</head>
<body>
${list}<br/>
<c:forEach var="row" items="${list}" varStatus="stat">
${row.userName}<br/>
${row.password}<br/>
count : ${stat.count}<br/>

</c:forEach>

</body>
</html>