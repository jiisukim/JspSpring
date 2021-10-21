<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div style="display: flex;align-items: center;">
		<a href = "main.jsp" ><img alt="logo" src="company.png" height="60px;"></a> &nbsp;
		<a href = "main.jsp" >home</a>&nbsp;
		<a href="info.jsp">회사 정보</a>&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
<%
	//cookieMap.put(cookies[i].getName(),cookies[i]);
	Cookies cookies = new Cookies(request);
	if(cookies.exists("id")){
		out.print(cookies.getValue("id")+ "님 환영합니다.");
		%>
		&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="로그아웃" onclick="fn_logout()" style="float: right; ">
		<%
	}else{
		%>
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="button" value="로그인" onclick="fn_login()" style="float: right;" />	
	</div>		
<%		
	}
%>
<style>
	a{
		text-decoration: none;
		color: black;
	}
</style>
<script type="text/javascript">
	function fn_logout() {
		location.href = "logout.jsp";
	}
	function fn_login() {
		//layout.jsp 복사 후 내용부분에 chapter09/login.jsp를 include
		location.href = "login.jsp";
	}
</script>