

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
              String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
        String type="";
        String uname=request.getParameter("USERNAME");
        String pass=request.getParameter("PASSWORD");
        try{
       
        Connection conn=DriverManager.getConnection(host,username,password);
        Statement stat=conn.createStatement();
        String query="select * from login where USERNAME='"+uname+"' and PASSWORD='"+pass+"'";
        ResultSet rs= stat.executeQuery(query);
        if(rs.next())
        {   session.setAttribute("name", "value");
            type=rs.getString("type");
            if(type.equalsIgnoreCase("admin"))
            {
                response.sendRedirect("admin.jsp");
            }
            else
            {
                response.sendRedirect("product.jsp");
            }
        }
        else
        {
            out.print("invalid user");
        }
                }
        catch(Exception e)
        {
            out.print(e);
        }
                %>
    </body>
</html>
