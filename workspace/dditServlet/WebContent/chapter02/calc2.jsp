<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!	// 선언부(Declaration)를 시작함
/*
	스크립트 릿이나 표현식에서 사용할 수 있는 함수를 작성할 때 사용.
	선언부의 함수는 자바의 메서드와 동일
	정수 값: int , short, long
	실수 값 : float, double
	
*/
/*
	<메서드 이름규칙>
	첫 글자 : 문자(알파벳 대소문자) 또는 밑줄로 시작
	첫 글자 제외한 나머지는 문자와 숫자 그리고 밑줄의 조합
	
*/
// 접근 제한자
public int add(int a, int b){
	int c = a + b;
	return c;
}
public int subtract(int a, int b){
	int c = a - b;
	return c;
}

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table{
		
		border-collapse: collapse;
	}
	td{
		width: 100px;
	}
	tr,td,th{
		border: 1px solid black;
		height: 50px;
	}
</style>
</head>
<body>
	<div>
		<form>
		<table>
			<tr>
				<td colspan="4">계산기</td>
			</tr>
			<tr>
				<td colspan="4">표준</td>
			</tr>
			<tr>
				<td colspan="4" id="result">0</td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td><button type="reset">C</button></td>
				<td></td>				
			</tr>
			<tr>
				<td><button type="button" value="7">7</button></td>
				<td><button type="button">8</button></td>
				<td><button type="button">9</button></td>
				<td><button type="button">X</button></td>							
			</tr>
			<tr>
				<td><button type="button">4</button></td>
				<td><button type="button">5</button></td>
				<td><button type="button">6</button></td>
				<td><button type="button">-</button></td>							
			</tr>
			<tr>
				<td><button type="button">1</button></td>
				<td><button type="button">2</button></td>
				<td><button type="button">3</button></td>
				<td><button type="button">+</button></td>							
			</tr>
			<tr>
				<td></td>
				<td><button type="button">0</button></td>
				<td></td>
				<td><button type="button">=</button></td>							
			</tr>
		</table>
		</form>
	</div>
</body>
</html>