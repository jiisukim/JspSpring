<%@page import="chapter11.vo.StudentVO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.LinkedList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setAttribute("name", "개똥이");
%>    
    
<!DOCTYPE html>
<html>
<head>
<title>EL Object</title>
</head>
<body>
<!-- request기본 객체의 name 속성의 값을 가져옴 -->
<%=request.getAttribute("name") %><br/>
<!--  request 영역에 저장된 name 속성의 값을 가져옴 -->
request객체의 name 속성 :  ${requestScope.name}<br/>

요청 URI : ${pageContext.request.requestURI}<br/>
code 파라미터 : ${param.code}
<!-- 
*표현 언어(Expression Language)
- JSP에서 사용 가능한 새로운 스크립트 언어
- 간단한 구문 때문에 표현식(꺽임쇠 퍼센트 =) 대신 사용함
- JSP의 네가지 기본 객체가 제공하는 영역의  속성 사용
 (page,request,response, application)
 - 집합 객체에 대한 접근 방법 제공
 - 수치 / 관계 / 논리 연산자 제공
 - 자바 클래스의 메서드 호출 기능 제공
 - 표현언어만의 기본 객체 제공
 - 스크립트 요소(스크립트릿, 표현식, 선언부)를 제외한 나머지 부분에서 사용
 -->
 
1. EL 리터럴 표현식 <br/>
문자열 : ${"apple"}<br/>
나는 ${'학교'}에 갑니다<br/>
맥날 아이스 아메리카노 가격은 ${1000}원입니다.<br/>
파이는 ${3.14} 이다.
오늘 아침 식사를 하셨나요?  ${true}<br/>
null 표현?  "${null}" (빈문자열 whitespace) <br/>
<%
int[] intArr = new int[]{100,90,87,70,60};
out.print("intArr.length : " + intArr.length + "<br/>");
//pageContext : PAGE 기본 영역의 속성에 배열을 저장
pageContext.setAttribute("jumsu", intArr);
%>
${jumsu[2]}<br/>
<%
//이렇게는 잘 안되므로 JSTL때 반복 처리를 배워서 하자
for(int i =0; i<intArr.length; i++){
	out.print("${jumsu["+i+"]}<br/>");
}
%>
3.  List <br/>
<%
List<String> list = new LinkedList<>();
list.add("사과");
list.add("바나나");
list.add("오랜지");

pageContext.setAttribute("list", list);
%>
<!-- PageScope, requestScope, sessionScope, applicationScope -->
${pageScope.list[0]}<br/>${list[1]}<br/>${list[2]}<br/>
<!-- 
기본객체			|영역이름				|보관소
----------------------------------------------------
PAGE			|pageScope			|pageContext
REQUEST         |requestScope       |sevletRequest
SESSION         |sessionScope       |httpSession
APPLICATION     |applicationScope   |servletContext
 -->
4. Map<br/>
<%
Map<String, String> map = new HashMap<>();
map.put("id","a001");
map.put("name","개똥이");
map.put("age","25");

pageContext.setAttribute("map",map);
%>
${map["id"]}<br/>${map["name"]}<br/>${map["age"]}<br/>
${map.id}<br/>${map.name}<br/>${map.age}<br/>

5. 자바 객체 <br/>
<%
// 자바빈 클래스를 인스턴스화 하여 객체를 생성
StudentVO studentVo = new StudentVO();
studentVo.setStudentNo("20210701");
studentVo.setStudentName("개똥이");

pageContext.setAttribute("student", studentVo);
%>

${student.studentNo}<br/> ${student.studentName}<br/>

6. 산술 연산자 <br/>
${1+2}<br/>${1-2}<br/>${2*10}<br/>${5/2}<br/>
${5%2}<br/>${5 mod 2}<br/> <!-- % == mod  || 5/2 == 5 div 2-->

7.논리 연산자<br/>
${5==5 && 7==7} <br/> ${5==5 and 7!=7}<br/>
${5==5 || 7==7} <br/> ${5==5 or 7!=7}<br/>
${not true} <br/> ${!true}<br/> ${!("사과"=="사과")}<br/>

8.비교연산자 <br/>
${5==5} <br/> ${5 eq 5}<br/>
<%-- ${5!=5} <br/> ${5 ne 5}<br/> --%>
less than :  &nbsp; ${5<7} <br/> ${5 lt 7} <br/>
less than equal : &nbsp; ${5<=7} <br/> ${5 le 7}<br/>
greater than : &nbsp; ${5>7} <br/> ${5 gt 7}<br/>
greater than equal : &nbsp; ${5>=7} <br/> ${5 ge 7}<br/>

9. null 체킹 <br/>
${empty student}, ${empty studentVo2} <br/>

10. 3항연산자 <br/>
${empty param.code?"없음":param.code}<br>
<!-- http://localhost:8090/chapter11/useELObject.jsp -->
<!-- http://localhost:8090/chapter11/useELObject.jsp?userId=a001 -->

5+5가 출력됨 : ${1 + 1; 5 + 5} <br/>

</body>
</html>