/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.KoneksiDatabase;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN10
 */
public class modelRegister {
    private String username;
    private String nama;
    private String alamat;
    private String password;
    private String rePassword;
    KoneksiDatabase koneksi = new KoneksiDatabase();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
    
    public void register(){
        if(getPassword().equals(getRePassword())){
                   String Sql = "INSERT INTO user VALUES ('"+getUsername()+"','"+getNama()+"','"+getAlamat()+"','"+getPassword()+"')";
            try {
                PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(Sql);
                eksekusi.execute();
                JOptionPane.showMessageDialog(null, "Register Berhasil");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Register Gagal");
            }   
        }else{
            JOptionPane.showConfirmDialog(null, "PASSWORD TIDAK SAMA!!!");
            this.setRePassword("");
        }

    
    }
}
