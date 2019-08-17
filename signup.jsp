<%-- 
    Document   : signup
    Created on : 13 Aug, 2018, 4:11:57 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIGN UP</title>
        <link rel="stylesheet" type="text/css" href="newcss.css">
    </head>
    <body>
        <header>
            <nav>
                <div class="row clearfix">
                    
                    <img src="images/cake1.jpg" class="logo" alt=""/>
                    <br><br>
                    <br>
                    <center><h1>User Sign Up</h1></center>
                    <br>
                    <center> <form action="curegistration.jsp" method="post">
                         <table align="center">
                          <tr>
                              <th align="right">USERNAME:</th>
                              <td><input type="text" name="USERNAME" placeholder="Username"/></td>
                          </tr>
                          <tr>
                              <th align="right">PASSWORD</th>
                              <td><input type="text" name="PASSWORD" placeholder="Password"/></td>
                              
                          </tr>
                           <tr>
                              <th align="right">FIRST NAME</th>
                              <td><input type="text" name="FIRSTNAME" placeholder="First Name"/></td>
                              
                          </tr>
                           <tr>
                              <th align="right">LAST NAME</th>
                              <td><input type="text" name="LASTNAME" placeholder="Last Name"/></td>
                              
                          </tr>
                           <tr>
                              <th align="right">E-MAIL</th>
                              <td><input type="text" name="EMAIL" placeholder="Email"/></td>
                              
                          </tr>
                           <tr>
                              <th align="right">PHONE</th>
                              <td><input type="text" name="PHONE" placeholder="Phone"/></td>
                              
                          </tr>
                          <tr>
                              <td colspan="2" align="right"><INPUT type="SUBMIT" VALUE="Sign Up" class="btn btn-primary"/></td>
                          </tr>
                         </table></form></center>
        
                   
                 
                    
                </div>
            </nav>
            
        </header>
    </body>
</html>
