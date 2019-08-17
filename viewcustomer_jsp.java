package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewcustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>VIEW CUSTOMER</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       </form>\n");
      out.write("          <h1>CUSTOMERS</h1>\n");
      out.write("        <table border=\"1px\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                \n");
      out.write("                <th>USERNAME</th>\n");
      out.write("                 <th>PASSWORD</th>\n");
      out.write("                <th>FIRST NAME</th>\n");
      out.write("                <th>LAST NAME</th>\n");
      out.write("                <th>PHONE</th>\n");
      out.write("                <th>EMAIL</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                 try{
           String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
       
       
        Connection conn=DriverManager.getConnection(host,username,password);
        Statement stat=conn.createStatement();
            String query="select * from REGISTRATION";
           ResultSet rs = stat.executeQuery(query);
           while(rs.next())
           {
               
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td> ");
      out.print(rs.getInt("id"));
      out.write(" </td>\n");
      out.write("                   <td> ");
      out.print(rs.getString("username"));
      out.write(" </td>\n");
      out.write("                   <td> ");
      out.print(rs.getString("password"));
      out.write(" </td>\n");
      out.write("                  <td> ");
      out.print(rs.getString("firstname"));
      out.write(" </td>\n");
      out.write("                  <td> ");
      out.print(rs.getString("lastname"));
      out.write(" </td>\n");
      out.write("                  <td> ");
      out.print(rs.getString("phone"));
      out.write(" </td>\n");
      out.write("                  <td> ");
      out.print(rs.getString("email"));
      out.write(" </td>\n");
      out.write("                   \n");
      out.write("               </tr>\n");
      out.write("              \n");
      out.write("               ");
}
}
catch(Exception e)
{
out.print(e);
}

      out.write("\n");
      out.write("                   </table>\n");
      out.write("        \n");
      out.write("       \n");
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
