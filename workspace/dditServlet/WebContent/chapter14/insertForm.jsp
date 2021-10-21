<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/chapter14/insert.jsp">
<table border="1">
	<tr>
		<th>아이디</th>
		<td><input type="text" name="memberid" placeholder="아이디 입력"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="text" name="password" placeholder="비밀번호 입력"></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><input type="text" name="name" placeholder="이름 입력"></td>
	</tr>
	<tr>
		<th>이메일</th>
		<td>
			<input type="text" name="email" placeholder="메일주소 입력">
		</td>
	</tr>
</table>
<input type="submit" value="등록">
</form>
<a href="/chapter14/viewMemberList.jsp">목록으로 이동</a>
</body>
</html>