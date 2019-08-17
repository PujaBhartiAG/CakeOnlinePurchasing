<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN LOGIN</title>
         <link rel="stylesheet" type="text/css" href="newcss.css">
         <link href="bootstrap.css" type="text/css" rel="stylesheet">
         <script>
            function validateForm()
            {
                var x=document.forms["myform"]["USERNAME"].value;
                var y=document.forms["myform"]["PASSWORD"].value;
                if(x!=="ADMIN" && y!=="ADMIN")
                {
                    alert("ONLY FOR ADMINS");
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
                    <br><br><br>
                    
                    <center><h1>Admin Login</h1>
                    <br>
                      <form name="myform" onsubmit="validateForm()" action="adminpanel.jsp" method="post">
                      <table align="center">
                          <tr>
                              <th align="right">USERNAME:</th>
                              <td><input type="text" name="USERNAME" placeholder="Username" required/></td>
                          </tr>
                          <tr>
                              <th align="right">PASSWORD</th>
                              <td><input type="text" name="PASSWORD" placeholder="Password" required/></td>
                              
                          </tr>
                          <tr>
                              <td colspan="2" align="right"><INPUT type="SUBMIT" VALUE="Log In" class="btn btn-primary"/></td>
                          </tr>
                      </table>
            
                        </form></center>
                    
                </div>
            </nav>
            
        </header>
    </body>
</html>
