/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chondroseto
 */
public class ConnectionManager {
    private static Connection con;
 
static String status="";
    private static Connection koneksi;
    public String driver = "com.mysql.jdbc.Driver()";
    
               
    public Connection LogOn(){
        
        
            try{
                String url = "jdbc:mysql://localhost:3306/kampus";
                String user = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url,user,password);
                
            } catch (SQLException t){
                System.out.println("Error membuat koneksi");
            }
        
        
        return koneksi;
    }
    public void LogOff(){
        try{
            koneksi.close();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }

   
}

