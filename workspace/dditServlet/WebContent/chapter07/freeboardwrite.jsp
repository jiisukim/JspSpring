<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>새 글 작성</title>
<script type="text/javascript">
	function fn_list() {
		history.go(-1);
	}
</script>
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
			<form action="/chapter07/freeboardreg.jsp" method="post">
				<p>
					제목 : <br><input type="text" name="title">
				</p>
				<p>
					내용 : <br><textarea rows="5" cols="30" name="content"></textarea>
				</p>
				<input type="submit" value="새글 등록">			
				<input type="button" value="목록" onclick="fn_list()">			
			</form>
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