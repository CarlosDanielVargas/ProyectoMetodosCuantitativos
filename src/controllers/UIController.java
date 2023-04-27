/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author cdvv
 */
public class UIController {
    
    private static UIController UI_CONTROLLER;

    private UIController() {
    }

    public static UIController getUIController() {
        if(UI_CONTROLLER == null){
            UI_CONTROLLER = new UIController();
        }
        return UI_CONTROLLER;
    }
    
    public void popUpMessage(String s, String title, Component parentComponent ) {
        JOptionPane.showMessageDialog(parentComponent, s, title, 1);
    }
    
    public void popUpErrorMessage(String s, String title, Component parentComponent ) {
        JOptionPane.showMessageDialog(parentComponent, s, title, 0);
    }
    
}
