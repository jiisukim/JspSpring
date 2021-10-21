<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="/error/noParamEx.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>파라미터가 없는 오류</title>
</head>
<body>

<%
/*
- /error/noParamEx.jsp를 생성하여 오류를 처리해보자
- noParamEx.jsp에는 적당한 오류 이미지를 넣어보자
- 이미지는 chapter06 폴더에 넣은 후 <img태그로 처리해보자
*/
String memId = request.getParameter("memId");
String memName = request.getParameter("memName");
String memIdstr = memId.substring(0,2);
// out.print(request.getParameter("memId").toUpperCase()); 
// out.print(request.getParameter("memName").toUpperCase()); 
%>
<%-- <%=memIdstr %>	 --%>

</body>
</html>