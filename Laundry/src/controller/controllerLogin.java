/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.pesanView;
import View.viewLogin;
import javax.swing.JOptionPane;
import model.modelLogin;

/**
 *
 * @author WIN10
 */
public class controllerLogin {
    private modelLogin mL;
    private viewLogin vL;
    private String level = "";
    
    public controllerLogin(viewLogin vL){
        this.vL = vL;
    }
    
    public void login(){
        try {
            mL = new modelLogin();
            mL.setUsername(vL.getUsernameView().getText());
            mL.setPassword(String.valueOf(vL.getPasswordView().getPassword()));
            mL.ambilData();
            //JOptionPane.showConfirmDialog(null, mL.getLevel());
            if (mL.getPassword().equals("")){
                vL.setPasswordView("");
            }
            
            if (mL.getLevel().equalsIgnoreCase("admin")) {
                
            }else if(mL.getLevel().equalsIgnoreCase("user")){
                pesanView pV = new pesanView();
                pV.setVisible(true);
                this.vL.dispose();
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
        }
    }
}
