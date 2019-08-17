<%-- 
    Document   : logout
    Created on : 7 Aug, 2018, 6:48:07 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGOUT</title>
    </head>
    <body>
        <%
            session.setAttribute("ADMIN", "");
            response.sendRedirect("Index.html");
            
            
            %>
    </body>
</html>
