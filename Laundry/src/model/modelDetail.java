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
public class modelDetail {
    private String id;
    private int estimasiBerat;
    private String username;
    private String kategori;
    private String jenisSabun;
    private String alamat;
    private String status;
    private String tanggal;
    private KoneksiDatabase koneksi;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEstimasiBerat() {
        return estimasiBerat;
    }

    public void setEstimasiBerat(int estimasiBerat) {
        this.estimasiBerat = estimasiBerat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }
    
   
    public void konfirm(){
        String sql = (
                "UPDATE pesan SET username =  '"+getUsername()+"'"
                + ",estimasiBerat = '"+getEstimasiBerat()+"'"
                + ",kategori = '"+getKategori()+"'"
                + ",jenisSabun = '"+getJenisSabun()+"'"
                + ",alamat = '"+getAlamat()+"'"
                + ",status = '"+getStatus()+"' WHERE id = '"+getId()+"'"
                );
        //JOptionPane.showMessageDialog(null, sql);
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil diubah");
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void hapus(){
        String sql = (
                "DELETE FROM pesan WHERE id = '"+getId()+"'"
                );
        //JOptionPane.showMessageDialog(null, sql);
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil hapus");
            //JOptionPane.showMessageDialog(null, e);
        }   
    }
    
}
