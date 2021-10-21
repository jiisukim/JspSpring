<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application 기본 객체의 속성 보기</title>
</head>
<body>
<!-- 
	서로다른 JSP페이지와 서로다른 웹 브라우저에서 동일한 application 기본 객체의 속성을 사용하는 이유는
	웹 어플리케이션 내에 있는 모든 JSP가 한 개의 application의 개본 객체를 공유하기 때문이다.
 -->
<form name="frm" id="frm" method="get" action="setApplicationAttribute.jsp">
	application 객체의 <br>
	setAttribute속성의 name: <input type="text" name="name" value="">
	setAttribute속성의 value: <input type="text" name="value" value="">
	<input type="submit" value="attribute추가">
	<br><br>
</form>
<%
Enumeration<String> attrEnum =  application.getAttributeNames();
while(attrEnum.hasMoreElements()){
	//a001	
	String name = attrEnum.nextElement();
	Object value = application.getAttribute(name);
	out.print("application 속성: " + name + "=" + value + "<br>");
}
%>
</body>
</html>