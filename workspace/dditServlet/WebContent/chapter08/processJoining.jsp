<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
//읽어오는 파라미터의 캐릭터 인코딩을 UTF-8로 지정함
request.setCharacterEncoding("UTF-8");
%>

<!-- MemberInfo 자바빈 클래스의 객체를 생성. memberInfo 이름으로 저장 -->
<jsp:useBean id="memberInfo" class="chapter08.member.MemberInfo" />
<jsp:setProperty property="*" name="memberInfo"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<!-- 
[회원가입]버튼을 누르면 파라미터로 전송된 데이터가 자바빈 객체의 프로퍼티 값으로 지정됨
jsp:setProperty 액션태그를 사용하려면 파라미터 이름과 자바빈 프로퍼티의 이름을 동일
 -->
	<table border="1">
		<tr>
			<th>아이디</th>
			<td colspan="3">
			<jsp:getProperty property="id" name="memberInfo"/>
			</td>
		</tr>
		<tr>
			<th>이름</th>
			<td><jsp:getProperty property="name" name="memberInfo"/></td>
			<th>이메일</th>
			<td><jsp:getProperty property="email" name="memberInfo"/></td>
		</tr>
		<tr>
			<td colspan="4" style="text-align: center;"></td>
		</tr>
	</table>
</body>
</html>