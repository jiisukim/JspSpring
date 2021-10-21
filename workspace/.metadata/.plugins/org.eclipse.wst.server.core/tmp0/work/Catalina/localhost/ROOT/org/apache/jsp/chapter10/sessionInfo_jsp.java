/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-09 06:57:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.chapter10;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class sessionInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.Date");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

//long 타입의 시간 값을 저장하기 위해 사용
Date time = new Date();
// Date 객체의 시간 값을 지정한 양식으로 출력
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>세션정보</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--	* 세션 * \r\n");
      out.write("	1. 세션은 웹 컨테이너(tomcat)에 정보를 보관할 때 사용. 세션은 오직 서버에만 생성\r\n");
      out.write("	2. 쿠키와의 차이점은 세션은 웹 브라우저가 아니라 서버에 값을 저장\r\n");
      out.write("	3. 서버는 세션을 사용해서 클라이언트 상태를 유지하므로 로그인한 사용자 정보를 유지하기 위한 목적으로 이용\r\n");
      out.write("	4. 웹 컨테이너(tomcat)는 기본적으로 한 웹 브라우저(크롬, 파이어폭스, IE..)마다 한 세션을 각각 생성\r\n");
      out.write("	5. 같은 JSP 페이지라도 웹 브라우저에 따라 서로 다른 세션을 사용\r\n");
      out.write("	6. page 디렉티브의 session 속성의 기본값은 true. 즉, false로 억지로 지정하지만 않으면 자동으로 생성됨\r\n");
      out.write("	7. 웹브라우저가 처음 접속 시 세션을 1회 생성하고, 그 이후로는 이미 생성된 세션을 사용함\r\n");
      out.write("	8. 웹서버는 세션ID를 이용해서 웹 브라우저를 위한 세션을 찾음. JSESSIONID인 쿠키가 웹 서버와 웹 브라우저의 세션 ID를 공유할 수 있도록 해줌 	\r\n");
      out.write(" -->\r\n");
      out.write("세션ID : ");
      out.print(session.getId() );
      out.write('\r');
      out.write('\n');

// 세션의 생성 시간을 가져와서  Date 객체인 time에 저장
time.setTime(session.getCreationTime()); 

      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("세션 생성 시간 :  ");
      out.print(formatter.format(time) );
      out.write('\r');
      out.write('\n');

// 세션에 가장 최근에 접근한 시간(1970년 1월 1일 이후 흘러간 시간. 1/1000초)
time.setTime(session.getLastAccessedTime());

      out.write("\r\n");
      out.write("<br>\r\n");
      out.write("최근 접근 시간 : ");
      out.print(formatter.format(time) );
      out.write("\r\n");
      out.write("<br/>\r\n");

String memberId = (String)session.getAttribute("MEMBERID");
String memberName = (String)session.getAttribute("NAME");
if(memberId != null){
	out.print(memberName+"("+ memberId +")님 환영합니다.");
	
      out.write("\r\n");
      out.write("	<a href=\"/chapter10/closeSession.jsp\">로그아웃</a>	\r\n");
      out.write("	\r\n");

}else{

      out.write("\r\n");
      out.write("	<a href=\"/chapter10/setMemberInfo.jsp\">로그인</a>\r\n");
      out.write("\r\n");

}

      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
