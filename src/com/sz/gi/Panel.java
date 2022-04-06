package com.sz.gi;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serial;

import javax.swing.*;
import javax.swing.text.PlainDocument;


public class Panel extends JPanel {

    @Serial
    private static final long serialVersionUID = 1L;

    private final JPanel tilePanel = new JPanel();
    private final JPanel optionsPanel = new JPanel();
    private final JPanel logoPanel = new JPanel();
    private final JPanel infoPanel = new JPanel();
    private final JPanel panelButtons = new JPanel();
    private JTextField heartrateText;
    private JTextField bloodpText;
    private JTextField cholesterolText;
    private JTextField hdlText;
    private JRadioButton diabetesYes;
    private JRadioButton diabetesNo;
    private JRadioButton hyperNo;
    private JRadioButton hyperYes;
    private JRadioButton smokerNo;
    private JRadioButton smokerYes;
    private JRadioButton sexMale;
    private JRadioButton sexFemale;


    void setTitlePanel(){
        tilePanel.setBackground(Color.WHITE);
        tilePanel.setBorder(null);
        tilePanel.setBounds(17, 6, 487, 102);
        tilePanel.setLayout(null);

        JLabel titleLabel = new JLabel("RIESGO DE ENFERMEDAD");
        titleLabel.setForeground(new Color(102, 0, 0));
        titleLabel.setFont(new Font("Big Caslon", Font.PLAIN, 24));
        titleLabel.setBounds(80, 6, 339, 40);
        tilePanel.add(titleLabel);

         JLabel titleLabel2 = new JLabel("CARDIOVASCULAR");
         titleLabel2.setForeground(new Color(102, 0, 0));
         titleLabel2.setFont(new Font("Big Caslon", Font.PLAIN, 24));
         titleLabel2.setBounds(119, 45, 242, 40);
         titleLabel.add(titleLabel2);
    }

    public JPanel getTilePanel() { return tilePanel; }

    void setOptionsPanel(){
        optionsPanel.setBounds(252, 120, 474, 427);
        optionsPanel.setLayout(null);

        JLabel ageLabel = new JLabel("Ingrese su edad:");
        ageLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        ageLabel.setBounds(20, 20, 121, 19);
        optionsPanel.add(ageLabel);

        /*
        JTextField ageText = new JTextField();
        ageText.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        ageText.setBounds(124, 16, 130, 26);
        optionsPanel.add(ageText);
        ageText.setColumns(10);*/

        JComboBox<String> age = new JComboBox<String>();
        age.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        age.setBounds(124, 16, 130, 26);
        age.setToolTipText("Edad");
        for (int i = 20; i < 76; i++)
            age.addItem(Integer.toString(i));

        age.addItem("Más de 75");
        optionsPanel.add(age);

        JLabel sexLabel = new JLabel("Seleccione su sexo:");
        sexLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        sexLabel.setBounds(20, 60, 130, 16);
        optionsPanel.add(sexLabel);

        sexMale = new JRadioButton("Masculino");
        sexMale.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        sexMale.setBounds(150, 56, 91, 23);
        optionsPanel.add(sexMale);

        sexFemale = new JRadioButton("Femenino");
        sexFemale.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        sexFemale.setBounds(253, 56, 96, 23);
        optionsPanel.add(sexFemale);

        ButtonGroup gpSex = new ButtonGroup();
        gpSex.add(sexFemale);
        gpSex.add(sexMale);

        JLabel chestpainLabel = new JLabel("¿Presenta algún tipo de dolor de pecho?");
        chestpainLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        chestpainLabel.setBounds(20, 100, 259, 16);
        optionsPanel.add(chestpainLabel);

        JComboBox<String> chestpainCbox = new JComboBox<String>();
        chestpainCbox.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        chestpainCbox.addItem("Angina típica");
        chestpainCbox.addItem("Angina atípica");
        chestpainCbox.addItem("Dolor no anginal");
        chestpainCbox.addItem("Asintomático (sin dolor)");
        chestpainCbox.setBounds(263, 96, 186, 27);
        optionsPanel.add(chestpainCbox);

        JLabel bloodpLabel = new JLabel("Ingrese resultados de presión sanguínea sistólica (mmHg):");
        bloodpLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        bloodpLabel.setBounds(20, 140, 340, 16);
        optionsPanel.add(bloodpLabel);



        bloodpText = new JTextField();
        bloodpText.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        bloodpText.setBounds(372, 135, 96, 26);
        optionsPanel.add(bloodpText);
        bloodpText.setColumns(10);

        PlainDocument bloodpTextFilter = (PlainDocument) bloodpText.getDocument();
        bloodpTextFilter.setDocumentFilter(new MyIntFilter());


        JLabel cholesterolLabel = new JLabel("Ingrese resultados de colesterol (mg/dL):");
        cholesterolLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        cholesterolLabel.setBounds(20, 180, 248, 16);
        optionsPanel.add(cholesterolLabel);

        cholesterolText = new JTextField();
        cholesterolText.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        cholesterolText.setBounds(273, 175, 130, 26);
        optionsPanel.add(cholesterolText);
        cholesterolText.setColumns(10);

        PlainDocument cholesterolTextFilter = (PlainDocument) cholesterolText.getDocument();
        cholesterolTextFilter.setDocumentFilter(new MyIntFilter());

        JLabel hyperLabel = new JLabel("Tratamiento por hipertensión:");
        hyperLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        hyperLabel.setBounds(20, 220, 193, 16);
        optionsPanel.add(hyperLabel);

        JLabel somkerLabel = new JLabel("¿Fuma?");
        somkerLabel.setBounds(20, 260, 61, 16);
        optionsPanel.add(somkerLabel);

        JLabel diabetesLabel = new JLabel("¿Padece de diabetes?");
        diabetesLabel.setBounds(20, 300, 139, 16);
        optionsPanel.add(diabetesLabel);

        JLabel hdlLabel = new JLabel("HDL:");
        hdlLabel.setBounds(20, 340, 37, 16);
        optionsPanel.add(hdlLabel);

        JLabel heartrateLabel = new JLabel("Frecuencia cardiaca máxima:");
        heartrateLabel.setBounds(20, 380, 221, 16);
        optionsPanel.add(heartrateLabel);

        hyperYes = new JRadioButton("Si");
        hyperYes.setBounds(225, 216, 61, 23);
        optionsPanel.add(hyperYes);

        hyperNo = new JRadioButton("No");
        hyperNo.setBounds(300, 216, 61, 23);
        optionsPanel.add(hyperNo);

        ButtonGroup gpHyper = new ButtonGroup();
        gpHyper.add(hyperYes);
        gpHyper.add(hyperNo);

        smokerYes = new JRadioButton("Si");
        smokerYes.setBounds(100, 256, 61, 23);
        optionsPanel.add(smokerYes);

        smokerNo = new JRadioButton("No");
        smokerNo.setBounds(175, 256, 61, 23);
        optionsPanel.add(smokerNo);

        ButtonGroup gpSmoker = new ButtonGroup();
        gpSmoker.add(smokerYes);
        gpSmoker.add(smokerNo);


        diabetesNo = new JRadioButton("No");
        diabetesNo.setBounds(265, 296, 61, 23);
        optionsPanel.add(diabetesNo);

        diabetesYes = new JRadioButton("Si");
        diabetesYes.setBounds(180, 296, 61, 23);
        optionsPanel.add(diabetesYes);

        ButtonGroup gpDiabetes = new ButtonGroup();
        gpDiabetes.add(diabetesYes);
        gpDiabetes.add(diabetesNo);

        hdlText = new JTextField();
        hdlText.setBounds(69, 335, 130, 26);
        optionsPanel.add(hdlText);
        hdlText.setColumns(10);

        PlainDocument hdlTextFilter = (PlainDocument) hdlText.getDocument();
        hdlTextFilter.setDocumentFilter(new MyIntFilter());

        heartrateText = new JTextField();
        heartrateText.setBounds(219, 375, 130, 26);
        optionsPanel.add(heartrateText);
        heartrateText.setColumns(10);

        PlainDocument heartrateTextFilter = (PlainDocument) heartrateText.getDocument();
        heartrateTextFilter.setDocumentFilter(new MyIntFilter());
    }

    public JPanel getOptionsPanel() { return optionsPanel; }

    public void setLogoPanel(){
        logoPanel.setBackground(Color.WHITE);
        logoPanel.setBorder(null);
        logoPanel.setBounds(516, 6, 201, 102);
        logoPanel.setLayout(null);

        JLabel logoLabel = new JLabel();
        logoLabel.setBounds(0, 6, 201, 90);
        logoLabel.setIcon(new ImageIcon("/Users/randymarsh/Documents/Proyectos/ProjectoFinalOPP/src/com/sz/gi/Images/logo.png"));
        logoPanel.add(logoLabel);
    }

    public JPanel getLogoPanel() { return logoPanel; }


    public void setInfoPanel(){
        infoPanel.setBackground(Color.WHITE);
        infoPanel.setBounds(17, 120, 223, 427);
        infoPanel.setLayout(null);

        JTextPane infoText = new JTextPane();
        infoText.setEditable(false);
        infoText.setBackground(Color.WHITE);
        infoText.setFont(new Font("Helvetica Neue", Font.ITALIC, 15));
        infoText.setToolTipText("");
        infoText.setBounds(19, 34, 186, 131);
        infoText.setText("Esta herramienta está basada en el Estudio del Corazón de Framingham. Mide las probabilidades de sufrir un paro cardíaco en los próximos 10 años, en personas mayores de 20.");
        infoPanel.add(infoText);

        JLabel infoImg = new JLabel();
        infoImg.setIcon(new ImageIcon("/Users/randymarsh/Documents/Proyectos/ProjectoFinalOPP/src/com/sz/gi/Images/Icon.png"));
        infoImg.setBounds(0, 177, 233, 229);
        infoPanel.add(infoImg);
    }

    public JPanel getInfoPanel() { return infoPanel; }

    public void setPanelButtons(){
        panelButtons.setBounds(17, 559, 709, 61);
        panelButtons.setLayout(null);

        JButton saveBtn = new JButton("Guardar datos");
        saveBtn.setBounds(161, 13, 138, 36);
        saveBtn.setToolTipText("Guardar datos");
        panelButtons.add(saveBtn);

        JButton predictBtn = new JButton("Realizar predicción");
        predictBtn.setBounds(437, 13, 138, 36);
        predictBtn.setToolTipText("Realizar predicción");
        panelButtons.add(predictBtn);

        saveBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(validateDataSelector() && validDataFloat()){
                    System.out.println("Todo correcto");
                    JOptionPane.showMessageDialog(null, "Se guardo correctamente", "Error", JOptionPane.INFORMATION_MESSAGE);

                }else {
                    System.out.println("Datos incorrectos");
                    JOptionPane.showMessageDialog(null, "Se dejo algun dato(s) vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        predictBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if(validateDataSelector() && validDataFloat()){
                    System.out.println("Todo correcto");
                    JOptionPane.showMessageDialog(null, "Se predijo correctamente", "Error", JOptionPane.INFORMATION_MESSAGE);

                }else {
                    System.out.println("Datos incorrectos");
                    JOptionPane.showMessageDialog(null, "Se dejo algun dato(s) vacio", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });



    }

    public JPanel getButtonsPanel() { return panelButtons; }

    private boolean validDataFloat(){
         if(heartrateText.getText().toString().equals("")
                || hdlText.getText().toString().equals("")
                || cholesterolText.getText().toString().equals("")
                || bloodpText.getText().toString().equals("")){
             System.out.println("ERROR: Datos vacio");
             return false;
         }
         System.out.println("Correcto");
         return true;
    }

    private boolean validateDataSelector(){
        if((!smokerNo.isSelected() && !smokerYes.isSelected())
                || (!diabetesNo.isSelected() && !diabetesYes.isSelected())
                || (!hyperNo.isSelected() && !hyperYes.isSelected())
                || (!sexFemale.isSelected() && !sexMale.isSelected())){
            System.out.println("ERROR: Datos vacio");
            return false;
        }
        System.out.println("Correcto");
        return true;
    }

}


