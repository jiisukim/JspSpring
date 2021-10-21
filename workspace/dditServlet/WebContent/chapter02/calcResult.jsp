<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String firstStr = request.getParameter("a")==null?"0":request.getParameter("a");
	String sikStr = request.getParameter("sik")==null?"+":request.getParameter("sik");
	String secondstStr = request.getParameter("b")==null?"0":request.getParameter("b");
	int firstInt = Integer.parseInt(firstStr); 
	int secondInt = Integer.parseInt(secondstStr); 
	int result= 0;

	if(sikStr.equals("+")){
		result = firstInt + secondInt;
	}else if(sikStr.equals("-")){
		result = firstInt - secondInt;
	}else if(sikStr.equals("X")){
		result = firstInt * secondInt;
	}

%>

{
	"result" : "<%=result%>"
} 