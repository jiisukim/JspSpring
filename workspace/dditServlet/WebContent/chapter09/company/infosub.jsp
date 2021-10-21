<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//<jsp:param value="A" name="type"/>
	String type = request.getParameter("type");	// A가 받아짐
	if(type == null){
		return;
	}
%>    
<br>
<!-- info.jsp에 include되는 sub페이지. -->
<table style="width: 100%;" border="1">
	<tr>
		<th>타입</th>
		<td><b><%=type %></b></td>
	</tr>
	<tr>
		<th>특징</th>
		<td>
		<%
		if(type.equals("A")){
			out.print("강한 내구성");
		}else if(type.equals("B")){
			out.print("뛰어난 대처 능력");
		}else{
			out.print("저렴한 가격");
		}
		%>
		</td>
	</tr>
</table>
