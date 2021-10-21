<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
public int add(int a, int b){return a + b;}
public int minus(int a, int b){return a - b;}
public int multi(int a, int b){return a * b;}

%>
<%
/*
	<request 기본 객체>
	1. 웹브라우저(클라이언트)가 웹 컨테이너(tomcat)(..웹 서버)에 전송한 요청 관련 정보 제공
	2.  JSP페이지에서 가장 많이 사용되는 기본 객체. 웹 브라우저의 요청과 관련이 있음
	3. 웹 브라우저에 웹 사이트의 주소를 입력하면, 웹 브라우저는 해당 웹 서버에 연결한 후  요청 정보를 전송. 이때 이 요청 정보를 제공
	4. 주요 기능
	- 클라이언트 (웹 브라우저)와 관련된 정보 읽기
	- 서버와 관련된 정보 읽기
	- 클라이언트가 전송한 요청 파라미터 읽기*******************
	- 클라이언트가 전송한요청 헤더 읽기
	- 클라이언트가 전송한 쿠키 읽기
	- 속성도 처리해줌
	
	
*/
// 	String firstStr = request.getParameter("a")==null?"0":request.getParameter("a");
// 	String sikStr = request.getParameter("sik")==null?"+":request.getParameter("sik");
// 	String secondstStr = request.getParameter("b")==null?"0":request.getParameter("b");
// 	int firstInt = Integer.parseInt(firstStr); 
// 	int secondInt = Integer.parseInt(secondstStr); 
// 	int resultInt = 0;
	
// 	if(sikStr.equals("+")){
// 		resultInt = add(firstInt,secondInt);
// 	}else if(sikStr.equals("-")){
// 		resultInt = minus(firstInt,secondInt);
// 	}else if(sikStr.equals("X")){
// 		resultInt = multi(firstInt,secondInt);
// 	}
		
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		text-align:center;
		border-collapse: collapse;
	}
	td{
		width: 100px;
	}
	tr,td,th{
		border: 1px solid black;
		height: 50px;
	}
	td input {
		padding: 30px 50px 30px 50px;
	}
</style>
<script type="text/javascript" src="jquery-3.6.0.js"></script>

<script type="text/javascript">
	function fncA(geta, getb) {
		console.log(geta + "," + getb);
		var vara = document.getElementById("a");
		var varb = document.getElementById("sik");
		var varc = document.getElementById("b");
		if(varb.value == ""){
			if(getb == 0){
				vara.value = geta;
			}
		}else{
			varc.value = geta;
		}
		if(getb =="1"){
			varb.value = geta;
		}
	}
	function fn_chk() {
		var vara = document.getElementById("a");
		var varb = document.getElementById("sik");
		var varc = document.getElementById("b");
		
		if(vara.value==""){
			alert("첫번째 숫자를 입력해주세요");
			return false;
		}
		if(varb.value==""){
			alert("연산자를 입력해주세요");
			return false;
		}
		if(varc.value==""){
			alert("두번째 숫자를 입력해주세요");
			return false;
		}
		return true; // submit 실행
	}
	function resProc() {
		document.getElementById("txtResult").value = 0;
	}
</script>
</head>
<body>
<form name="frm" id="frm" method="get" action="" onsubmit="return fn_chk()">
	<input type="hidden" name="a" id="a" value="">&nbsp;&nbsp;
	<input type="hidden" name="sik" id="sik" value="">&nbsp;&nbsp;
	<input type="hidden" name="b" id="b" value="">&nbsp;&nbsp;
<!-- 	<input type="hidden" name="result" id="result" value="">&nbsp;&nbsp; -->
	<br><br>
	
	<table>
		<tr>
			<th colspan="4"><input type="text" value="" id="txtResult" style="width: 90%; text-align: right;"></th>
		</tr>
		<tr>
			<td><input type="button" value="7" onclick="fncA('7','0')"></td>
			<td><input type="button" value="8" onclick="fncA('8','0')"></td>
			<td><input type="button" value="9" onclick="fncA('9','0')"></td>
			<td><input type="button" value="X" onclick="fncA('X','1')"></td>
		</tr>
		<tr>
			<td><input type="button" value="4" onclick="fncA('4','0')"></td>
			<td><input type="button" value="5" onclick="fncA('5','0')"></td>
			<td><input type="button" value="6" onclick="fncA('6','0')"></td>
			<td><input type="button" value="-" onclick="fncA('-','1')"></td>
		</tr>
		<tr>
			<td><input type="button" value="1" onclick="fncA('1','0')"></td>
			<td><input type="button" value="2" onclick="fncA('2','0')"></td>
			<td><input type="button" value="3" onclick="fncA('3','0')"></td>
			<td><input type="button" value="+" onclick="fncA('+','1')"></td>
		</tr>
		<tr>
			<td><input type="button" value="" onclick=""></td>
			<td><input type="button" value="0" onclick="fncA('0','0')"></td>
			<td><input type="button" value="" onclick=""></td>
			<td><input type="button" value="=" onclick="resultProc()"></td>
		</tr>
	</table>
</form>
<!-- 	<button type="button" onclick="resProc()">리셋</button> -->

</body>
<script type="text/javascript">
	function resultProc() {
		$.ajax({
			url: "/chapter02/calcResult.jsp"
			,type: "get"
			,data:$("#frm").serialize()
			,dataType: "json"
			,success: function(data) {
				$("#txtResult").val(data["result"]);
				console.log(data["result"]);
				$("#a").val("");
				$("#sik").val("");
				$("#b").val("");
			
			}
			,error: function(xhr){
				console.log(xhr);
				alert("오류입니다. 관리자에게 문의하세요.");
			}
		});
	}

</script>
</html>