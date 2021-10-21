<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("UTF-8");
String memberid =request.getParameter("memberid");
String name = request.getParameter("name");
int updateCount =0;
//jdbc드라이버 로딩
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;
Statement stmt = null;

try{
	String  jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe"; //xe : sequence아이디  [식별하는아이디]
	String dbUser = "jspexam";
	String dbPass = "java";
	
	String query = "update member "
				 + "set name =  '"+ name +"' "
				 + "where memberid = '"+ memberid +"'";
	
	//데이터베이스와 연결된 Connection을 생성
	conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
	//Connection으로부터 StateMent(형식)를 생성
	stmt = conn.createStatement();
	//return : 변경된 레코드 개수(0보다 크면 변경된 값이 존재)
	/*
	- ResultSet executeQuery(String query) : Select 쿼리 실행시
	- int executeUpdate(String query) : INSERT,UPDATE,DELETE 쿼리 실행시 실행
	*/
	updateCount = stmt.executeUpdate(query);
}catch(SQLException e){
	e.printStackTrace();
}finally{
	if(stmt != null) try{stmt.close();}catch(SQLException e){}
	if(conn != null) try{conn.close();}catch(SQLException e){}
}
%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
if(updateCount > 0){ //업데이트가 되었다면
	out.print(name + "으로 이름 변경 성공");
}else{
	out.print(memberid + " 아이디가 없습니다.");
}
%>
</body>
</html>