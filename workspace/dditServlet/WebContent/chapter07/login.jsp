<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>layout1</title>
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
			<jsp:include page="/chapter09/loginForm.jsp" flush="false" />
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
 