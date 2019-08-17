<%-- 
    Document   : viewcustomer
    Created on : 15 Aug, 2018, 3:55:34 PM
    Author     : DELL
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VIEW CUSTOMER</title>
    </head>
    <body>
       </form>
          <h1>CUSTOMERS</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                
                <th>USERNAME</th>
                 <th>PASSWORD</th>
                <th>FIRST NAME</th>
                <th>LAST NAME</th>
                <th>PHONE</th>
                <th>EMAIL</th>
                
            </tr>
            <%
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
               %>
               <tr>
                   <td> <%=rs.getInt("id")%> </td>
                   <td> <%=rs.getString("username")%> </td>
                   <td> <%=rs.getString("password")%> </td>
                  <td> <%=rs.getString("firstname")%> </td>
                  <td> <%=rs.getString("lastname")%> </td>
                  <td> <%=rs.getString("phone")%> </td>
                  <td> <%=rs.getString("email")%> </td>
                   
               </tr>
              
               <%}
}
catch(Exception e)
{
out.print(e);
}
%>
                   </table>
        
       
    </body>
</html>
