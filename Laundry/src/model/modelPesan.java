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
public class modelPesan {
    private int estimasiBerat;
    private String kategori;
    private String jenisSabun;
    private String alamat;
    private KoneksiDatabase koneksi;

    public int getEstimasiBerat() {
        return estimasiBerat;
    }

    public void setEstimasiBerat(int estimasiBerat) {
        this.estimasiBerat = estimasiBerat;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getJenisSabun() {
        return jenisSabun;
    }

    public void setJenisSabun(String jenisSabun) {
        this.jenisSabun = jenisSabun;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    
    public void konfirm(){
        String Sql = "INSERT INTO pesan (estimasiBerat, kategori, jenisSabun, alamat) VALUES ('"+getEstimasiBerat()+"','"+getKategori()+"','"+getJenisSabun()+"','"+getAlamat()+"')";
        
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(Sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil disimpan");
        }
    }
}
