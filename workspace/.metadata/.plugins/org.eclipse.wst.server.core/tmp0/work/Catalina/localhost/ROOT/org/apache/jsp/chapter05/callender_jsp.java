/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-07-01 03:51:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.chapter05;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class callender_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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

      out.write('\r');
      out.write('\n');

	String ddStr = request.getParameter("dd")==null?"32":request.getParameter("dd");

	int ddInt = Integer.parseInt(ddStr);

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>??????</title>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	function fn_chg(dd) {\r\n");
      out.write("		console.log(dd.value); // ?????? ???\r\n");
      out.write("		\r\n");
      out.write("		location.href = \"/chapter05/callender.jsp?dd=\"+ dd.value;\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  1????????? 31????????? ?????????. ????????? ????????? ?dd=1 => ????????? ?????? ????????? ????????? ?????? -->\r\n");
      out.write("<select name=\"sel\" id=\"sel\" onchange=\"fn_chg(this)\">\r\n");
      out.write("	<option>??????</option>\r\n");
for(int i=1; i<=31; i++){ 
      out.write("\r\n");
      out.write("	<option value=\"");
      out.print(i );
      out.write('"');
      out.write(' ');
if(ddInt==i){out.print("selected='selected'");} 
      out.write('>');
      out.print(i );
      out.write("???</option>\r\n");
} 
      out.write("	\r\n");
      out.write("</select>\r\n");
      out.write("<table border=\"1\" style=\"width: 50%; text-align: center;\" id=\"callender\">\r\n");
      out.write("	<tr>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("		<th>???</th>\r\n");
      out.write("	</tr>\r\n");
      out.write("	<tr>\r\n");
      out.write("	");

	//blank??? 7??? ????????????, ?????? ????????? ?????? 7??? ????????? 
	// ????????? ????????? ????????? 1??? ??????. 31?????? ???????????? 4??? ?????????
	int blank = 7;
	for(int i=1; i<=31; i++){ 
		if(i == ddInt){
			out.print("<td style='background-color: pink'>"+i+"</td>");
		}else{
			out.print("<td>"+i+"</td>");
		}
		blank--;
		if(i%7 == 0){
			out.print("</tr><tr>");
			blank = 7;
		}
		
	}
	for(int j = 0; j<blank; j++){
		out.print("<td>&nbsp;</td>");
	}
	
	
      out.write("\r\n");
      out.write("	</tr>\r\n");
      out.write("	\r\n");
      out.write("</table>	\r\n");
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
