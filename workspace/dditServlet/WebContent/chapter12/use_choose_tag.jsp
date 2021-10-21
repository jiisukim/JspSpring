<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>choose 태그 연습</title>
</head>
<body>
<c:set var="name" value="개똥이" />
<c:set var="age" value="25" />


<c:choose>
   <c:when test="${name=='개똥이'}">
      이름은 ${name}<br />
   </c:when>
 
   <c:when test="${param.name=='소똥이'}">
      이름은 ${param.name}<br />
   </c:when>
   <c:when test="${age>=20}">
      나이는 20 이상<br />
   </c:when>
   <c:otherwise>
      이름은 개똥이가 아니고 나이가 20 이상도 아님.
   </c:otherwise>
</c:choose>
</body>
</html>