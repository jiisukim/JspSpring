<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>책 목록</title>
</head>
<body>

<h1>책 목록</h1>
<p>
<!-- 
form 태그의 기본 HTTP 메소드는 GET. 검색버튼을 클릭하면 /list?keyword=검색어
 -->
<form>
	<input type="text" placeholder="검색" name="keyword" value="${keyword}">
	<input type="submit" value="검색">
</form>
</p>


<!-- JSTL에서 반복문을 사용. c:태그를 사용하기 위해서 우리는 tablib(태그라이브러리) 디렉티브를 사용 -->
<!-- var : 목록의 한 행(row, 튜플, 레코드)을 나타내는 변수명을 넣으면 됨 -->
<table border="1" style="width: 100%;" cellspacing ="0">
	<thead>
		<tr>
			<th>제목</th>
			<th>카테고리</th>
			<th>가격</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="row" items="${data}">
		<tr>
			<!-- row.map의 키 명 -->
			<td><a href="/detail/${row.BOOKID}">${row.TITLE}</a></td>
			<td>${row.CATEGORY}</td>
			<td><fmt:formatNumber type="currency" maxFractionDigits="3" value="${row.PRICE}"></fmt:formatNumber>원</td> 
		</tr>
	</c:forEach>
	</tbody>
</table>
<p><a href="/create">생성</a></p>
<h2>요청 처리</h2>
<h5>스프링 MVC는 요청 데이터를 가져올 수 있는 다양한 방법을 제공함</h5>
<a href="/register?userId=a001&password=1234">/register?userId=a001&amp;password=1234 </a> <br/><!-- &amp : 앰퍼샌드(&) 기호 -->
<a href="/register/a001">/register/a001</a> 
<br/>
<form method="post" action="/register02">
	userId : <input type="text" name="userId" value=""> <br/>
	password : <input type="password" name="password" value=""><br/>
	Coin : <input type="text" name="coin" value="">
	<input type="submit" value="전송">
	<br/><br/><br/><br/>
</form>


</body>
</html>