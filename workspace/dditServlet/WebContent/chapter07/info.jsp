<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>INFO</title>
</head>
<body>

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
			<table>
				<tr>
					<th>제품 번호</th><td>P101000001</td>
				</tr>
				<tr>
					<th>가격</th><td>100000</td>
				</tr>
			</table>
			<!-- jsp:param 액션 태그로 추가한 파라미터가 기존 파라미터보다 우선한다. -->
			<jsp:include page="/chapter07/infosub.jsp">
				<jsp:param value="A" name="type"/>
			</jsp:include>
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
 