<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Map<String, Object> map =(Map<String, Object>)session.getAttribute("map");
	
	

%>    
<!DOCTYPE html>
<html>
<head>
<title>상세보기</title>
<script type="text/javascript">
	function fn_list() {
		location.href = "/chapter07/freeboard.jsp?currentPage=1"
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
					제목 : <br><input type="text" name="title" value="<%=map.get("title") %>">
				</p>
				<p>
					내용 : <br><textarea rows="5" cols="30" name="content"><%=map.get("content") %></textarea>
				</p>			
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