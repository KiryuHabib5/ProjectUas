/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.KoneksiDatabase;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN10
 */
public class modelPesan {
    private int estimasiBerat;
    private String username;
    private String kategori;
    private String jenisSabun;
    private String alamat;
    private String status;
    private String tanggal;
    private KoneksiDatabase koneksi;
    
    private String getTanggal(){
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MMd-dd");
        Date date = new Date();        
        this.tanggal = dateFormat1.format(date);
        return this.tanggal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

        
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public KoneksiDatabase getKoneksi() {
        return koneksi;
    }

    public void setKoneksi(KoneksiDatabase koneksi) {
        this.koneksi = koneksi;
    }
    
    
    
    
    public void konfirm(){
        this.setStatus("Menunggu Konfirmasi");
        String Sql = "INSERT INTO pesan (username, estimasiBerat, kategori, jenisSabun, alamat,tanggal, status) VALUES ('"+getUsername()+"','"+getEstimasiBerat()+"','"+getKategori()+"','"+getJenisSabun()+"','"+getAlamat()+"','"+getTanggal()+"' , '"+getStatus()+"')";
        //JOptionPane.showMessageDialog(null,Sql);
        try {
            PreparedStatement eksekusi = koneksi.getKoneksi().prepareStatement(Sql);
            eksekusi.execute();
            
            JOptionPane.showMessageDialog(null, "Data Berasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Tidak Berasil disimpan");
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
