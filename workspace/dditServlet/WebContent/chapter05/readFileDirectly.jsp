<%@page import="java.io.IOException"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>절대 경로를 사용하여 자원 읽기</title>
</head>
<body>
<%
String filePath = "D:\\A_TeachingMaterial\\6.JspSpring\\workspace\\dditServlet\\WebContent\\chapter05\\message\\notice.txt";

char[] buff = new char[128];
int len = 0;
//notice .txt로부터 내용을읽어오는 스트림을 생성함 
try{
	InputStreamReader fr = new InputStreamReader(new FileInputStream(filePath),"UTF-8");
	//notice.txt로 부터 읽어온 데티러를 out 기본 객체를 사용하여 웹 브라우저에 출력함
	while((len = fr.read(buff))!= -1){ // -1 : 읽을게 없다
		// 읽을 것이 있을 때..
		out.print(new String(buff,0,len));
	}
}catch(IOException e){
	out.print("Exception 발생 : " + e.getMessage());
}

%>
</body>
</html>