<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="/resources/js/jquery.min.js"></script>
<title>비동기 테스트</title>
<script type="text/javascript">
	$(function() {
		alert("왔다");
		$.ajax({
			type:"post",
			url:"/item/background",
			success:function(result){//콜백함수
				console.log("id:"+result.id+",name : " + result.name);
				$("#result").html("아이디:"+result.id+",이름 : " + result.name);
			}
		});
	});
</script>
</head>
<body>
<div id="result">

</div>
</body>
</html>