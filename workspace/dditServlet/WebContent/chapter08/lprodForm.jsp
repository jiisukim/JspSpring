<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lprod 추가</title>
</head>
<body>
 <form action="/chapter08/lprodJoining.jsp" method="post">
 	<table border="1">
 		<tr>
 			<th>상품분류 아이디</th>
 			<td>
 				<input type="text" name="lprodId" size="10" placeholder="아이디를 입력해주세요">
 			</td>
 		</tr>
 		<tr>
 			<th>상품분류 코드</th>
 			<td>
 				<input type="text" name="lprodNm" size="10" placeholder="코드를 입력해주세요">
 			</td>
 		</tr>
 		<tr>
 			<th>상품분류명</th>
 			<td>
 				<input type="text" name="lprodGu" size="10" placeholder="분류명을 입력해주세요">
 			</td>
 		</tr>
 	</table>
 	<input type="submit" value="추가">
 </form>
</body>
</html>

