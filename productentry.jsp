<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PRODUCT ENTRY</title>
    </head>
    <body>
        <br><br>
        <h1>PRODUCT ENTRY</h1>
         <form action="cakeinsertion.jsp" method="post">
            Cake name<input type="text" name="name"/>
            <BR>
            Price<input type="text" name="price"/> <BR>
            Pic<input type="file" name="pic"/> <BR>
            Video<input type="text" name="video"/> <BR>
          
             <INPUT type="SUBMIT" VALUE="Add"/>
        </form>
         
    </body>
</html>
