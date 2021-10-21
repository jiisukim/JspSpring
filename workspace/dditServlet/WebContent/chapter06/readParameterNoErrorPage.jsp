<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="/error/viewErrorMessage.jsp" %>
<!-- 
JSP는 실행 도중 exception이 바생 시 오류 화면 대신 지정한 JSP 페이지를 보여줄 수 있음.
 -->    
<!DOCTYPE html>
<html>
<head>
<title>파라미터 출력</title>
</head>
<body>
<!-- 
name 파라미터가 없으면 request.getParameter("name")은 null을 리턴하므로 실행 도중 문제가 생겨 NullPointException을 발생시킴

 -->
name 파라미터 값 : 
<%
// try{	
out.print(request.getParameter("name").toUpperCase()); 
// }catch(Exception e){
// 	out.print("name 파라미터가 올바르지 않습니다.");
// }
%>

</body>
</html>