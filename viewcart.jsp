<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VIEW CART</title>
    </head>
    <body>
         </form>
          <h1>Product list</h1>
        <table border="1px">
            <tr>
                <th>ID</th>
                
                <th>Product Name</th>
                <th>Price</th>
                 <th>Image</th>
                <th>Video</th>
                <th>CART</th>
                
                
            </tr>
            <%
                 try{
           String host="jdbc:derby://localhost:1527/PROJECT";
            String username="PROJECT";
            String password="PROJECT";
       
       
        Connection conn=DriverManager.getConnection(host,username,password);
        Statement stat=conn.createStatement();
            String query="select * from cart";
           ResultSet rs = stat.executeQuery(query);
           while(rs.next())
           {
               %>
               <tr>
                   <td> <%=rs.getInt("id")%> </td>
                   <td> <%=rs.getString("name")%> </td>
                   <td> <%=rs.getString("price")%> </td>
                   <td><img src="images/<%=rs.getString("image")%>" height="50px" width="50px"/> </td>
                   <td  height="50px" width="50px"> <%=rs.getString("video")%> </td>
                   
                   
                    </td>
                   
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
