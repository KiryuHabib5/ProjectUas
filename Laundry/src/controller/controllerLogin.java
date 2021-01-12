/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.adminView;
import View.pesanView;
import View.userView;
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
            //vL.setUsername(mL.getUsername());
            mL.ambilData();
            //JOptionPane.showConfirmDialog(null, mL.getUsername());
            if (mL.getPassword().equals("")){
                vL.setPasswordView("");
            }
            
            if (mL.getLevel().equalsIgnoreCase("admin")) {
                adminView aV = new adminView();
                aV.setVisible(true);
                aV.setLevel("admin");
                this.vL.dispose();
            }else if(mL.getLevel().equalsIgnoreCase("user")){
                userView uV = new userView();
                uV.setUsername(mL.getUsername());
                uV.setVisible(true);
                uV.setLevel("user");
                this.vL.dispose();
            }
            
        } catch (Exception e) {
            //JOptionPane.showConfirmDialog(null, e);
        }
    }
}
