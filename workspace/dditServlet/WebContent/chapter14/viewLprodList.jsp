<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
//1.JDBC드라이버 로딩
/*
- DBMS와 통신을 담당하는 자바 클래스
- DBMS와 통신하기 위해서는 먼저 로딩해 줘야 함
- Class.forName 메서드를 통해 로딩 시 자동으로 jdbc드라이버로 등록함

*/
Class.forName("oracle.jdbc.driver.OracleDriver");

Connection conn = null;   //연결객체 
Statement stmt = null;	  //형식 지정
ResultSet rs = null; 	  //Query 실행 결과를 담을 객체

try{
	//오라클 드라이버 : Thin 드라이버, OCI드라이버.(모듈 설치 필요)
	//JDBC URL : DBMS와 연결을 위한 식별 값
	String jdbcDriver = "jdbc:oracle:thin:@localhost:1521/xe";
	String dbUser = "kim";
	String dbPass = "java";
	String query = "select * from lprod order by lprod_gu";
	//2. 데이터베이스 커넥션 생성
	conn = DriverManager.getConnection(jdbcDriver,dbUser,dbPass);
	//3. Statement 객체 생성
	stmt = conn.createStatement();
	//4. Query 실행 -> resultSet에 저장
	rs = stmt.executeQuery(query);
	%>
<!DOCTYPE html>
<html>
<head>
<title>회원 목록</title>
</head>
<body>
<h2>LPROD 테이블의 내용</h2>
<input type="button" value="LPROD 추가" onclick="javascript:location.href='/chapter14/insertLprodForm.jsp'">

<table border="1" style="width:100% ">
	<tr>
		<th>LPROD_ID</th>
		<th>LPROD_GU</th>
		<th>LPROD_NM</th>
	</tr>
<%
while(rs.next()){	//데이터가 있으면 true 없으면 false
%>
	<tr>
		<td><a href="/chapter14/viewLprod.jsp?lprod_id=<%=rs.getString("LPROD_ID") %>"><%=rs.getString("LPROD_ID") %></a></td>
		<td><%=rs.getString("LPROD_GU")%></td>
		<td><%=rs.getString("LPROD_NM")%></td>
	</tr>
<%
}
%>
</table>
</body>
</html>
	
	<%
}catch(SQLException ex){
	out.print(ex.getMessage());
}finally{
	if(rs!=null) try{rs.close();} catch(SQLException ex){}
	if(stmt!=null) try{stmt.close();} catch(SQLException ex){}
	if(conn!=null) try{conn.close();} catch(SQLException ex){}
	
}
%>