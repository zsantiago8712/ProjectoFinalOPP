package com.sz.vista;

import com.sz.vista.Panel;

import javax.swing.*;

public class Window extends JFrame {
    private static final long serialVersionUID = 1L;
    public Panel mainPanel;

    public Window(String windowName, int width, int height) {
        super(windowName);
        setSize(width, height);
        setLocation(300, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(300, 100, 763, 654);
        setResizable(false);

        mainPanel = new Panel();
        mainPanel.setTitlePanel();
        mainPanel.setOptionsPanel();
        mainPanel.setLogoPanel();
        mainPanel.setInfoPanel();
        mainPanel.setPanelButtons();

        this.getContentPane().add(mainPanel.getTilePanel());
        this.getContentPane().add(mainPanel.getOptionsPanel());
        this.getContentPane().add(mainPanel.getLogoPanel());
        this.getContentPane().add(mainPanel.getInfoPanel());
        this.getContentPane().add(mainPanel.getButtonsPanel());

        this.add(mainPanel);
    }

}
