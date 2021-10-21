<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String lprod_id= request.getParameter("lprod_id");
%>
<!DOCTYPE html>
<html>
<head>
<title>LPROD 수정</title>
</head>
<body>
<form action="/chapter14/updateLprod.jsp" method="post" name="frm">
	<input type="hidden" name="lprod_id" value="<%=lprod_id %>">
	<table>
		
		<tr>
			<th>LPROD_GU</th>
			<td><input type="text" name="lprod_gu" placeholder="LPROD_GU 입력"></td>
		</tr>
		<tr>
			<th>LPROD_NM</th>
			<td><input type="text" name="lprod_nm" placeholder="LPROD_NM 입력"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="변경">
			</td>		
		</tr>
	</table>
<input type="button" value="목록" onclick="javascript:location.href='/chapter14/viewLprodList.jsp'">
</form>
</body>
</html>