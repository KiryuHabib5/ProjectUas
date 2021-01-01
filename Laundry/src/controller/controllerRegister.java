/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.registerView;
import model.modelRegister;

/**
 *
 * @author WIN10
 */
public class controllerRegister {
    private modelRegister mR;
    private registerView vR;
    public String status;
    
    public controllerRegister(registerView vR){
        this.vR = vR;
    }
    
    public void register(){
        mR = new modelRegister();
        mR.setUsername(vR.getUsernameRegisterView().getText());
        mR.setNama(vR.getNamaRegisterView().getText());
        mR.setAlamat(vR.getAlamatRegisterView().getText());
        mR.setPassword(String.valueOf(vR.getPasswordRegisterView().getPassword()));
        mR.setRePassword(String.valueOf(vR.getRePasswordRegisterVieww().getPassword()));
        
        mR.register();
        if(mR.getRePassword().equals("")){            
            vR.setRePasswordRegisterVieww("");
        }else{
            status="sukses";
        }
    }
}
