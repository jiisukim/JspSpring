<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
request.setCharacterEncoding("UTF-8");
String lprod_id= request.getParameter("lprod_id");
String lprod_gu= request.getParameter("lprod_gu");
String lprod_nm= request.getParameter("lprod_nm");
int updateCount =0;
//jdbc드라이버 로딩
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;
Statement stmt = null;

try{
	String  jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe"; //xe : sequence아이디  [식별하는아이디]
	String dbUser = "kim";
	String dbPass = "java";
	
	String query = "update lprod "
				 + "set lprod_gu =  '"+ lprod_gu +"', "
				 + "lprod_nm =  '"+ lprod_nm +"' "
				 + "where lprod_id = '"+ lprod_id +"'";
	conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
	stmt = conn.createStatement();
	
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
	out.print("업데이트 성공");
}else{
	out.print(lprod_id + " 아이디가 없습니다.");
}
%>
<input type="button" value="목록" onclick="javascript:location.href='/chapter14/viewLprodList.jsp'">
</body>
</html>