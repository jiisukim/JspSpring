<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ddStr = request.getParameter("dd")==null?"32":request.getParameter("dd");

	int ddInt = Integer.parseInt(ddStr);
%>    
<!DOCTYPE html>
<html>
<head>
<title>달력</title>
<script type="text/javascript">
	function fn_chg(dd) {
		console.log(dd.value); // 날짜 값
		
		location.href = "/chapter05/callender.jsp?dd="+ dd.value;
		
	}
</script>
</head>
<body>
<!--  1일부터 31일까지 채우기. 선택된 날짜를 ?dd=1 => 달력에 해당 날짜에 배경색 넣기 -->
<select name="sel" id="sel" onchange="fn_chg(this)">
	<option>선택</option>
<%for(int i=1; i<=31; i++){ %>
	<option value="<%=i %>" <%if(ddInt==i){out.print("selected='selected'");} %>><%=i %>일</option>
<%} %>	
</select>
<table border="1" style="width: 50%; text-align: center;" id="callender">
	<tr>
		<th>일</th>
		<th>월</th>
		<th>화</th>
		<th>수</th>
		<th>목</th>
		<th>금</th>
		<th>토</th>
	</tr>
	<tr>
	<%
	//blank는 7이 주어지고, 행이 끝나면 다시 7이 충전됨 
	// 날짜를 출력할 때마다 1씩 감소. 31일을 출력하면 4가 남게됨
	int blank = 7;
	for(int i=1; i<=31; i++){ 
		if(i == ddInt){
			out.print("<td style='background-color: pink'>"+i+"</td>");
		}else{
			out.print("<td>"+i+"</td>");
		}
		blank--;
		if(i%7 == 0){
			out.print("</tr><tr>");
			blank = 7;
		}
		
	}
	for(int j = 0; j<blank; j++){
		out.print("<td>&nbsp;</td>");
	}
	
	%>
	</tr>
	
</table>	
</body>
</html>