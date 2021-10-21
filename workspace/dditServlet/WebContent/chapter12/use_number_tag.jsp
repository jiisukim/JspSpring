<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
            <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="price" value="10000" />
<c:out value="${price}"/>
<fmt:formatNumber value="${price}" type="number" var="numberType" />
<br>
<br>
통화 :<fmt:formatNumber value="${price}" type="currency" currencySymbol="원" />
<br>
숫자 :<c:out value="${numberType}"/>
<br>
패턴 : <fmt:formatNumber value="${price }" pattern="000000000000000.00000"></fmt:formatNumber>
<br>
<fmt:parseNumber value="1,100.12" pattern="0,000.00" var="num" />
숫자로 변환한 결과 : ${num}
</body>
</html>