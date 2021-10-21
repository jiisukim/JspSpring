
<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
// 요청 파라미터의 캐릭터 인코딩 UTF-8로 지정  // 한글 깨짐 방지
request.setCharacterEncoding("UTF-8");
%>
    
<!DOCTYPE html>
<html>
<head>
<title>요청 파라미터를 출력해보자</title>
</head>
<body>

<!-- 이름을 적지 않았다면 빈 문자열("")이 파라미터 값으로 전달됨 -->
	name 파라미터 =<%=request.getParameter("name") %>
	<br> 
	addr 파라미터 =<%=request.getParameter("address") %>
	<br>

	 
<%
String[] values = request.getParameterValues("pet"); 
%>
<br>
pet 파라미터 =
<%
	if(values != null){
		for(int i=0; i<values.length; i++){
			 out.println(values[i]);
		}		
	}
%>
<br>
<%
//파라미터의 이름을 출력해주는 기본 형태(Elements를 다룸)
Enumeration paramEnum =  request.getParameterNames();
while(paramEnum.hasMoreElements()){
	String name = (String)paramEnum.nextElement();
	out.println(name + "<br>");
}
%>
<%
//파라미터 이름과 파라미터 값을 리턴.
// 이 맵에는 <파라미터이름, 파라미터 값 배열>이 쌍을 이루고 있음
Map parameterMap = request.getParameterMap();
String[] nameParam = (String[])parameterMap.get("address"); //name == address
if(nameParam != null){
	out.print("name = " + nameParam[0]+"<br>"); // name, address, pet
// 	out.print("name = " + nameParam[1]+"<br>");	//pet
// 	out.print("name = " + nameParam[2]+"<br>"); //pet
// 	out.print("name = " + nameParam[3]+"<br>"); //pet
}
%>
</body>
</html>






