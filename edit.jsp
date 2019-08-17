<%-- 
    Document   : edit
    Created on : 6 Aug, 2018, 6:56:28 PM
    Author     : DELL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDIT</title>
    </head>
    <body>
        <%
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
             //  VIDEO=rs.getString("VIDEO");
               
           }
            }
            catch(Exception e)
            {
              out.print(e);
            }
            %>
             <form action="update.jsp?id=<%=id%>" method="post">
                 NAME<input type="text" name="NAME" value="<%=NAME%>"/>
            <BR>
            PRICE<input type="text" name="PRICE" value="<%=PRICE%>"/> <BR>
            PIC<input type="file" name="PIC" value="<%=PIC%>" width="50px" height="50px"/> <BR>
            VIDEO<input type="text" name="VIDEO" value="<%=VIDEO%>" width="50px" height="50px"/> <BR>
             
             <INPUT type="SUBMIT" VALUE="Update"/>
        </form>
          
    </body>
</html>
