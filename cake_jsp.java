package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import package1.sqlcon;
import java.sql.*;

public final class cake_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("         <script>\n");
      out.write("function loadDoc1() \n");
      out.write("{\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() \n");
      out.write("  {\n");
      out.write("    if((this.readyState === 4) &&( this.status === 200)) \n");
      out.write("    {\n");
      out.write("      document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"viewproduct.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("function loadDoc2() \n");
      out.write("{\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() \n");
      out.write("  {\n");
      out.write("    if((this.readyState === 4) &&( this.status === 200)) \n");
      out.write("    {\n");
      out.write("      document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"productentry.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}function loadDoc3() \n");
      out.write("{\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() \n");
      out.write("  {\n");
      out.write("    if((this.readyState === 4) &&( this.status === 200)) \n");
      out.write("    {\n");
      out.write("      document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"viewcustomer.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}function loadDoc4() \n");
      out.write("{\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() \n");
      out.write("  {\n");
      out.write("    if((this.readyState === 4) &&( this.status === 200)) \n");
      out.write("    {\n");
      out.write("      document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"vieworders.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}function loadDoc5() \n");
      out.write("{\n");
      out.write("  var xhttp = new XMLHttpRequest();\n");
      out.write("  xhttp.onreadystatechange = function() \n");
      out.write("  {\n");
      out.write("    if((this.readyState === 4) &&( this.status === 200)) \n");
      out.write("    {\n");
      out.write("      document.getElementById(\"demo\").innerHTML=this.responseText;\n");
      out.write("    }\n");
      out.write("  };\n");
      out.write("  xhttp.open(\"GET\", \"logout.jsp\", true);\n");
      out.write("  xhttp.send();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row clearfix\">\n");
      out.write("                    \n");
      out.write("                    <img src=\"images/cake1.jpg\" class=\"logo\" alt=\"\"/>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("      \n");
      out.write("            <center><h5>  <ul class=\"main-nav animated slideInDown\" id=\"check-class\">\n");
      out.write("                        <li onclick=\"loadDoc1()\" ><u>VIEW PRODUCT</u></li>\n");
      out.write("                        <li onclick=\"loadDoc2()\" ><u>PRODUCT ENTRY</u></li>\n");
      out.write("                        <li onclick=\"loadDoc3()\" ><u>VIEW CUSTOMER</u></li>\n");
      out.write("                        <li onclick=\"loadDoc4()\" ><u>VIEW ORDERS</u></li>\n");
      out.write("                        <li onclick=\"loadDoc5()\" ><u>LOGOUT</u></li>\n");
      out.write("                        \n");
      out.write("                    \n");
      out.write("                   </h5><br>\n");
      out.write("        \n");
      out.write("                     <div style=\"float:left; clear: both; width:1200px; height:1200px; background-color:blueviolet; color: black; \">\n");
      out.write("             <div id=\"demo\">\n");
      out.write("                 <img src=\"images/cake2.jpg\" alt=\"\" width=\"1200px\"  height=\"1200px\"/></center>\n");
      out.write("                 \n");
      out.write("             </div>\n");
      out.write("\n");
      out.write("</div></div>\n");
      out.write("           \n");
      out.write("</ul>\n");
      out.write("            </nav>\n");
      out.write("            \n");
      out.write("        </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
