<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>사업장 검색</title>
<script type="text/javascript">
function fn_parentIn(p_siteNum){
	//alert("p_siteNum : " + p_siteNum);
	//부모창의 id가 siteNum인 요소를 찾아서 value에 넣음
	opener.document.getElementById("siteNum").value = p_siteNum;
	//창을 닫음
	self.close();
}
</script>
</head>
<body>
<h2>사업장 검색</h2>
<table border="1" style="width:100202101%;">
<tr>
	<th>사업장번호</th>
	<th>사업장 명</th>
	<th>주소</th>
</tr>
<tr>
	<td><a href="javascript:fn_parentIn('202101')">202101</a></td>
	<td>대전사업장</td>
	<td>대전광역시 중구 문화동 117</td>
</tr>
</table>

</body>
</html>