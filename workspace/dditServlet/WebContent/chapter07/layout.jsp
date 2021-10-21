<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>layout1</title>
</head>
<body>
<!-- 
* jsp:include 액션태그와 include 디렉티브의 차이점
 - jsp:include 액션태그 : jsp:include page="포함될 페이지" flush="false" 
 - include 디렉티브 : [include file="포함될 파일의 url"]
비교항목	| jsp:include 액션태그 	| include 디렉티브의 차이점
--------------------------------------------------------------
처리시간	| 요청 시간에 처리			| JSP파일을 자바소스로 변환 시 처리
기능		| 별도 파일로 요청 처리 흐름 이동| 현재 파일로 대상 페이지가 들어감
데이터전달	|request,jsp:param을 이용	| 페이지 내 변수 선언 후 변수에 값 저장
용도		|화면의 레이아웃의 일부분을	| 저작권, 공통 변수 지정  
		| 모듈화					|
		

 -->
 
<table border="1" style="width: 100%;" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">
			<jsp:include page="/module/top.jsp" flush="false" />
		</td>
	</tr>
	<tr>
		<td style="width: 30%" valign="top">
			<jsp:include page="/module/left.jsp" />		
		</td>
		<td>
			레이아웃1<br><br><br>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/module/bottom.jsp" />
		</td>
	</tr>

</table>

</body>
</html>
 