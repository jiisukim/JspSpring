<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Item</title>
<script src="/resources/js/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	//<form id="item" method="post" ... >
	var formObj = $("#item");
	//button 클릭시 처리
	$("#btnRegister").on("click",function(){
		formObj.attr("action","/item/register");
		formObj.attr("method","post");
		formObj.submit();
	});
});
</script>
</head>
<body>

<h2>등록</h2>
<form id="item" action="/item/register" method="post" enctype="multipart/form-data">
	<table>
		<tr>
			<th>상품명</th>
			<td><input type="text" name="itemName" /></td>
		</tr>
		<tr>
			<th>가격</th>
			<td><input type="text" name="price" /></td>
		</tr>
		<tr>
			<th>파일</th>
			<td><input type="file" name="picture" /></td>
		</tr>
		<tr>
			<th>개요</th>
			<td><textarea rows="5" cols="30" name="description"></textarea> </td>
		</tr>
	</table>
	<div>
		<button id="btnRegister">등록</button>
	</div>

</form>
<br/>
<a href="/item/ajax?id=a001&name=ked">비동기식 호출1</a>
<a href="/item/login">비동기식 호출2</a>


</body>
</html>