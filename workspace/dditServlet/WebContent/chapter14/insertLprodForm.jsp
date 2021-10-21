<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>LPROD 추가</title>
</head>
<body>
<form action="/chapter14/insertLprod.jsp" method="post">
	<table>
		
		<tr>
			<th>LPROD_GU</th>
			<td><input type="text" name="lprod_gu" placeholder="LPROD_GU 입력"></td>
		</tr>
		<tr>
			<th>LPROD_NM</th>
			<td><input type="text" name="lprod_nm" placeholder="LPROD_NM 입력"></td>
		</tr>
	</table>
	<input type="submit" value="등록">
	<input type="button" value="목록" onclick="javascript:location.href='/chapter14/viewLprodList.jsp'">
</form>
</body>
</html>