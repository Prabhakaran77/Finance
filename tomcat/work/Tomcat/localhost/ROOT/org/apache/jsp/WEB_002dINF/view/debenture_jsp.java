/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2020-06-12 11:22:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class debenture_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/ADMIN/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("file:/C:/Users/ADMIN/.m2/repository/jstl/jstl/1.2/jstl-1.2.jar", Long.valueOf(1577102162746L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>New Debenture</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        *{\r\n");
      out.write("            padding:0px;\r\n");
      out.write("            margin:0px;\r\n");
      out.write("            font-family:sans-serif;\r\n");
      out.write("        }\r\n");
      out.write("        header{\r\n");
      out.write("            text-align:center;\r\n");
      out.write("            background-color:black;\r\n");
      out.write("        }\r\n");
      out.write("        h1{\r\n");
      out.write("            color:white;\r\n");
      out.write("            padding:20px;\r\n");
      out.write("            font-size:40px;\r\n");
      out.write("        }\r\n");
      out.write("        hr{\r\n");
      out.write("            color:red;\r\n");
      out.write("        }\r\n");
      out.write("        form{\r\n");
      out.write("            height:auto;\r\n");
      out.write("            width:auto;\r\n");
      out.write("            background:lightblue;\r\n");
      out.write("            position:absolute;\r\n");
      out.write("            margin-top:2%;\r\n");
      out.write("            margin-left:40%;\r\n");
      out.write("            border-radius:5px;\r\n");
      out.write("        }\r\n");
      out.write("        ol{\r\n");
      out.write("            list-style:none;\r\n");
      out.write("        }\r\n");
      out.write("        ol li{\r\n");
      out.write("            text-align:right;\r\n");
      out.write("            padding:20px;\r\n");
      out.write("        }\r\n");
      out.write("        .lab{\r\n");
      out.write("            text-align:left;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        input[type=text]{\r\n");
      out.write("            border-radius:5px;\r\n");
      out.write("            outline: none;\r\n");
      out.write("            width:150px;\r\n");
      out.write("        }\r\n");
      out.write("        select{\r\n");
      out.write("            width:150px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=text]:hover,input[type=button]:hover{\r\n");
      out.write("            border-color:dodgerblue;\r\n");
      out.write("            outline: none;\r\n");
      out.write("        }\r\n");
      out.write("        p{\r\n");
      out.write("            color:white;\r\n");
      out.write("            font-size:32px;\r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            text-decoration:none;\r\n");
      out.write("            color:black;\r\n");
      out.write("            font-size:20px;\r\n");
      out.write("        }\r\n");
      out.write("        input[type=submit]{\r\n");
      out.write("            color:white;\r\n");
      out.write("            background-color: black;\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            width:80px;\r\n");
      out.write("            height: 40px;\r\n");
      out.write("            border-radius: 5px;\r\n");
      out.write("        }\r\n");
      out.write("        a{\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            margin-left:95%;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("            color:black;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("    <h1>FINSERV</h1>\r\n");
      out.write("    <hr><hr><hr><hr>\r\n");
      out.write("    <p>New Debenture<br></p>\r\n");
      out.write("</header>\r\n");
      out.write("<a href=\"home\">Home</a>\r\n");
      out.write("<form>\r\n");
      out.write("    <ol>\r\n");
      out.write("        <li><label class=\"lab\">Debenture ID : </label><input type=\"text\" id=\"sid\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${purchaseId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></li>\r\n");
      out.write("        <li><label class=\"lab\">Debenture Amount : </label><input type=\"text\" id=\"Iid\"></li>\r\n");
      out.write("        <li><label class=\"lab\">Percentage : </label><input type=\"text\" id=\"sold\"></li>\r\n");
      out.write("        <li><label class=\"lab\">Type : </label><input type=\"text\" id=\"date\"></li>\r\n");
      out.write("        <li><label class=\"lab\">Customer ID : </label><input type=\"text\" id=\"sender\"></li>\r\n");
      out.write("        <li><center><input type=\"submit\" value=\"Submit\"></center></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("</form>\r\n");
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
