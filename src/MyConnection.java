
package javaapplication10;
import java.sql.*;
import  java.util.*;

public class MyConnection 
{
  
    
    public static Connection getConnection()
    {
        Connection con = null;
        
        String url="jdbc:mysql://localhost:3306/logindriver";
          String user = "root";
          String pass = "";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url, user, pass);
            
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        return con;
    }
    
       
}
