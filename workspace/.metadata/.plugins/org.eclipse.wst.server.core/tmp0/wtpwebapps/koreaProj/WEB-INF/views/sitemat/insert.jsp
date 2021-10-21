<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<script src="/resources/js/jquery.min.js"></script>
<title>사업장 자재 정보 등록</title>
<script type="text/javascript">
$(function(){
	$(":button").on("click",function(){
		//사업장 검색
		window.open("/sitemat/selectSite","owin","width=700px,height=700px,scrollbars=yes");
	});
});
</script>
</head>
<body>
<h2>사업장 자재 정보 등록</h2>
사업장 번호 : <input type="text" name="siteNum" id="siteNum" />&nbsp;
<input type="button" value="사업장 검색" />
<br />
자재 명 코드 : <select name="matNmCd">
<c:forEach var="list" items="${list}">
	<option value="${list.MAT_NM_CD}">${list.ITEM_NM}</option>
</c:forEach>
</select> <br />
<!-- 수량 최소 1부터 시작해서 100까지 중에서 1개를 선택 -->
수량 : <input type='text' name='cnt' /><br />
구입 가격 : <input type='text' name='purPri' /><br />
<!-- jquery에 datepicker -->
구입 일자 : <input type='text' name='purDt' /><br />

</body>
</html>








