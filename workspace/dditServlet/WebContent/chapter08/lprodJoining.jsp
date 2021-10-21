<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
%>    

<jsp:useBean id="lpVo" class="chapter08.member.LprodVO" />
<jsp:setProperty property="*" name="lpVo" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력한 정보</title>
</head>
<body>
	<table border="1">
 		<tr>
 			<th>상품분류 아이디</th>
 			<td>
 				<jsp:getProperty property="lprodId" name="lpVo"/>
 			</td>
		</tr>
		<tr> 			
 			<th>상품분류 코드</th>
 			<td>
 				<jsp:getProperty property="lprodNm" name="lpVo"/>
 			</td>
 		</tr>
 		<tr>
 			<th>상품분류명</th>
 			<td>
 				<jsp:getProperty property="lprodGu" name="lpVo"/>
 			</td>
 		</tr>
 	</table>
</body>
</html>