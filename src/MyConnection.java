
package javaapplication10;
import java.sql.*;
import  java.util.*;

public class MyConnection 
{
  
    
    public static Connection getConnection()
    {
        Connection con = null;
        
        String url="jdbc:mysql://localhost:3306/xxxxxxx"; // write your database name there
          String user = "root";// write your own username
          String pass = ""; // write your own password 
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); // write  your own name between parantesis
            con= DriverManager.getConnection(url, user, pass);
            
        }catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        return con;
    }
    
       
}
