<%@page import="chapter15.service.WriteMessageService"%>
<%@page import="chapter15.vo.Message"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
// request객체 안에있는 한글의 encoding을 처리해줌
request.setCharacterEncoding("UTF-8");

String guestName = request.getParameter("guestName");
String password = request.getParameter("password");
String message = request.getParameter("message");

out.print("guestName :" + guestName+"<br/>");
out.print("password :" + password+"<br/>");
out.print("message :" + message+"<br/>");

Message messageVo = new Message();
messageVo.setGuestName(guestName);
messageVo.setPassword(password);
messageVo.setMessage(message);

// WriteMessageService writeService = 
WriteMessageService writeService = WriteMessageService.getInstance();
writeService.write(messageVo);

%>
<!DOCTYPE html>
<html>
<head>
<title>방명록 메시지 남김</title>
</head>
<body>
방명록에 메시지를 남겼습니다. <br/>
<a href="/chapter15/list.jsp">[목록 보기]</a>
</body>
</html>