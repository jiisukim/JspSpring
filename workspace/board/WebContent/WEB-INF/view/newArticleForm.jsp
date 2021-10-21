<%@page import="auth.vo.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
User user = (User)session.getAttribute("authUser");
%>

<!DOCTYPE html>
<html>
<head>
<title>게시글 쓰기</title>
<script type="text/javascript">
	function fn_owin() {
		//window.open("경로", "새창의 이름", "옵션")
		window.open("/login.do","owin","width=660, height=500");
	}
</script>
</head>
<body>
<c:set var="user" value="<%=user %>"></c:set>
<a href="javascript:fn_owin();">[로그인]</a>
<form action="/article/write.do" method="post">
<input type="hidden" name="writerId" value="${user.memberid}">
<input type="hidden" name="writerName" value="${user.name}">
	<p>
		제목 : <br/> <input type="text" name="title" value="">
	</p>
	<p>
		작성자 : <br/> <input type="text" name="writerName" value="${user.name}" disabled="disabled">
	</p>
	<p>
		내용 : <br/> <textarea rows="5" cols="30" name="content"></textarea>
	</p>
	<input type="submit" value="새글 등록">
</form>


</body>
</html>