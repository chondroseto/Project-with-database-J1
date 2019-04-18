/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import Form.FormLogin;
import Form.FormUtama;
import Lib.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;



/**
 *
 * @author chondroseto
 */
public class CmdAkun {
    public void Login(String username,String password){
        String query = "SELECT * FROm akun WHERE username '"+username+"' AND password ='"+password+"'";
        ConnectionManager ConMan = new ConnectionManager();
        Connection koneksi = ConMan.LogOn();
        
        try{
            Statement stm = koneksi.createStatement();
            ResultSet rs = stm.executeQuery(query);
            if (rs.next()){
                username = rs.getString("username");
                password = rs.getString("password");
                String akses = rs.getString("akses");
                JOptionPane.showMessageDialog(null,"Login Berhasil"+ "\nSelamat Datang "+username, "Login" , JOptionPane.INFORMATION_MESSAGE);
                new FormLogin().dispose();
                new FormUtama(username,akses).setVisible(true);
                
            } else {
                JOptionPane.showMessageDialog(null,"Login Gagal","Login",JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException ex){
            ex.printStackTrace();
        }
        
    }
}
