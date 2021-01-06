/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.pesanView;
import model.modelPesan;

/**
 *
 * @author WIN10
 */
public class controllerPesan {
    private modelPesan mP;
    private pesanView vP;
    
    public controllerPesan(pesanView pV){
        this.vP = pV;
    }
    
    public void konfirmmasi(){
        try {
            mP = new modelPesan();
            mP.setEstimasiBerat(Integer.parseInt(vP.getBeratPesanView().getText()));
            mP.setUsername(vP.getUsername());
            if (vP.getKategoriNormalPesanView().isSelected()) {
                mP.setKategori("Normal");
            }else if (vP.getKategoriExpertPesanView().isSelected()){
                mP.setKategori("Expert");
            }else if (vP.getKategoriVeryExpertPesanView().isSelected()){
                mP.setKategori("Very Expert");
            }
            
            if (vP.getSabunCairPesanView().isSelected()){
                mP.setJenisSabun("Cair");
            }else if (vP.getSabunBubukPesanView().isSelected()){
                mP.setJenisSabun("Bubuk");
            }
            
            mP.setAlamat(vP.getAlamatPesanView().getText());
            mP.konfirm();
        } catch (Exception e) {
        
        }
    }
}
