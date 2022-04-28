package com.sz.controler;
import com.sz.model.DataBase;
import com.sz.vista.Window;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{

    final private Window window;
    final private Query db;
    private int edad;
    private String dolor;
    private float presion;
    private float colesterol;
    private boolean smokerData = false;
    private boolean hiperData = false;
    private boolean diabetesData = false;
    private boolean sexData = false;
    private float HDL;
    private int frecuencia;


    //final private Clasification clasification;

    public Controller() throws Exception {
        window = new Window("HeartDiseases", 90, 90);
        db = new Query();
        window.mainPanel.saveBtn.addActionListener(this);
    }

    public void run(){
        try {
            window.setVisible(true);
        }catch(Exception e){
            System.out.println("Error en la aplicacion");
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(validateDataSelector() && validDataFloat()){
                System.out.println("Todo correcto");
                db.Insertar(edad, sexData, dolor, presion, colesterol, hiperData, smokerData, diabetesData, HDL, frecuencia);
                JOptionPane.showMessageDialog(null, "Se guardo correctamente", "Error", JOptionPane.INFORMATION_MESSAGE);

        }else {
            System.out.println("Datos incorrectos");
            JOptionPane.showMessageDialog(null, "Se dejo algun dato(s) vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }


    private boolean validDataFloat(){
        if(window.mainPanel.heartrateText.getText().toString().equals("")
                || window.mainPanel.hdlText.getText().toString().equals("")
                || window.mainPanel.cholesterolText.getText().toString().equals("")
                || window.mainPanel.bloodpText.getText().toString().equals("")){
            System.out.println("ERROR: Datos vacio");
            return false;
        }
        getData();
        System.out.println("Correcto");
        return true;
    }

    private boolean validateDataSelector(){
        if((!window.mainPanel.smokerNo.isSelected() && !window.mainPanel.smokerYes.isSelected())
                || (!window.mainPanel.diabetesNo.isSelected() && !window.mainPanel.diabetesYes.isSelected())
                || (!window.mainPanel.hyperNo.isSelected() && !window.mainPanel.hyperYes.isSelected())
                || (!window.mainPanel.sexFemale.isSelected() && !window.mainPanel.sexMale.isSelected())){
            System.out.println("ERROR: Datos vacio");
            return false;
        }
        System.out.println("Correcto");

        return true;
    }


    private void getData(){
        if(window.mainPanel.smokerYes.isSelected())
            smokerData = true;

        if(window.mainPanel.diabetesYes.isSelected())
            smokerData = true;

        if(window.mainPanel.hyperYes.isSelected())
            hiperData = true;

        if(window.mainPanel.sexFemale.isSelected())
            sexData = true;

        edad = Integer.parseInt(window.mainPanel.age.getSelectedItem().toString());
        dolor = window.mainPanel.chestpainCbox.getSelectedItem().toString();
        presion = Float.parseFloat(window.mainPanel.bloodpText.getText().toString());
        colesterol = Float.parseFloat(window.mainPanel.cholesterolText.getText().toString());
        HDL = Float.parseFloat(window.mainPanel.hdlText.getText().toString());
        frecuencia = Integer.parseInt(window.mainPanel.heartrateText.getText().toString());
    }
}
