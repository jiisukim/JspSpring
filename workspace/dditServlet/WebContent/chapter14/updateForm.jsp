<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>회원명 변경 form</title>
</head>
<body>

<form action="/chapter14/update.jsp" method="post" name="frm">
	<table border="1" style="width: 100%">
		<tr>
			<th>아이디</th>
			<th><input type="text" name="memberid" placeholder="아이디입력"></th>
			<th>이름</th>
			<th><input type="text" name="name" placeholder="이름입력"></th>
		</tr>
		<tr>
			<td colspan="4">
				<input type="submit" value="변경">
			</td>		
		</tr>
	</table>

</form>
</body>
</html>