<%@page import="org.apache.jasper.tagplugins.jstl.core.Catch"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("UTF-8");

String memberid = request.getParameter("memberid");
String password = request.getParameter("password");
String name = request.getParameter("name");
String email = request.getParameter("email");


Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;
PreparedStatement pstmt = null;
/*
 * PreparedStatement
 - 간결한 코드를 위해
 - 값 변환을 자동으로 처리하기 위해
 - 검색 조건과 같이 값을 지정해야 하는 쿼리 실행시 선호함
*/

try{
	String jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe";
	String dbUser = "jspexam";
	String dbPass = "java";
	
	conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
	//실행할 쿼리를 생성
	pstmt = conn.prepareStatement(
			"insert into member(memberid,password,name,email) values(?,?,?,?)"
			);
	pstmt.setString(1, memberid);
	pstmt.setString(2, password);
	pstmt.setString(3, name);
	pstmt.setString(4, email);
	pstmt.executeUpdate();
}finally{
	if(pstmt!=null) try{pstmt.close();} catch(SQLException e){}
	if(conn!=null) try{conn.close();}catch(SQLException e){}
}

%>
<!DOCTYPE html>
<html>
<head>
<title>회원 가입 처리</title>
</head>
<body>
	MEMBER 테이블에 새로운 레코드 삽입완료
</body>
</html>