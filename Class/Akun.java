/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author chondroseto
 */
public class Akun {
    private String username,password,akses;

    public Akun(){
        
    }
    
    public Akun(String username, String password, String akses) {
        this.username = username;
        this.password = password;
        this.akses = akses;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getAkses() {
        return akses;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAkses(String akses) {
        this.akses = akses;
    }
    
    
}
