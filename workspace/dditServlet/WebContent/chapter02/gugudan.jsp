<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
<style type="text/css">
	table{
		text-align: center;
		border-collapse: collapse;
	}
	td{
		width: 100px;
	}
	tr,td,th{
		border: 1px solid black;
	}
</style>
</head>

<body>
<table>
	<tr>
	<%for(int i=2; i<=9; i++){%>
	<th><%=i %>단</th>
	<%} %>
	</tr>
	<%for(int i= 1; i<=9; i++){%>
		<tr>
		<%for(int j=2; j<=9; j++){%>
			
				<td><%=j %> * <%=i %> = <%=j * i %></td>
			
		<%}%>
		</tr>
	<%} %>
</table>
</body>
</html>