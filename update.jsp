<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UPDATE</title>
    </head>
    <body>
         <%
            String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
            String NAME= request.getParameter("NAME");
            String PRICE= request.getParameter("PRICE");
            String PIC= request.getParameter("PIC");
            String VIDEO= request.getParameter("VIDEO");
            String id=request.getParameter("id");
            
            try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
            String query="update cake1 set NAME='"+NAME+"',PRICE='"+PRICE+"',PIC='"+PIC+"',VIDEO='"+VIDEO+"' where id="+id+" ";
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
