<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>company</title>
</head>
<body>

<table border="1" style="width: 100%;" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">
			<jsp:include page="top.jsp" flush="false" />
		</td>
	</tr>
	<tr>
		<td style="width: 30%; height: 500px; text-align: center; "	>
			<jsp:include page="left.jsp" />		
		</td>
		<td>
			레이아웃1
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="bottom.jsp" />
		</td>
	</tr>

</table>

</body>
</html>
 