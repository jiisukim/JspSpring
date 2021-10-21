<%@page import="kr.or.ddit.item.vo.MemberVO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
MemberVO2 memberVo = session.getAttribute(name)
%>
<!DOCTYPE html>
<html>
<head>
<!-- servlet-context에 경로 명시 -->
<script src="/resources/js/jquery.min.js"></script>
<title>로그인</title>
<script type="text/javascript">
$(function(){
//   $("#btnLogin").click(function(){})
   $("#btnLogin").on("click",function(){
      var id=$("#id").val();
      var pwd=$("#pwd").val();
      var param={"id":id,"pwd":pwd}; // jsp데이터
      $.ajax ({
         type:"post",
         url:"/item/login_result",
         data:param,
         success:function(result){
            console.log("result" + result)
            console.log("위치 : " + result.indexOf("환영합니다."));
           	var pos = result.indexOf("환영합니다");
           	
           	if(pos>0){
	      		$("#spnIn").css("display","none");
	      		$("#spanOut").css("display","block");
	            // result : login_result.jsp 포워딩 결과를 html메소드로 id가 result인 div에 넣어줌
           	}
            $("#result").html(result);
         }
      })
   });
$("#btnLogout").on("click",function(){
	//form id="frm" .. 객체를 변수에 넣음
	var formObj = $("#frm");
// 	formObj.attr("action","/item/logout");
// 	formObj.attr("method","get");
	formObj.submit();
	
});


});
</script>
</head>
<body>
<!-- 로그인 영역 시작 -->
<span id="spnIn" style="display: block;">
id : <input type="text" id="id" />
pwd : <input type="password" id="pwd" /><br />
<input type="button" id="btnLogin" value="로그인" />
</span>
<!-- 로그인 영역 끝 -->
<!-- 로그아웃 영역 시작 -->
<span id="spanOut" style="display: none;">
<form id="frm" action="/item/logout" method="get">
	<input type="button" id="btnLogout" value="로그아웃" />
</form>
</span>
<!-- 로그아웃영역 끝 -->
<div id="result"></div>

</body>
</html>