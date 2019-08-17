package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Screaming Spires</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width,initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"newcss.css\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Flamenco\" rel=\"stylesheet\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/3.5.2/animate.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav>\n");
      out.write("                <div class=\"row clearfix\">\n");
      out.write("                    \n");
      out.write("                    <img src=\"images/cake1.jpg\" class=\"logo\" alt=\"\"/>\n");
      out.write("                    <ul class=\"main-nav animated slideInDown\" id=\"check-class\">\n");
      out.write("                        <li> <a href=\"cakedelivery.jsp\">CAKE DELIVERY</a></li>\n");
      out.write("                        <li> <a href=\"howtoorder.jsp\">HOW TO ORDER</a></li>\n");
      out.write("                        <li> <a href=\"checkmore.jsp\">CHECK MORE</a></li>\n");
      out.write("                        <li> <a href=\"signup.jsp\">SIGN UP</a></li>\n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                    <a href=\"#\" class=\"mobile-icon\" id=\"check-class\" onclick=\"slideshow()\"><i class=\"fa fa-bars\"></i></a>\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("            <div class=\"main-content-header\">\n");
      out.write("                <h1> WELCOME TO <span class=\"colorchange\">SCREAMING SPIRES</span>.<br>\n");
      out.write("                A HOUSE OF CAKE LOVERS...OO YES..</h1>\n");
      out.write("             <a href=\"clicktoorder.jsp\" class=\"btn btn-full\">CLICK TO ORDER</a>\n");
      out.write("             <a href=\"adminlogin.jsp\" class=\"btn btn-nav\">ADMIN LOGIN</a>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function slideshow(){\n");
      out.write("                var x=document.getElementById('check-class');\n");
      out.write("                if(x.style.display===\"none\")\n");
      out.write("                {\n");
      out.write("                    x.style.display=\"block\";\n");
      out.write("                    \n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    x.style.display=\"none\";\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            </script>\n");
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
