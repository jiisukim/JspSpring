<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>자유게시판 목록</title>
</head>
<body>
<table border="1" style="width: 100%;" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="2">
			<jsp:include page="/module/top.jsp" flush="false" />
		</td>
	</tr>
	<tr>
		<td style="width: 30%" valign="top">
			<jsp:include page="/module/left.jsp" />		
		</td>
		<td>
			<table border="1" style="width: 100%;">
				<tr>
					<td colspan="4"><a href="/chapter07/freeboardwrite.jsp">[게시글 쓰기]</a></td>
				</tr>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>조회수</th>
				</tr>
				
<%
String currentPageStr = request.getParameter("currentPage");
int currentPage = Integer.parseInt(currentPageStr);

//글 전체 개수
// select  COUNT(*) TOTAL FREEBOARD; => 120행
int total = 121;

int totalPages = total / 10;

//121%10 => 1 => 전체 페이지 수를 1 증가    [나머지 개념]	(전체 행 수 / 한 화면에 보여지는 size 했을 때 딱 떨어지지 않고 넘쳤을 때...)
//12페이지는 120행을 커버하는데 문제는 121행처럼 1행이 넘쳤을 때에는 13페이지로 처리해줘야 하므로..
if(total%10>0){
	totalPages++;
}
//현재 페이지를 5개로 나눈 나머지
int modVal = currentPage % 5 ;
//시작페이지 [이전] 1	2	3	4	5 [다음] ==> 1
int startPage = ((currentPage / 5) * 5) +1;	//1 / 5  = 0.2(int형이라 0)// 0* 5 = 0 // 0 + 1 = 1 
if(modVal == 0) startPage -= 5; //  보정작업
//종료페이지[이전] 1	2	3	4	5 [다음] ==> 5
int endPage = startPage + 4;
if(endPage > totalPages) endPage = totalPages;

int startNum = (currentPage *10) - 9;
int endNum = currentPage*10;


for(int i =startNum; i<=endNum; i++){ %>	
		<%if(i>total){ 
		}else{%>
					
				<tr>
					<td><%=i %></td>				
					<td>제목<%=i %></td>				
					<td>작성자<%=i %></td>				
					<td>0</td>				
				</tr>
	<%}
		}%>
				<tr style="text-align: center;">
					<td colspan="4" >
					<%if(startPage>5){%>
					<a href="/chapter07/freeboard.jsp?currentPage=<%=startPage-5 %>">[이전]</a>
					<%} %>
					<%for(int j= startPage; j<=endPage; j++){ %>
						<a href="/chapter07/freeboard.jsp?currentPage=<%=(j)%>">
					  		<%=(j) %>&nbsp;
					  	</a>
					 <%} %>
					 <%if(endPage < totalPages) {%>
					 <a href="/chapter07/freeboard.jsp?currentPage=<%=startPage+5 %>">[다음]</a>
					 <%} %>
					 </td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<jsp:include page="/module/bottom.jsp" />
		</td>
	</tr>

</table>

</body>
</html>