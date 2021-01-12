/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.detailPesanan;
import model.modelDetail;

/**
 *
 * @author WIN10
 */
public class controllerDetail {
    private modelDetail mD;
    private detailPesanan dP;
    
    public controllerDetail(detailPesanan dP){
        this.dP = dP;
    }
    
    public void konfirmasi(){
        mD = new modelDetail();
        mD.setId(dP.getIdDetail().getText());
        mD.setUsername(dP.getUsernameDetail().getText());
        mD.setEstimasiBerat(Integer.parseInt(dP.getEstimasiDetail().getText()));
        mD.setKategori(dP.getKategoriDetail().getText());
        mD.setJenisSabun(dP.getJenisSabunDetail().getText());
        mD.setAlamat(dP.getAlamatDetail().getText());
        mD.setStatus(dP.getStatusDetail().getText());
        mD.konfirm();
    }
    
    public void hapus(){
        mD = new modelDetail();
        mD.setId(dP.getIdDetail().getText());
        mD.setUsername(dP.getUsernameDetail().getText());
        mD.setEstimasiBerat(Integer.parseInt(dP.getEstimasiDetail().getText()));
        mD.setKategori(dP.getKategoriDetail().getText());
        mD.setJenisSabun(dP.getJenisSabunDetail().getText());
        mD.setStatus(dP.getStatusDetail().getText());
        mD.hapus();        
    }
}
