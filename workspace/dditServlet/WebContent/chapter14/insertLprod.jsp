<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("UTF-8");
// String lprod_id = request.getParameter("lprod_id");
String lprod_gu = request.getParameter("lprod_gu");
String lprod_nm = request.getParameter("lprod_nm");

Connection conn = null;
PreparedStatement pstmt = null;

try{
	String jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe";
	String dbUser = "kim";
	String dbPass = "java"; 
	
	conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
	
	pstmt = conn.prepareStatement(
			"insert into lprod(lprod_id,lprod_gu,lprod_nm) values(LPROD_SEQ.NEXTVAL,?,?)"
			);
	pstmt.setString(1, lprod_gu);
	pstmt.setString(2, lprod_nm);
	pstmt.executeUpdate();
	
}catch(SQLException e){
	e.printStackTrace();
}finally{
	if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
	if(conn!=null) try{conn.close();}catch(SQLException e){}
}
%>
<!DOCTYPE html>
<html>
<head>
<title>LPROD추가 처리</title>
</head>
<body>
	LPROD 테이블에 새로운 레코드 삽입완료
	<input type="button" value="목록" onclick="javascript:location.href='/chapter14/viewLprodList.jsp'">
</body>
</html>