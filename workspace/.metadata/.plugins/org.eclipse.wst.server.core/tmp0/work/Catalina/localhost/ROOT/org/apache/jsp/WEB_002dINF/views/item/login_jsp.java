/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-08-02 05:46:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/dditProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1627018532952L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<!-- servlet-context에 경로 명시 -->\r\n");
      out.write("<script src=\"/resources/js/jquery.min.js\"></script>\r\n");
      out.write("<title>로그인</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("//   $(\"#btnLogin\").click(function(){})\r\n");
      out.write("   $(\"#btnLogin\").on(\"click\",function(){\r\n");
      out.write("      var id=$(\"#id\").val();\r\n");
      out.write("      var pwd=$(\"#pwd\").val();\r\n");
      out.write("      var param={\"id\":id,\"pwd\":pwd}; // jsp데이터\r\n");
      out.write("      $.ajax ({\r\n");
      out.write("         type:\"post\",\r\n");
      out.write("         url:\"/item/login_result\",\r\n");
      out.write("         data:param,\r\n");
      out.write("         success:function(result){\r\n");
      out.write("            console.log(\"result\" + result)\r\n");
      out.write("            console.log(\"위치 : \" + result.indexOf(\"환영합니다.\"));\r\n");
      out.write("           	var pos = result.indexOf(\"환영합니다\");\r\n");
      out.write("           	\r\n");
      out.write("           	if(pos>0){\r\n");
      out.write("	      		$(\"#spnIn\").css(\"display\",\"none\");\r\n");
      out.write("	      		$(\"#spanOut\").css(\"display\",\"block\");\r\n");
      out.write("	            // result : login_result.jsp 포워딩 결과를 html메소드로 id가 result인 div에 넣어줌\r\n");
      out.write("           	}\r\n");
      out.write("            $(\"#result\").html(result);\r\n");
      out.write("         }\r\n");
      out.write("      })\r\n");
      out.write("   });\r\n");
      out.write("$(\"#btnLogout\").on(\"click\",function(){\r\n");
      out.write("	//form id=\"frm\" .. 객체를 변수에 넣음\r\n");
      out.write("	var formObj = $(\"#frm\");\r\n");
      out.write("// 	formObj.attr(\"action\",\"/item/logout\");\r\n");
      out.write("// 	formObj.attr(\"method\",\"get\");\r\n");
      out.write("	formObj.submit();\r\n");
      out.write("	\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 로그인 영역 시작 -->\r\n");
      out.write("<span id=\"spnIn\" style=\"display: block;\">\r\n");
      out.write("id : <input type=\"text\" id=\"id\" />\r\n");
      out.write("pwd : <input type=\"password\" id=\"pwd\" /><br />\r\n");
      out.write("<input type=\"button\" id=\"btnLogin\" value=\"로그인\" />\r\n");
      out.write("</span>\r\n");
      out.write("<!-- 로그인 영역 끝 -->\r\n");
      out.write("<!-- 로그아웃 영역 시작 -->\r\n");
      out.write("<span id=\"spanOut\" style=\"display: none;\">\r\n");
      out.write("<form id=\"frm\" action=\"/item/logout\" method=\"get\">\r\n");
      out.write("	<input type=\"button\" id=\"btnLogout\" value=\"로그아웃\" />\r\n");
      out.write("</form>\r\n");
      out.write("</span>\r\n");
      out.write("<!-- 로그아웃영역 끝 -->\r\n");
      out.write("<div id=\"result\"></div>\r\n");
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
