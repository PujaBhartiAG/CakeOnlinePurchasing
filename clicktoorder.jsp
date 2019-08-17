<%-- 
    Document   : clicktoorder
    Created on : 13 Aug, 2018, 4:13:31 AM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOG IN</title>
         <link rel="stylesheet" type="text/css" href="newcss.css">
          <script>
            function validateForm()
            {
                var x=document.forms["myform"]["EMAIL"].value;
                if(x==null|| x=="")
                {
                    alert("EMAIL MUST BE FILLED OUT");
                    return false;
                }
            }
            </script>
    </head>
    <body>
   
        <header>
            <nav>
                <div class="row clearfix">
                    
                    <img src="images/cake1.jpg" class="logo" alt=""/>
                    <center><h6 bgcolor="white">New customer<a href="signup.jsp"> Sign Up </a> before<a href="clicktoorder.jsp"> Log In </a> to order</h6></center>
                     <form name="myform" onsubmit="validateForm()" action="customerpanel.jsp" method="post">
                         <table align="center">
                          <tr>
                              <th align="right">E-MAIL:</th>
                              <td><input type="email" name="EMAIL" placeholder="Email" required/></td>
                          </tr>
                          <tr>
                              <th align="right">PASSWORD</th>
                              <td><input type="text" name="PASSWORD" placeholder="Password" required/></td>
                              
                          </tr>
                          <tr>
                              <td colspan="2" align="right"><INPUT type="SUBMIT" VALUE="Log In" class="btn btn-primary"/></td>
                          </tr>
                      </table>
            
        </form>
                 
                    
                </div>
            </nav>
            
        </header>
    </body>
</html>
