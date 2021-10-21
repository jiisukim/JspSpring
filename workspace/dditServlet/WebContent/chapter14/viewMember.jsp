<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String memberid = request.getParameter("memberid");

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;
Statement stmt = null;
ResultSet rs =null;

try{
	String jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe";
	String dbUser = "jspexam";
	String dbPass = "java";
	String query = "select * from member where memberid='"+memberid+"'";
	conn = DriverManager.getConnection(jdbcDriver, dbUser, dbPass);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(query);
	if(rs.next()){
%>
<!DOCTYPE html>
<html>
<head>
<title>회원 상세 정보</title>
</head>
<body>
<table border="1">
	<tr>
		<th>아이디</th>
		<td><%=rs.getString("MEMBERID") %></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><%=rs.getString("PASSWORD") %></td>
	</tr>
	<tr>
		<th>이름</th>
		<td><%=rs.getString("NAME") %></td>
	</tr>
	<tr>
		<th>이메일</th>
		<td><%=rs.getString("EMAIL") %></td>
	</tr>
</table>
<a href="/chapter14/viewMemberList.jsp">목록으로 이동</a>
</body>
</html>
<%		
	}else{
		out.print(memberid + "에 해당하는 정보가 없습니다.");	
	}
	}catch(SQLException e){
	e.printStackTrace();
}finally{
	if(rs!=null) try{rs.close();} catch(SQLException e){}
	if(stmt!=null) try{stmt.close();} catch(SQLException e){}
	if(conn!=null) try{conn.close();} catch(SQLException e){}
}
%>

