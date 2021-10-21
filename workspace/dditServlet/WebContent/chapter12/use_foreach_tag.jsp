<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>forEach 태그연습 1</title>
</head>
<body>
<!-- 
var 속성변수 n : 1부터 1-까지 차례대로 값을 갖음
begin ~ end : 범위지정
step : 증감값(1인경우 생략가능)
 -->
<h2>1부터 10까지 출력</h2>
<c:forEach var="n" begin="1" end="10" step="1">
	${n}&nbsp;&nbsp;&nbsp;
</c:forEach>
<h2>1부터 100까지 출력. 5씩 증가</h2>
<c:forEach var="n" begin="1" end="100" step="5">
	${n}&nbsp;&nbsp;&nbsp;
</c:forEach>

<h2>자바  배열 사용</h2>
<%
List<String> list =  new ArrayList<String>();

String[] arr = {"사과","귤","바나나","배","오렌지","키위"};
for(String str:arr){
	list.add(str);
}
//request 기본 객체에 담아보기
request.setAttribute("fruitList",list);
%>

<!-- 
*varStatus
index : 인덱스 정보, count : 반복 횟수 , begin : begin의 속성값,
end : end의 속성값, step : step 속성값, first: 첫번째 실행시 true,
last : 마지막 실행 시 true, current : collection 중 사용할 객체
begin과 end속성은 index를 사용 (0부터 시작)
 -->
<c:forEach var="fruitStr" items="${fruitList}" varStatus="stat"> <!-- 일부만 출력하고 싶으면 begin과 end를 써주면 된다. -->
	${stat.count}, ${stat.index} ==>  ${fruitStr}&nbsp;&nbsp;
</c:forEach>
</body>
</html>