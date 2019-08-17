package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADMIN LOGIN</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("         <link href=\"bootstrap.css\" type=\"text/css\" rel=\"stylesheet\">\n");
      out.write("         <script>\n");
      out.write("            function validateForm()\n");
      out.write("            {\n");
      out.write("                var x=document.forms[\"myform\"][\"USERNAME\"].value;\n");
      out.write("                var y=document.forms[\"myform\"][\"PASSWORD\"].value;\n");
      out.write("                if(x!==\"ADMIN\" && y!==\"ADMIN\")\n");
      out.write("                {\n");
      out.write("                    alert(\"ONLY FOR ADMINS\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row clearfix\">\n");
      out.write("                    \n");
      out.write("                    <img src=\"images/cake1.jpg\" class=\"logo\" alt=\"\"/>\n");
      out.write("                    <br><br><br>\n");
      out.write("                    \n");
      out.write("                    <center><h1>Admin Login</h1>\n");
      out.write("                    <br>\n");
      out.write("                      <form name=\"myform\" onsubmit=\"validateForm()\" action=\"cake.jsp\" method=\"post\">\n");
      out.write("                      <table align=\"center\">\n");
      out.write("                          <tr>\n");
      out.write("                              <th align=\"right\">USERNAME:</th>\n");
      out.write("                              <td><input type=\"text\" name=\"USERNAME\" placeholder=\"Username\" required/></td>\n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <th align=\"right\">PASSWORD</th>\n");
      out.write("                              <td><input type=\"text\" name=\"PASSWORD\" placeholder=\"Password\" required/></td>\n");
      out.write("                              \n");
      out.write("                          </tr>\n");
      out.write("                          <tr>\n");
      out.write("                              <td colspan=\"2\" align=\"right\"><INPUT type=\"SUBMIT\" VALUE=\"Log In\" class=\"btn btn-primary\"/></td>\n");
      out.write("                          </tr>\n");
      out.write("                      </table>\n");
      out.write("            \n");
      out.write("                        </form></center>\n");
      out.write("                    \n");
      out.write("                </div>\n");
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
