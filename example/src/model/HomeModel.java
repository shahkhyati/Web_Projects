/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JTextField;
import static model.DatabaseConnection.conn;

/**
 *
 * @author Sith7
 */
public class HomeModel {
    
    
     Connection conn ;
     Statement stmt ;
     ResultSet rs ;    
    DatabaseConnection db;
   public  HomeModel()
     {
         db = new DatabaseConnection(); 
         conn = db.getConnection();
         stmt = db.getStatement();
        
     }
   
   public ArrayList display(){
   String sql = "select * from Employee";
    
    ArrayList<String> em=new ArrayList<String>();  
        
        try
        {
        
        rs = db.getResultSet(sql, stmt);
       
        while(rs.next())  
        {
            em.add(rs.getString(1));
        System.out.println(rs.getString(1));
        
        }
        
        
        
         conn.close();
      
         
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return em;
   }  
   
   
   public void Insert(String name)
   {
    String sql1;
    Scanner sc=new Scanner(System.in);  
     
   System.out.println("Enter address");  
   String add=sc.next();
   
   System.out.println("Enter city");  
   String city=sc.next();
   
         sql1 = "INSERT INTO Employee (EmployName,Address,City) values ('"+name+"','"+add+"','"+city+"')";
         try{
      stmt.executeUpdate(sql1);
    System.out.println("Successfully inserted");
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
   }
   
   public void Delete(String name)
   {
    String sql2;
    
         sql2 = "DELETE FROM Employee where EmployName=('"+name+"')";
         try{
      stmt.executeUpdate(sql2);
    System.out.println("Successfully Deleted");
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
   }
   
    public void Update(String n,String s)
   {
    String sql2;
    
         sql2 = "UPDATE Employee SET EmployName=('"+s+"') where EmployName=('"+n+"')";
         try{
      stmt.executeUpdate(sql2);
    System.out.println("Successfully Updated");
         }
         catch(Exception e)
         {
         System.out.println(e);
         }
   }
}
