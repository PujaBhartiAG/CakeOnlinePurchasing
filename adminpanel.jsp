<%@page import="package1.sqlcon"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN PANEL</title>
         <link rel="stylesheet" type="text/css" href="newcss.css">
         <script>
function loadDoc1() 
{
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() 
  {
    if((this.readyState === 4) &&( this.status === 200)) 
    {
      document.getElementById("demo").innerHTML=this.responseText;
    }
  };
  xhttp.open("GET", "viewproduct.jsp", true);
  xhttp.send();
}
function loadDoc2() 
{
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() 
  {
    if((this.readyState === 4) &&( this.status === 200)) 
    {
      document.getElementById("demo").innerHTML=this.responseText;
    }
  };
  xhttp.open("GET", "productentry.jsp", true);
  xhttp.send();
}function loadDoc3() 
{
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() 
  {
    if((this.readyState === 4) &&( this.status === 200)) 
    {
      document.getElementById("demo").innerHTML=this.responseText;
    }
  };
  xhttp.open("GET", "viewcustomer.jsp", true);
  xhttp.send();
}function loadDoc4() 
{
  var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() 
  {
    if((this.readyState === 4) &&( this.status === 200)) 
    {
      document.getElementById("demo").innerHTML=this.responseText;
    }
  };
  xhttp.open("GET", "vieworders.jsp", true);
  xhttp.send();
}
</script>
    
    </head>
    <body>
         <header>
            <nav>
                <div class="row clearfix">
                    
                    <img src="images/cake1.jpg" class="logo" alt=""/>
                    
                    
      
            <center><h5>  <ul class="main-nav animated slideInDown" id="check-class">
                        <li onclick="loadDoc1()" ><u>VIEW PRODUCT</u></li>
                        <li onclick="loadDoc2()" ><u>PRODUCT ENTRY</u></li>
                        <li onclick="loadDoc3()" ><u>VIEW CUSTOMER</u></li>
                        <li onclick="loadDoc4()" ><u>VIEW ORDERS</u></li>
                        <li> <a href="logout.jsp"><u>LOGOUT</u></a></li>
                        
                    
                   </h5><br>
        
                     <div style="float:left; clear: both; width:1200px; height:1200px; background-color:blueviolet; color: black; ">
             <div id="demo">
                 <img src="images/cake2.jpg" alt="" width="1200px"  height="1200px"/></center>
                 
             </div>

</div></div>
           
</ul>
            </nav>
            
        </header>
    </body>
</html>
