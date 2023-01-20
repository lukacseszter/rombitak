/*
* File: MainController.java
* Author: Lukács Eszter
* Copyright: 2023, Lukács Eszter
* Group: SZ II N
* Date: 2023-01-20
* Github: https://github.com/lukacseszter/
* Licenc: GNU GPL
*/

package controllers;

import models.MainModel;
import views.MainFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MainController {
    MainFrame mainFrame;
    MainModel mainModel;
    public MainController() {
        this.mainFrame = new MainFrame();
        this.mainModel = new MainModel();
    }

    public void button() {
        // JButton calcButton = this.mainModel.buttonPanel.calcButton;
        // calcButton.addActionListener(e->onClickCalcButton());

    }

    public void onClickCalcButton() {
        return;
    }
    
}

