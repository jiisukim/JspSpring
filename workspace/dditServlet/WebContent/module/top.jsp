<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
상단 메뉴 : <a href = "/chapter07/layout.jsp">홈</a>&nbsp;
<a href="/chapter07/info.jsp">정보</a>&nbsp;
&nbsp;&nbsp;&nbsp;
<%
	//cookieMap.put(cookies[i].getName(),cookies[i]);
	Cookies cookies = new Cookies(request);
	
	if(cookies.exists("id")){
		out.print(cookies.getValue("id")+ "님 환영합니다.");
		%>
		<input type="button" value="로그아웃" onclick="fn_logout()">
		<%
	}else{
		%>
		<input type="button" value="로그인" onclick="fn_login()" />	
<%		
	}
%>
<script type="text/javascript">
	function fn_logout() {
		location.href = "/chapter09/logout.jsp";
	}
	function fn_login() {
		//layout.jsp 복사 후 내용부분에 chapter09/login.jsp를 include
		location.href = "/chapter07/login.jsp";
	}
</script>