/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sith7
 */
public class DatabaseConnection {
static Connection conn ;
static Statement stmt ;
static ResultSet rs ;    
    
DatabaseConnection()
{
    try{
        Class.forName("com.mysql.jdbc.Driver");  
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp","root","root");  
        stmt=conn.createStatement();  
          
        }
    catch(Exception e)
       { System.out.println(e);} 
}

Connection getConnection()
{   return conn;
}

Statement getStatement()
{   
    return stmt;
}
ResultSet getResultSet(String s , Statement st)
{
    try{
    rs=st.executeQuery(s);
     return rs;
    }
    catch(Exception e)
    {   
        System.out.println(e);
    }
    return null;
}

}
