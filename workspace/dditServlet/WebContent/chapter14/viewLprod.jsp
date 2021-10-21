<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String lprod_id = request.getParameter("lprod_id");

Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;
Statement stmt = null;
ResultSet rs =null;

try{
	String jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe";
	String dbUser = "kim";
	String dbPass = "java";
	String query = "select * from lprod where lprod_id='"+lprod_id+"'";
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
<input type="button" value="LPROD 수정" onclick="javascript:location.href='/chapter14/updateLprodForm.jsp?lprod_id=<%=lprod_id%>'">
<table border="1">
	<tr>
		<th>LPROD_ID</th>
		<td><%=rs.getString("LPROD_ID") %></td>
	</tr>
	<tr>
		<th>LPROD_GU</th>
		<td><%=rs.getString("LPROD_GU") %></td>
	</tr>
	<tr>
		<th>LPROD_NM</th>
		<td><%=rs.getString("LPROD_NM") %></td>
	</tr>
	
</table>
<input type="button" value="목록" onclick="javascript:location.href='/chapter14/viewLprodList.jsp'">
</body>
</html>
<%		
	}else{
		out.print(lprod_id + "에 해당하는 정보가 없습니다.");	
	}
	}catch(SQLException e){
	e.printStackTrace();
}finally{
	if(rs!=null) try{rs.close();} catch(SQLException e){}
	if(stmt!=null) try{stmt.close();} catch(SQLException e){}
	if(conn!=null) try{conn.close();} catch(SQLException e){}
}
%>