<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%

SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
String date = sdf.format(new Date());

%>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입</title>
<script src="/resources/js/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	
	$("#btn").on("click",function(){
	const userNo = $("#no").val();
	const userName = $("#name").val();
	
	const data = {"no":userNo,"name":userName};
	console.log("data.no : " + data.no +",data.name" +data.name );
		$.ajax({
			type : "post" //포스트방식으로
			,url:"/user/register"	///user/registe/이곳에
			,data:JSON.stringify(data)	//data를 보낸다 / 여기까지 보낼때
			,dataType:"json"	// 여기부터 받을때 	
			,contentType:"application/json"
			,cache:false
			,success:function(data){
				console.log("data.no : " + data.no +",data.name" +data.name );
			}
		});
		
	});
	
	
})
</script>
</head>
<body>

<c:set var="dt" value="<%=date %>"></c:set>

<form id="frm" method="post" action="/user/register">
	회원번호 : <input type="text" id="no" name="no" value="${no}"><br/>
	회원이름 : <input type="text" id="name" name="name" value=""><br/>
	<input type="button" value="가입" id="btn">
</form>

</body>
</html>