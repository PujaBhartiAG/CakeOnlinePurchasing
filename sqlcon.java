/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.sql.*;

/**
 *
 * @author DELL
 */
public class sqlcon {
    String host="jdbc:derby://localhost:1527/PROJECT";
    String username="PROJECT";
    String password="PROJECT";
    ResultSet rs=null;
    public String getcon(String Query)
    { 
           
    try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
           
            stat.execute(Query);
           return("0");
            }
            catch(Exception e)
            {
              return(e.toString());
            }
    }
    

 public ResultSet getdata(String Query)
    { 
           
    try{
            Connection conn=DriverManager.getConnection(host,username,password);
            Statement stat=conn.createStatement();
           
            rs=stat.executeQuery(Query);
         
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
                return rs;
    }

    
}
