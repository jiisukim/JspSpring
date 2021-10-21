<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String danStr = request.getParameter("dan")==null?"2":request.getParameter("dan");
	int danInt = Integer.parseInt(danStr);
%>   
<!DOCTYPE html>
<html>
<head>
<title>구구단 출력</title>
<script type="text/javascript">
	function fn_chg(getObj) {
		alert(getObj.value);
		var varDan = getObj.value;
		location.href = "/chapter05/useOut.jsp?dan="+varDan;
	}
</script>
</head>
<body>

<select id="sel" name="sel" onchange="fn_chg(this)">
<%for(int i= 2; i<=9; i++){ %>
	<option value="<%=i %>"<%if(i==danInt){out.print("selected='selected'");} %>><%=i %>단</option>
	<%} %>
</select>
<table border="1" style="width: 10%;">
<%for(int i = 1; i<=9; i++){ %>
	<tr>
		<td><%out.print(danInt+" * "+ i+" = "+ danInt * i); %></td>
	</tr>
	<%
	}
	%>
</table>
</body>
</html>