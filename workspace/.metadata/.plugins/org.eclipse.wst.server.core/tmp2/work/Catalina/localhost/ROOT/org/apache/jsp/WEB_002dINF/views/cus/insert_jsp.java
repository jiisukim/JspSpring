/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-08-24 01:07:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.cus;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/D:/A_TeachingMaterial/6.JspSpring/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/dasuriProj/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"body\">\r\n");
      out.write("	\r\n");
      out.write("	<!-- Content Wrapper. Contains page content -->\r\n");
      out.write("  	<div class=\"content-wrapper\">\r\n");
      out.write("		\r\n");
      out.write("		<!-- Content Header (Page header) -->\r\n");
      out.write("	    <div class=\"content-header\">\r\n");
      out.write("	      <div class=\"container-fluid\">\r\n");
      out.write("	        <div class=\"row mb-2\">\r\n");
      out.write("	          <div class=\"col-sm-6\">\r\n");
      out.write("	            <h1 class=\"m-0\">고객 등록</h1>\r\n");
      out.write("	          </div><!-- /.col -->\r\n");
      out.write("	          <div class=\"col-sm-6\">\r\n");
      out.write("	            <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("	              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("	              <li class=\"breadcrumb-item active\">Dashboard v1</li>\r\n");
      out.write("	            </ol>\r\n");
      out.write("	          </div><!-- /.col -->\r\n");
      out.write("	        </div><!-- /.row -->\r\n");
      out.write("	      </div><!-- /.container-fluid -->\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <!-- /.content-header -->\r\n");
      out.write("		\r\n");
      out.write("		<!-- Main content -->\r\n");
      out.write("	    <section class=\"content\">\r\n");
      out.write("	    	<div class=\"container-fluid\">\r\n");
      out.write("				<div class=\"card card-primary\">\r\n");
      out.write("	              <div class=\"card-header\">\r\n");
      out.write("	                <h3 class=\"card-title\">다수리 고객을 등록합니다.</h3>\r\n");
      out.write("	              </div>\r\n");
      out.write("	              <!-- /.card-header -->\r\n");
      out.write("	              <!-- form start -->\r\n");
      out.write("	              <form action=\"/cus/insert\" method=\"post\" id=\"cusFrm\" \r\n");
      out.write("	                enctype=\"multipart/form-data\">\r\n");
      out.write("	                <div class=\"card-body\">\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusNm\">고객 이름</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"cusNm\" id=\"cusNm\" placeholder=\"이름을 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusPwd\">비밀번호</label>\r\n");
      out.write("	                    <input type=\"password\" class=\"form-control\" name=\"pwd\" id=\"cusPwd\" placeholder=\"비밀번호를 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"zipcode\">우편번호</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"zipcode\" id=\"zipcode\" placeholder=\"우편번호를 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"addr1\">주소</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"addr1\" id=\"addr1\" placeholder=\"주소를 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"addr2\">상세 주소</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"addr2\" id=\"addr2\" placeholder=\"상세 주소를 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"pne\">연락처</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"pne\" id=\"pne\" placeholder=\"연락처를 입력하세요\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusDetail\">상세 정보</label>\r\n");
      out.write("	                  	<textarea class=\"form-control\" name=\"cusDetail\" id=\"cusDetail\"></textarea>  \r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusImage\">사진</label>\r\n");
      out.write("	                    <div class=\"img_wrap\">\r\n");
      out.write("	                    	<img id=\"img\" />\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                    <div class=\"input-group\">\r\n");
      out.write("	                      <div class=\"custom-file\">\r\n");
      out.write("	                        <input type=\"file\" class=\"custom-file-input\" id=\"cusImage\" name=\"cusImage\">\r\n");
      out.write("	                        <label class=\"custom-file-label\" for=\"cusImage\" id=\"cusImageLabel\">사진을 선택하세요</label>\r\n");
      out.write("	                      </div>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                <!-- /.card-body -->\r\n");
      out.write("	                <div class=\"card-footer text-right\">\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-primary\" id=\"btnSubmit\">등록</button>\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='/cus/list'\">취소</button>\r\n");
      out.write("	                </div>\r\n");
      out.write("	              </form>\r\n");
      out.write("	            </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	//e : 이미지가 change된 이벤트\r\n");
      out.write("	function handleImgFileSelect(e){\r\n");
      out.write("		//파일 객체에 이미지 파일을 담음\r\n");
      out.write("		var files = e.target.files;\r\n");
      out.write("		//멀티 파일이라면 배열로 처리\r\n");
      out.write("		var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("		\r\n");
      out.write("		filesArr.forEach(function(f){\r\n");
      out.write("			//파일 객체의 타입이 이미지인지 체킹\r\n");
      out.write("			if(!f.type.match(\"image.*\")){\r\n");
      out.write("				alert(\"확장자는 이미지 확장자만 가능합니다.\");\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			//파일을 sel_file변수에 넣음\r\n");
      out.write("			sel_file = f;\r\n");
      out.write("			//파일을 읽는 reader 객체 생성\r\n");
      out.write("			var reader = new FileReader();	//1)\r\n");
      out.write("			reader.onload = function(e){	//3)\r\n");
      out.write("				//e.target.result : 해당 파일의 명(경로 포함)\r\n");
      out.write("				//<img id='img' /> => <img id='img' src='base64형태의 이미지자체' />\r\n");
      out.write("				$(\"#img\").attr(\"src\", e.target.result);\r\n");
      out.write("				$(\"#cusImageLabel\").text(e.target.result);\r\n");
      out.write("			}\r\n");
      out.write("			//f : filesArr파일 배열에 들었는 파일 객체 자체\r\n");
      out.write("			reader.readAsDataURL(f);	//2) f(이미지파일객체를) 다 읽으면 => onload 됐다라고 인식 -> 3)이동\r\n");
      out.write("		}); //end for\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	$(function() {\r\n");
      out.write("		CKEDITOR.replace(\"cusDetail\");\r\n");
      out.write("		\r\n");
      out.write("		//이미지 미리보기 처리\r\n");
      out.write("		$(\"#cusImage\").on(\"change\",handleImgFileSelect);\r\n");
      out.write("\r\n");
      out.write("		$(\"#btnSubmit\").click(function() {\r\n");
      out.write("			\r\n");
      out.write("			if($(\"#cusNm\").val()==\"\"){\r\n");
      out.write("				alert(\"이름을 입력하세요.\");\r\n");
      out.write("				$(\"#cusNm\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#cusPwd\").val()==\"\"){\r\n");
      out.write("				alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("				$(\"#cusPwd\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#zipcode\").val()==\"\"){\r\n");
      out.write("				alert(\"우편번호를 입력하세요.\");\r\n");
      out.write("				$(\"#zipcode\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#addr1\").val()==\"\"){\r\n");
      out.write("				alert(\"주소를 입력하세요.\");\r\n");
      out.write("				$(\"#addr1\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#addr2\").val()==\"\"){\r\n");
      out.write("				alert(\"상세 주소를 입력하세요.\");\r\n");
      out.write("				$(\"#addr2\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#pne\").val()==\"\"){\r\n");
      out.write("				alert(\"연락처를 입력하세요.\");\r\n");
      out.write("				$(\"#pne\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			var regExp = /^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$/;\r\n");
      out.write("			if(!regExp.test($(\"#pne\").val())){\r\n");
      out.write("				alert(\"연락처는 010-0000-0000 형식으로 입력해주세요.\");\r\n");
      out.write("				$(\"#pne\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if(CKEDITOR.instances.cusDetail.getData()==\"\"){\r\n");
      out.write("				alert(\"상세정보를 입력해주세요.\");\r\n");
      out.write("				CKEDITOR.instances.cusDetail.focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#cusImage\").val()==\"\"){\r\n");
      out.write("				alert(\"사진을 선택하세요.\");\r\n");
      out.write("				$(\"#cusImage\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			$(\"#cusFrm\").submit();\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("</script>");
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
