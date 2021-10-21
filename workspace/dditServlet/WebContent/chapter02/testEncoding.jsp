<%@page import="java.net.URLDecoder"%>
<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	String name = request.getParameter("name")==null?"없음":request.getParameter("name");
%>    
    
<!DOCTYPE html>
<html>
<head>
<title>파라미터 값의 인코딩/디코딩</title>
<script type="text/javascript">
	function goURL() {
		var name = document.getElementById("name");
		var loc = "/chapter02/testEncoding.jsp?name="+encodeURI(name.value);
		location.href = loc
	}
</script>
</head>
<body>

<h2>파라미터 값의 인코딩/디코딩</h2>
name = <%=name %>
<br>
<input type="text" id="name" name="name" value="" placeholder="이름을 입력하세요">
<input type="button" value="이동" onclick="goURL()">
<br>
<a href="/chapter02/testEncoding.jsp?name=<%=URLEncoder.encode(name,"UTF-8") %>">이동</a>
	
</body>
</html>