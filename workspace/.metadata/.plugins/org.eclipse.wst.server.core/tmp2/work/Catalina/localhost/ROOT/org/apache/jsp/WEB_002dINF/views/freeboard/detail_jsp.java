/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.68
 * Generated at: 2021-08-24 04:47:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.freeboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      out.write("<style>\r\n");
      out.write(".form-control2 {\r\n");
      out.write("  display: block;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  height: calc(2.25rem + 2px);\r\n");
      out.write("  padding: 0.375rem 0.75rem;\r\n");
      out.write("  font-size: 1rem;\r\n");
      out.write("  font-weight: 400;\r\n");
      out.write("  line-height: 1.5;\r\n");
      out.write("  color: #495057;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  background-clip: padding-box;\r\n");
      out.write("  border: 1px solid #ced4da;\r\n");
      out.write("  border-radius: 0.25rem;\r\n");
      out.write("  box-shadow: inset 0 0 0 rgba(0, 0, 0, 0);\r\n");
      out.write("  transition: border-color 0.15s ease-in-out, box-shadow 0.15s ease-in-out;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"/resources/ckeditor/ckeditor.js\"></script>\r\n");
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
      out.write("	            <h1 class=\"m-0\">자유글 상세보기</h1>\r\n");
      out.write("	          </div><!-- /.col -->\r\n");
      out.write("	          <div class=\"col-sm-6\">\r\n");
      out.write("	            <ol class=\"breadcrumb float-sm-right\">\r\n");
      out.write("	              <li class=\"breadcrumb-item\"><a href=\"#\">Home</a></li>\r\n");
      out.write("	              <li class=\"breadcrumb-item active\">자유게시판 목록</li>\r\n");
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
      out.write("	                <h3 class=\"card-title\">자유게시글 상세보기 합니다.</h3>\r\n");
      out.write("	              </div>\r\n");
      out.write("	              <!-- /.card-header -->\r\n");
      out.write("	              <!-- form start -->\r\n");
      out.write("	              <form action=\"/freeboard/update\" method=\"post\" id=\"cusFrm\" \r\n");
      out.write("	                enctype=\"multipart/form-data\">\r\n");
      out.write("	                <input type=\"text\" name=\"num\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.rnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("	                <div class=\"card-body\">\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusNm\">고객 이름</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control2\" name=\"writer\" id=\"writer\" placeholder=\"이름을 입력하세요\"\r\n");
      out.write("	                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readOnly=\"true\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"cusPwd\">글제목</label>\r\n");
      out.write("	                    <input type=\"text\" class=\"form-control\" name=\"title\" id=\"title\" placeholder=\"제목 입력하세요\"\r\n");
      out.write("	                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"  readOnly=\"true\">\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                  <div class=\"form-group\">\r\n");
      out.write("	                    <label for=\"addr1\">글내용</label>\r\n");
      out.write("	                    <textarea class=\"form-control\" name=\"content\" id=\"content\" placeholder=\"내용을 입력하세요\"\r\n");
      out.write("	                    	cols=\"50\" rows=\"10\" style=\"display:none;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea>\r\n");
      out.write("	                    <span id=\"spanContent\">\r\n");
      out.write("	                    	");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("	                    </span>\r\n");
      out.write("	                  </div>	                  \r\n");
      out.write("	                  <div class=\"card\">\r\n");
      out.write("	                    <label for=\"cusImage\">첨부파일</label>\r\n");
      out.write("	                    <div class=\"card-body\">\r\n");
      out.write("	                    	");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                    <div class=\"input-group\">\r\n");
      out.write("	                      <div class=\"custom-file\">\r\n");
      out.write("	                        <input type=\"file\" class=\"custom-file-input\" id=\"attach\" name=\"attach\">\r\n");
      out.write("	                        <label class=\"custom-file-label\" for=\"attach\" id=\"cusImageLabel\">파일을 선택하세요</label>\r\n");
      out.write("	                      </div>\r\n");
      out.write("	                    </div>\r\n");
      out.write("	                  </div>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                <!-- /.card-body -->\r\n");
      out.write("	                <div class=\"card-footer text-right\" id=\"divFooter1\" style=\"display:none;\">\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-primary\" id=\"btnSubmit\">확인</button>\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-default\" onclick=\"location.href='/freeboard/detail?rnum=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.rnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">취소</button>\r\n");
      out.write("	                </div>\r\n");
      out.write("	                <div class=\"card-footer text-right\" id=\"divFooter2\">\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-primary\" id=\"btnEdit\"\r\n");
      out.write("	                  ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	                  >수정</button>\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-default\" id=\"btnDelete\"\r\n");
      out.write("	                  ");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("	                  >삭제</button>\r\n");
      out.write("	                  <button type=\"button\" class=\"btn btn-primary\" id=\"btnList\" onclick=\"location.href='/freeboard/list'\">목록</button>\r\n");
      out.write("	                </div>\r\n");
      out.write("	              </form>\r\n");
      out.write("	              <form id=\"reFrm\" name=\"reFrm\">\r\n");
      out.write("						<div class=\"card card-warning\">\r\n");
      out.write("			              <div class=\"card-header\">\r\n");
      out.write("			                <h3 class=\"card-title\">댓글 목록</h3>\r\n");
      out.write("			              </div>\r\n");
      out.write("			              <div class=\"card-body\">\r\n");
      out.write("			                <div class=\"row\">\r\n");
      out.write("			                  <div class=\"col-2\">\r\n");
      out.write("			                  	<input type=\"hidden\" name=\"writer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.empNum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("			                  	<input type=\"hidden\" name=\"pNum\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.rnum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("			                    <input type=\"text\" class=\"form-control\" placeholder=\"\"\r\n");
      out.write("			                    value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.nm}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly=\"readonly\">\r\n");
      out.write("			                  </div>\r\n");
      out.write("			                  <div class=\"col-9\">\r\n");
      out.write("			                    <input type=\"text\" name=\"content\" id=\"reContent\" class=\"form-control\" placeholder=\"댓글을 입력해주세요\">\r\n");
      out.write("			                  </div>\r\n");
      out.write("			                  <button type=\"button\" id=\"btnReSubmit\" name=\"btnReSubmit\">입력</button>\r\n");
      out.write("			                </div>\r\n");
      out.write("			              </div>\r\n");
      out.write("						</div>\r\n");
      out.write("			            <!-- /.card card-warning 끝 -->\r\n");
      out.write("					</form>\r\n");
      out.write("					<div class=\"card-body p-0\">\r\n");
      out.write("		                <table class=\"table table-sm\">\r\n");
      out.write("		                  <thead>\r\n");
      out.write("		                    <tr>\r\n");
      out.write("		                      <th style=\"width: 10px\">#</th>\r\n");
      out.write("		                      <th>작성자</th>\r\n");
      out.write("		                      <th>댓글내용</th>\r\n");
      out.write("		                    </tr>\r\n");
      out.write("		                  </thead>\r\n");
      out.write("		                  <tbody id=\"tbody\">\r\n");
      out.write("		                 ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("		                  </tbody>\r\n");
      out.write("		                </table>\r\n");
      out.write("		              </div>\r\n");
      out.write("	            </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</section>\r\n");
      out.write("		<iframe id=\"ifrm\" name=\"ifrm\" style=\"width:1px;height:1px;display:none;\"></iframe>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	//파일 다운로드(path는 /resource부터 시작하는 경로여야 함)\r\n");
      out.write("	function fn_down(path){\r\n");
      out.write("		var vIfrm = document.getElementById(\"ifrm\");\r\n");
      out.write("		vIfrm.src = \"/download?fileName=/resources\" + path;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	//e : 이미지가 change된 이벤트\r\n");
      out.write("	function handleImgFileSelect(e){\r\n");
      out.write("		//파일 객체에 파일을 담음\r\n");
      out.write("		var files = e.target.files;\r\n");
      out.write("		//멀티 파일이라면 배열로 처리\r\n");
      out.write("		var filesArr = Array.prototype.slice.call(files);\r\n");
      out.write("		\r\n");
      out.write("		filesArr.forEach(function(f){			\r\n");
      out.write("			//파일을 sel_file변수에 넣음\r\n");
      out.write("			sel_file = f;\r\n");
      out.write("			//파일을 읽는 reader 객체 생성\r\n");
      out.write("			var reader = new FileReader();	//1)\r\n");
      out.write("			reader.onload = function(e){	//3)\r\n");
      out.write("				//e.target.result : 해당 파일의 명(경로 포함)\r\n");
      out.write("				//<img id='img' /> => <img id='img' src='base64형태의 이미지자체' />\r\n");
      out.write("				$(\"#cusImageLabel\").text(e.target.result);\r\n");
      out.write("			}\r\n");
      out.write("			//f : filesArr파일 배열에 들었는 파일 객체 자체\r\n");
      out.write("			reader.readAsDataURL(f);	//2) f(이미지파일객체를) 다 읽으면 => onload 됐다라고 인식 -> 3)이동\r\n");
      out.write("		}); //end for\r\n");
      out.write("		\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	$(function() {\r\n");
      out.write("		//댓글 달기 처리\r\n");
      out.write("		$(\"#btnReSubmit\").on(\"click\",function(){\r\n");
      out.write("			const writer = $(\"input[name=writer]\").val();\r\n");
      out.write("			const pNum = $(\"input[name=pNum]\").val();\r\n");
      out.write("			const content = $(\"#reContent\").val();\r\n");
      out.write("			\r\n");
      out.write("			const data = {\"writer\":writer,\"pNum\":pNum,\"content\":content};\r\n");
      out.write("			console.log(\"data.writer : \" + data.writer + \", data.pNum : \" + data.pNum +\r\n");
      out.write("					\", data.content : \" + data.content);\r\n");
      out.write("			$.ajax({\r\n");
      out.write("				type:\"post\"\r\n");
      out.write("				,url:\"/freeboard/reInsertPost\"\r\n");
      out.write("				,data:JSON.stringify(data)	//보낼때(request)\r\n");
      out.write("				,dataType:\"json\"	//받을 때(response)\r\n");
      out.write("				,contentType:\"application/json\"\r\n");
      out.write("				,cache:false\r\n");
      out.write("				,success:function(data){\r\n");
      out.write("					console.log(data.num + \", \" + data.writer + \", \" + data.content);\r\n");
      out.write("					\r\n");
      out.write("					var lastNum = $(\"#tbody tr:last-of-type td:eq(0)\").text();\r\n");
      out.write("					\r\n");
      out.write("					$(\"#tbody\").append(\"<tr><td>\"+(Number(lastNum)+1)+\"</td><td>\"+data.writer+\r\n");
      out.write("							\"</td><td>\"+data.content+\"</td></tr>\");\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//글수정 버튼 클릭 시\r\n");
      out.write("		$(\"#btnEdit\").on(\"click\",function(){\r\n");
      out.write("			//ckeditor 활성화\r\n");
      out.write("			CKEDITOR.replace(\"content\");\r\n");
      out.write("			//글내용 span가리기\r\n");
      out.write("			$(\"#spanContent\").css(\"display\",\"none\");\r\n");
      out.write("			//고객 이름, 글제목 활성화\r\n");
      out.write("			$(\".form-control\").removeAttr(\"readonly\");\r\n");
      out.write("			\r\n");
      out.write("			//divFooter1, 2처리\r\n");
      out.write("			$(\"#divFooter1\").css(\"display\",\"block\");//확인/취소\r\n");
      out.write("			$(\"#divFooter2\").css(\"display\",\"none\");//수정/삭제/목록\r\n");
      out.write("		});\r\n");
      out.write("		\r\n");
      out.write("		//파일 경로 보기\r\n");
      out.write("		$(\"#attach\").on(\"change\",handleImgFileSelect);\r\n");
      out.write("\r\n");
      out.write("		$(\"#btnSubmit\").click(function() {\r\n");
      out.write("			\r\n");
      out.write("			if($(\"#writer\").val()==\"\"){\r\n");
      out.write("				alert(\"이름을 입력하세요.\");\r\n");
      out.write("				$(\"#writer\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("			if($(\"#title\").val()==\"\"){\r\n");
      out.write("				alert(\"글 제목을 입력하세요.\");\r\n");
      out.write("				$(\"#title\").focus();\r\n");
      out.write("				return;\r\n");
      out.write("			}\r\n");
      out.write("// 			if($(\"#cusPwd\").val()==\"\"){\r\n");
      out.write("// 				alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("// 				$(\"#cusPwd\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if($(\"#zipcode\").val()==\"\"){\r\n");
      out.write("// 				alert(\"우편번호를 입력하세요.\");\r\n");
      out.write("// 				$(\"#zipcode\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if($(\"#addr1\").val()==\"\"){\r\n");
      out.write("// 				alert(\"주소를 입력하세요.\");\r\n");
      out.write("// 				$(\"#addr1\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if($(\"#addr2\").val()==\"\"){\r\n");
      out.write("// 				alert(\"상세 주소를 입력하세요.\");\r\n");
      out.write("// 				$(\"#addr2\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if($(\"#pne\").val()==\"\"){\r\n");
      out.write("// 				alert(\"연락처를 입력하세요.\");\r\n");
      out.write("// 				$(\"#pne\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			var regExp = /^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$/;\r\n");
      out.write("// 			if(!regExp.test($(\"#pne\").val())){\r\n");
      out.write("// 				alert(\"연락처는 010-0000-0000 형식으로 입력해주세요.\");\r\n");
      out.write("// 				$(\"#pne\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if(CKEDITOR.instances.cusDetail.getData()==\"\"){\r\n");
      out.write("// 				alert(\"상세정보를 입력해주세요.\");\r\n");
      out.write("// 				CKEDITOR.instances.cusDetail.focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
      out.write("// 			if($(\"#cusImage\").val()==\"\"){\r\n");
      out.write("// 				alert(\"사진을 선택하세요.\");\r\n");
      out.write("// 				$(\"#cusImage\").focus();\r\n");
      out.write("// 				return;\r\n");
      out.write("// 			}\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /WEB-INF/views/freeboard/detail.jsp(80,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.attachPath!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("	                    		<a class=\"btn btn-app\" onclick=\"fn_down('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${freeboardVo.attachPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("')\">\r\n");
          out.write("				                  <i class=\"fas fa-save\"></i> Save\r\n");
          out.write("				                </a>\r\n");
          out.write("	                    	");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /WEB-INF/views/freeboard/detail.jsp(101,19) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.empNum!=freeboardVo.writer}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("disabled=\"false\"");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /WEB-INF/views/freeboard/detail.jsp(104,19) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.empNum!=freeboardVo.writer}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("disabled=\"false\"");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/freeboard/detail.jsp(141,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("reRow");
      // /WEB-INF/views/freeboard/detail.jsp(141,19) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/freeboard/detail.jsp(141,19) '${reList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${reList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/freeboard/detail.jsp(141,19) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVarStatus("stat");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("		                    <tr>\r\n");
            out.write("		                      <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${stat.count}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("		                      <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reRow.writer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("		                      <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${reRow.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("		                    </tr>\r\n");
            out.write("		                 ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
