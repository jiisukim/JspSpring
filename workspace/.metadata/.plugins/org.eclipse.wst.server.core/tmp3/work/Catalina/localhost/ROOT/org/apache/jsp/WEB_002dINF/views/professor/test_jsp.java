/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-09-03 02:43:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.professor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1627018532952L));
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp3/wtpwebapps/camb/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"card shadow mb-4\">\r\n");
      out.write("                        <div class=\"card-header py-3\">\r\n");
      out.write("                            <h6 class=\"m-0 font-weight-bold text-primary\">DataTables Example</h6>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <div class=\"table-responsive\">\r\n");
      out.write("                                <div id=\"dataTable_wrapper\" class=\"dataTables_wrapper dt-bootstrap4\"><div class=\"row\"><div class=\"col-sm-12 col-md-6\"><div class=\"dataTables_length\" id=\"dataTable_length\"><label>Show <select name=\"dataTable_length\" aria-controls=\"dataTable\" class=\"custom-select custom-select-sm form-control form-control-sm\"><option value=\"10\">10</option><option value=\"25\">25</option><option value=\"50\">50</option><option value=\"100\">100</option></select> entries</label></div></div><div class=\"col-sm-12 col-md-6\"><div id=\"dataTable_filter\" class=\"dataTables_filter\"><label>Search:<input type=\"search\" class=\"form-control form-control-sm\" placeholder=\"\" aria-controls=\"dataTable\"></label></div></div></div><div class=\"row\"><div class=\"col-sm-12\"><table class=\"table table-bordered dataTable\" id=\"dataTable\" width=\"100%\" cellspacing=\"0\" role=\"grid\" aria-describedby=\"dataTable_info\" style=\"width: 100%;\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr role=\"row\"><th class=\"sorting sorting_desc\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Name: activate to sort column ascending\" aria-sort=\"descending\" style=\"width: 181px;\">Name</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Position: activate to sort column ascending\" style=\"width: 275px;\">Position</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Office: activate to sort column ascending\" style=\"width: 130px;\">Office</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Age: activate to sort column ascending\" style=\"width: 60px;\">Age</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Start date: activate to sort column ascending\" style=\"width: 123px;\">Start date</th><th class=\"sorting\" tabindex=\"0\" aria-controls=\"dataTable\" rowspan=\"1\" colspan=\"1\" aria-label=\"Salary: activate to sort column ascending\" style=\"width: 110px;\">Salary</th></tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("                                    <tfoot>\r\n");
      out.write("                                        <tr><th rowspan=\"1\" colspan=\"1\">Name</th><th rowspan=\"1\" colspan=\"1\">Position</th><th rowspan=\"1\" colspan=\"1\">Office</th><th rowspan=\"1\" colspan=\"1\">Age</th><th rowspan=\"1\" colspan=\"1\">Start date</th><th rowspan=\"1\" colspan=\"1\">Salary</th></tr>\r\n");
      out.write("                                    </tfoot>\r\n");
      out.write("                                    <tbody>                                        \r\n");
      out.write("                                    <tr class=\"odd\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Zorita Serrano</td>\r\n");
      out.write("                                            <td class=\"\">Software Engineer</td>\r\n");
      out.write("                                            <td class=\"\">San Francisco</td>\r\n");
      out.write("                                            <td class=\"\">56</td>\r\n");
      out.write("                                            <td class=\"\">2012/06/01</td>\r\n");
      out.write("                                            <td>$115,000</td>\r\n");
      out.write("                                        </tr><tr class=\"even\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Zenaida Frank</td>\r\n");
      out.write("                                            <td class=\"\">Software Engineer</td>\r\n");
      out.write("                                            <td class=\"\">New York</td>\r\n");
      out.write("                                            <td class=\"\">63</td>\r\n");
      out.write("                                            <td class=\"\">2010/01/04</td>\r\n");
      out.write("                                            <td>$125,250</td>\r\n");
      out.write("                                        </tr><tr class=\"odd\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Yuri Berry</td>\r\n");
      out.write("                                            <td class=\"\">Chief Marketing Officer (CMO)</td>\r\n");
      out.write("                                            <td class=\"\">New York</td>\r\n");
      out.write("                                            <td class=\"\">40</td>\r\n");
      out.write("                                            <td class=\"\">2009/06/25</td>\r\n");
      out.write("                                            <td>$675,000</td>\r\n");
      out.write("                                        </tr><tr class=\"even\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Vivian Harrell</td>\r\n");
      out.write("                                            <td class=\"\">Financial Controller</td>\r\n");
      out.write("                                            <td class=\"\">San Francisco</td>\r\n");
      out.write("                                            <td class=\"\">62</td>\r\n");
      out.write("                                            <td class=\"\">2009/02/14</td>\r\n");
      out.write("                                            <td>$452,500</td>\r\n");
      out.write("                                        </tr><tr class=\"odd\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Unity Butler</td>\r\n");
      out.write("                                            <td class=\"\">Marketing Designer</td>\r\n");
      out.write("                                            <td class=\"\">San Francisco</td>\r\n");
      out.write("                                            <td class=\"\">47</td>\r\n");
      out.write("                                            <td class=\"\">2009/12/09</td>\r\n");
      out.write("                                            <td>$85,675</td>\r\n");
      out.write("                                        </tr><tr class=\"even\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Timothy Mooney</td>\r\n");
      out.write("                                            <td class=\"\">Office Manager</td>\r\n");
      out.write("                                            <td class=\"\">London</td>\r\n");
      out.write("                                            <td class=\"\">37</td>\r\n");
      out.write("                                            <td class=\"\">2008/12/11</td>\r\n");
      out.write("                                            <td>$136,200</td>\r\n");
      out.write("                                        </tr><tr class=\"odd\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Tiger Nixon</td>\r\n");
      out.write("                                            <td class=\"\">System Architect</td>\r\n");
      out.write("                                            <td class=\"\">Edinburgh</td>\r\n");
      out.write("                                            <td class=\"\">61</td>\r\n");
      out.write("                                            <td class=\"\">2011/04/25</td>\r\n");
      out.write("                                            <td>$320,800</td>\r\n");
      out.write("                                        </tr><tr class=\"even\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Thor Walton</td>\r\n");
      out.write("                                            <td class=\"\">Developer</td>\r\n");
      out.write("                                            <td class=\"\">New York</td>\r\n");
      out.write("                                            <td class=\"\">61</td>\r\n");
      out.write("                                            <td class=\"\">2013/08/11</td>\r\n");
      out.write("                                            <td>$98,540</td>\r\n");
      out.write("                                        </tr><tr class=\"odd\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Tatyana Fitzpatrick</td>\r\n");
      out.write("                                            <td class=\"\">Regional Director</td>\r\n");
      out.write("                                            <td class=\"\">London</td>\r\n");
      out.write("                                            <td class=\"\">19</td>\r\n");
      out.write("                                            <td class=\"\">2010/03/17</td>\r\n");
      out.write("                                            <td>$385,750</td>\r\n");
      out.write("                                        </tr><tr class=\"even\">\r\n");
      out.write("                                            <td class=\"sorting_1\">Suki Burks</td>\r\n");
      out.write("                                            <td class=\"\">Developer</td>\r\n");
      out.write("                                            <td class=\"\">London</td>\r\n");
      out.write("                                            <td class=\"\">53</td>\r\n");
      out.write("                                            <td class=\"\">2009/10/22</td>\r\n");
      out.write("                                            <td>$114,500</td>\r\n");
      out.write("                                        </tr></tbody>\r\n");
      out.write("                                </table></div></div><div class=\"row\"><div class=\"col-sm-12 col-md-5\"><div class=\"dataTables_info\" id=\"dataTable_info\" role=\"status\" aria-live=\"polite\">Showing 1 to 10 of 57 entries</div></div><div class=\"col-sm-12 col-md-7\"><div class=\"dataTables_paginate paging_simple_numbers\" id=\"dataTable_paginate\"><ul class=\"pagination\"><li class=\"paginate_button page-item previous disabled\" id=\"dataTable_previous\"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"0\" tabindex=\"0\" class=\"page-link\">Previous</a></li><li class=\"paginate_button page-item active\"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"1\" tabindex=\"0\" class=\"page-link\">1</a></li><li class=\"paginate_button page-item \"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"2\" tabindex=\"0\" class=\"page-link\">2</a></li><li class=\"paginate_button page-item \"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"3\" tabindex=\"0\" class=\"page-link\">3</a></li><li class=\"paginate_button page-item \"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"4\" tabindex=\"0\" class=\"page-link\">4</a></li><li class=\"paginate_button page-item \"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"5\" tabindex=\"0\" class=\"page-link\">5</a></li><li class=\"paginate_button page-item \"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"6\" tabindex=\"0\" class=\"page-link\">6</a></li><li class=\"paginate_button page-item next\" id=\"dataTable_next\"><a href=\"#\" aria-controls=\"dataTable\" data-dt-idx=\"7\" tabindex=\"0\" class=\"page-link\">Next</a></li></ul></div></div></div></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
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
