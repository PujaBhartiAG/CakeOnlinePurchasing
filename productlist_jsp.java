package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class productlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         </form>\n");
      out.write("          <h1>Product list</h1>\n");
      out.write("        <table border=\"1px\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Product Name</th>\n");
      out.write("                <th>Price</th>\n");
      out.write("                 <th>Image</th>\n");
      out.write("                <th>Video</th>\n");
      out.write("                <th>CART</th>\n");
      out.write("                <th></th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");

                 try{
           String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
       
       
        Connection conn=DriverManager.getConnection(host,username,password);
        Statement stat=conn.createStatement();
            String query="select * from cake1";
           ResultSet rs = stat.executeQuery(query);
           while(rs.next())
           {
               
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td> ");
      out.print(rs.getInt("id"));
      out.write(" </td>\n");
      out.write("                   <td> ");
      out.print(rs.getString("name"));
      out.write(" </td>\n");
      out.write("                   <td> ");
      out.print(rs.getString("price"));
      out.write(" </td>\n");
      out.write("                   <td><img src=\"images/");
      out.print(rs.getString("image"));
      out.write("\" height=\"50px\" width=\"50px\"/> </td>\n");
      out.write("                   <td  height=\"50px\" width=\"50px\"> ");
      out.print(rs.getString("video"));
      out.write(" </td>\n");
      out.write("                   <td> <a href=\"addtocart.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\">Add</a>\n");
      out.write("                   \n");
      out.write("                    <a href=\"deletefromcart.jsp?id=");
      out.print(rs.getInt("id"));
      out.write("\">Delete</a></td>\n");
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
