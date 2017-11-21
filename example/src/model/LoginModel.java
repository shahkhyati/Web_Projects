/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sith7
 */
public class LoginModel {
 
     Connection conn ;
     Statement stmt ;
     ResultSet rs ;    
    DatabaseConnection db;
   public  LoginModel()
     {
         db = new DatabaseConnection(); 
         conn = db.getConnection();
         stmt = db.getStatement();
        
     }
    
    public boolean checkLogin(String name , String pass)
    {
        String sql = "select * from Login where username like '"+name+"'";
        
        try
        {
        
        rs = db.getResultSet(sql, stmt);
        if(rs.next())  
        {
        if(pass.equals(rs.getString(3)))
        {
         return true;   
        } else{
            return false;
             }
         }
          
         conn.close();
         return false;
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
    return false;
    }
}
