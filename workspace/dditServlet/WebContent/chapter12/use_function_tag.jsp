<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<title>함수사용</title>
</head>
<body>

<c:set var="str1" value="Functions <태그>를 사용합니다."/>
<c:set var="str2" value="사용" />
<c:set var="tokens" value="1,2,3,4,5,6,7,8,9,10" />

str1의 length : ${fn:length(str1)}<br/>
str1을 모두 대문자로 : ${fn:toUpperCase(str1)}<br/>
str1을 모두 소문자로 : ${fn:toLowerCase(str1)}<br/>
substring(str1,3,6) : ${fn:substring(str1,3,6)}<br/>
substringAfter(str1,str2) : ${fn:substringAfter(str1,str2)}<br/>
substringBefore(str1,str2) : ${fn:substringBefore(str1,str2)}<br/>
trim(str1) 좌우 공백 제거 : ${fn:trim(str1)}<br/>
replace(str1, src, dest) 공백을 - 으로 변환 : ${fn:replace(str1," ","-")}<br/>
indexOf(str1,str2) 사용(0부터 시작) : ${fn:indexOf(str1,str2)}<br/>
startWith(str1,str2) Fun으로 시작? : ${fn:startsWith(str1,'Fun')}<br/>
endsWith(str1,str2)합니다.로 끝? : ${fn:endsWith(str1,"합니다.") }<br/>
contains(str1,str2) str1에 str2가포함? : ${fn:contains(str1, str2)}<br/>
containsIgnoreCase(str1, str2) 대소문자 관계없이 str1에 str2가 포함? :${fn:containsIgnoreCase(str1,str2)}<br/>

<c:set var="array" value="${fn:split(tokens, ',')}" />
join(array,"-") 문자열 합침 : "${fn:join(array,'-')}"<br/>
escapeXml(str1) 특수문자처리 (&는 &amp;로 반환) : "${fn:escapeXml(str1)}"
<br/>
< : &lt; <br/>
> : &gt; <br/>
<= : &le; <br/>
>= : &ge; <br/>

</body>
</html>