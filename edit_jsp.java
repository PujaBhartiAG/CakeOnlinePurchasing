package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>EDIT</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
            String id= request.getParameter("id");
          
            String NAME="",PRICE="",PIC="",VIDEO="";
            
            try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query="select * from cake1 where id="+id+"";
            ResultSet rs=stat.executeQuery(query);
           if(rs.next())
           {
               NAME=rs.getString("NAME");
               PRICE=rs.getString("PRICE");
               PIC=rs.getString("PIC");
               VIDEO=rs.getString("VIDEO");
               
           }
            }
            catch(Exception e)
            {
              out.print(e);
            }
            
      out.write("\n");
      out.write("             <form action=\"update.jsp?id=");
      out.print(id);
      out.write("\" method=\"post\">\n");
      out.write("                 NAME<input type=\"text\" name=\"NAME\" value=\"");
      out.print(NAME);
      out.write("\"/>\n");
      out.write("            <BR>\n");
      out.write("            PRICE<input type=\"text\" name=\"PRICE\" value=\"");
      out.print(PRICE);
      out.write("\"/> <BR>\n");
      out.write("            PIC<input type=\"file\" name=\"PIC\" value=\"");
      out.print(PIC);
      out.write("\" width=\"50\" height=\"50\"/> <BR>\n");
      out.write("            <ul height=\"50\" width=\"50\"  VIDEO<input type=\"text\" name=\"VIDEO\" value=\"");
      out.print(VIDEO);
      out.write("\" width=\"50\" height=\"50\"/> </ul><BR>\n");
      out.write("             \n");
      out.write("             <INPUT type=\"SUBMIT\" VALUE=\"Update\"/>\n");
      out.write("        </form>\n");
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
