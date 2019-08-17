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
            String name= request.getParameter("name");
            String price= request.getParameter("price");
            String pic= request.getParameter("pic");
            String video= request.getParameter("video");
           try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query="INSERT INTO cart(name,price,pic,video)VALUES('"+name+"','"+price+"','"+pic+"','"+video+"')";
           
            stat.execute(query);
             out.println("CAKE ADDED TO CART");
             response.sendRedirect("customerpanel.jsp");
             
            }
            catch(Exception e)
            {
              out.print(e);
            }
            
           
            %>
          
           
    </body>
</html>
