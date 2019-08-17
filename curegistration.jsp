<%-- 
    Document   : curegistration
    Created on : 14 Aug, 2018, 11:42:03 AM
    Author     : DELL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTRATION</title>
    </head>
    <body>
         <%
            String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
            String USERNAME= request.getParameter("USERNAME");
            String PASSWORD= request.getParameter("PASSWORD");
            String FIRSTNAME= request.getParameter("FIRSTNAME");
            String LASTNAME= request.getParameter("LASTNAME");
            String EMAIL= request.getParameter("EMAIL");
            String PHONE= request.getParameter("PHONE");
            
            
            
            try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query="INSERT INTO registration(USERNAME,PASSWORD,FIRSTNAME,LASTNAME,EMAIL,PHONE)VALUES('"+USERNAME+"','"+PASSWORD+"','"+FIRSTNAME+"','"+LASTNAME+"','"+EMAIL+"','"+PHONE+"')";
            stat.execute(query);
            out.print("Registered Successfully");
            response.sendRedirect("newjsp.jsp");
            }
            catch(Exception e)
            {
              out.print(e);
            }
            %>
    </body>
</html>
