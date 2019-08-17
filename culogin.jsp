
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CUSTOMER LOGIN</title>
    </head>
    <body>
         <%
              String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
        
        String EMAIL=request.getParameter("EMAIL");
        String PASSWORD=request.getParameter("PASSWORD");
        try{
       
        Connection conn=DriverManager.getConnection(host,username,password);
        Statement stat=conn.createStatement();
        String query="select * from registration where EMAIL='"+EMAIL+"' and PASSWORD='"+PASSWORD+"'";
        ResultSet rs= stat.executeQuery(query);
        if(rs.next())
        {   session.setAttribute("EMAIL","PASSWORD");
            EMAIL=rs.getString("EMAIL");
            String pas=rs.getString("password");
            if(PASSWORD.equals(pas))
            {
                response.sendRedirect("products.jsp");
            }
            else
            {
                out.print("PLEASE ENTER CORRECT PASSWORD");
                
            }
        }
        else
        {
             out.print("New customer SIGN UP ");
                response.sendRedirect("signup.jsp");
        }
                }
        catch(Exception e)
        {
            out.print(e);
        }
                %>
    </body>
</html>
