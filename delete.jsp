<%-- 
    Document   : delete
    Created on : 6 Aug, 2018, 6:54:14 PM
    Author     : DELL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DELETE</title>
    </head>
    <body>
         <%
            String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
            String id= request.getParameter("id");
            
            
            
            try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query=" delete from cake1 where id="+id+"";
            stat.execute(query);
            response.sendRedirect("adminpanel.jsp");
            }
            catch(Exception e)
            {
              out.print(e);
            }
            %>
    </body>
</html>
