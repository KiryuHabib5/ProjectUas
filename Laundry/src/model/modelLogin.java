/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import View.viewLogin;
import database.KoneksiDatabase;
import java.sql.ResultSet;
import java.sql.Statement;
import javafx.scene.shape.VLineTo;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN10
 */
public class modelLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void ambilData(){
        String Sql = "SELECT * FROM admin WHERE username='"+getUsername()+"'";
        try {
            Statement stat = (Statement) KoneksiDatabase.getKoneksi().createStatement();
            ResultSet res = stat.executeQuery(Sql);
            if(res.next()){
                if(getPassword().equals(res.getString("password"))){                    
                    JOptionPane.showConfirmDialog(null, "Login Berhasil");
                }else{                    
                    JOptionPane.showConfirmDialog(null, "Password Salah!!"); 
                    setPassword("");
                }
                
            }else{
                // JOptionPane.showConfirmDialog(null, "USER TIDAK DITEMUNKAN");
                String Sql2 = "SELECT * FROM user WHERE username='"+getUsername()+"'";
                try {
                    ResultSet res2 = stat.executeQuery(Sql2);
                    if (res2.next()) {
                        if(getPassword().equals(res2.getString("password"))){                    
                            JOptionPane.showConfirmDialog(null, "Login Berhasil");
                        }else{                    
                            JOptionPane.showConfirmDialog(null, "Password Salah!!"); 
                            setPassword("");
                        } 
                    }else{
                        JOptionPane.showConfirmDialog(null, "USER TIDAK DITEMUNKAN");
                    }
                } catch (Exception e) {
                    JOptionPane.showConfirmDialog(null, e);
                }
            }
            
        }
        catch(Exception e){
            JOptionPane.showConfirmDialog(null, e);
            
        }
    }
    
    
    
}
