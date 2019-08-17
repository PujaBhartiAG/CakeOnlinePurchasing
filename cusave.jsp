<%-- 
    Document   : student
    Created on : 6 Aug, 2018, 6:25:55 PM
    Author     : DELL
--%>

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
            String nam= request.getParameter("USERNAME");
            String add= request.getParameter("PASSWORD");
            String MOB= request.getParameter("");
            
            
            try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query="INSERT INTO login(USERNAME,PASSWORD,TYPE)VALUES('"+nam+"','"+add+"','"+MOB+"')";
            stat.execute(query);
            response.sendRedirect("newjsp.jsp");
            }
            catch(Exception e)
            {
              out.print(e);
            }
            %>
    </body>
</html>
