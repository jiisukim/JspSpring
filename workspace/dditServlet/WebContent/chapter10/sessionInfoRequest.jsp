<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collections"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//requset.getSession() :현재 요청과 관련된 session 객체를 리턴함
HttpSession httpSession = request.getSession();

List list = new ArrayList();
list.add("사과");
list.add("바나나");
list.add("오렌지");

httpSession.setAttribute("list", list);

List list2 = null;

if(httpSession != null){
	list2 = (List)httpSession.getAttribute("list");
	
	for(int i = 0; i<list2.size(); i++){
		out.print(list2.get(i));
	}
	
}else{
	list = Collections.emptyList();
}

%>

<!DOCTYPE html>
<html>
<head>
<title>request객체를 이용한 세션 관리</title>
</head>
<body>

</body>
</html>