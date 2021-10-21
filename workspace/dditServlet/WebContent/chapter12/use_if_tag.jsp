<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="chapter11.vo.StudentVO"%>
<%
StudentVO studentVo = new StudentVO();

Map<String,String> map = new HashMap<>();
%>
<!DOCTYPE html>
<html>
<head>
<title>JST if태그 연습</title>
</head>
<body>
<!-- 조건문의 값이 true이므로 항상 실행됨 -->
<c:if test="true">
작성자 : 홍길동<br />
</c:if>
<!-- ..use_if_tag.jsp?name=ddit -->
<c:if test="${param.name == 'ddit'}">
name 파라미터의 값이 ${param.name}입니다. <br />
</c:if>
<c:if test="${empty param.name}">
name 파라미터가 없습니다. <br />
</c:if>
<!-- ..use_if_tag.jsp?name=ddit&age=25 -->
<c:if test="${21 < param.age}">
당신의 나이는 21세 이상입니다.
</c:if>
<!-- 
* JSTL?
 - jsp:include와 같은 태그를 개발자가 추가할 수 있음(커스텀 태그)
      커스텀 태그 중에서 많이 사용되는 것들을 모아
   JSTL(JSP Standard Tag Library)이라는 표준을 만듦
 - JSTL을 사용하면 스크립트릿 코드의 사용을 줄이면서 간결하고
      이해하기 쉬운 JSP코드를 작성할 수 있음
* 코어 태그(c)
 - 변수지원(set, remove)
 - 흐름제어(if, choose, forEach, forTokens)
 - URL처리(import, redirect, url)
 - 기타태그(catch, out)
 -->
<br />
<!-- scope= page, request, session, application / 기본값은 page -->
<c:set var="name" value="개똥이" scope="request"/> <!-- String을 넣고 -->
${name}<br />
<c:if test="${name=='개똥이'}">
동일함<br />
<c:if test="${name!='개똥이'}">
동일안함<br />
</c:if>
</c:if>
<c:set target="<%=studentVo%>" property="studentName" value="개똥이" />
1. <%=studentVo.getStudentName()%><br />
<br />
<c:set var="student" value="<%=studentVo %>" /> <!-- 객체를 넣음 -->
2. ${student.studentName}<br />
<c:set target="${student}" property="studentNo" value="202107001"></c:set>
2_2. ${student.studentNo}<br/>
<hr/>
<c:set target="<%=map %>" property="id" value="a001" />	<!-- [ property = name과 비슷한 개념 ]-->
1. <%=map.get("id") %> <br/>

<c:set var="map2" value="<%=map %>"></c:set>	<!-- 변수설정 [map2(key)에 값은 map(a001)] -->
<c:set target="${map2}" property="name" value="김은대"></c:set>	<!-- 값 변경 [map2의 name 값은 김은대로 변경]-->
2. ${map2.name}

<!-- 
5. c:set 태그의 속성들

- value 속성 : 값을 입력합니다.  EL을 사용할 수 있습니다.

- target 속성 : 프로퍼티를 설정할 빈 또는 맵을 가집니다.

- property 속성 : 설정할 프로퍼티 입니다.

- var 속성 : 값이 저장되는 변수명 입니다.

- scope 속성 : 변수가 저장된  Scope 입니다. page, request, session, application 을 가질 수 있고, 기본값은 page 입니다.

 -->

</body>
</html>