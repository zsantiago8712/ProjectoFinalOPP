package application;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HD_Interface {

	private JFrame frame;
	private JTextField age_text;
	private JTextField bloodp_text;
	private JTextField cholesterol_text;
	private JTextField hdl_text;
	private JTextField heartrate_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HD_Interface window = new HD_Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HD_Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		JPanel title_panel = new JPanel();
		title_panel.setBackground(Color.WHITE);
		title_panel.setBorder(null);
		title_panel.setBounds(17, 6, 487, 102);
		frame.getContentPane().add(title_panel);
		title_panel.setLayout(null);
		
		JLabel title_label = new JLabel("RIESGO DE ENFERMEDAD");
		title_label.setForeground(new Color(102, 0, 0));
		title_label.setFont(new Font("Big Caslon", Font.PLAIN, 24));
		title_label.setBounds(80, 6, 339, 40);
		title_panel.add(title_label);
		
		JLabel title_label_1 = new JLabel("CARDIOVASCULAR");
		title_label_1.setForeground(new Color(102, 0, 0));
		title_label_1.setFont(new Font("Big Caslon", Font.PLAIN, 24));
		title_label_1.setBounds(119, 45, 242, 40);
		title_panel.add(title_label_1);
		
		JPanel options_panel = new JPanel();
		options_panel.setBounds(252, 120, 474, 427);
		frame.getContentPane().add(options_panel);
		options_panel.setLayout(null);
		
		JLabel age_label_1 = new JLabel("Ingrese su edad:");
		age_label_1.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		age_label_1.setBounds(20, 20, 121, 19);
		options_panel.add(age_label_1);
		
		age_text = new JTextField();
		age_text.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		age_text.setBounds(124, 16, 130, 26);
		options_panel.add(age_text);
		age_text.setColumns(10);
		
		JLabel sex_label = new JLabel("Seleccione su sexo:");
		sex_label.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		sex_label.setBounds(20, 60, 130, 16);
		options_panel.add(sex_label);
		
		JRadioButton sex_male = new JRadioButton("Masculino");
		sex_male.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		sex_male.setBounds(150, 56, 91, 23);
		options_panel.add(sex_male);
		
		JRadioButton sex_female = new JRadioButton("Femenino");
		sex_female.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		sex_female.setBounds(253, 56, 96, 23);
		options_panel.add(sex_female);
		
		ButtonGroup gp_sex = new ButtonGroup();
		gp_sex.add(sex_female);
		gp_sex.add(sex_male);
		
		JLabel chestpain_label = new JLabel("¿Presenta algún tipo de dolor de pecho?");
		chestpain_label.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		chestpain_label.setBounds(20, 100, 259, 16);
		options_panel.add(chestpain_label);
		
		JComboBox<String> chestpain_cbox = new JComboBox<String>();
		chestpain_cbox.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		chestpain_cbox.addItem("Angina típica");
		chestpain_cbox.addItem("Angina atípica");
	    chestpain_cbox.addItem("Dolor no anginal");
	    chestpain_cbox.addItem("Asintomático (sin dolor)");
		chestpain_cbox.setBounds(263, 96, 186, 27);
		options_panel.add(chestpain_cbox);
		
		JLabel bloodp_label = new JLabel("Ingrese resultados de presión sanguínea sistólica (mmHg):");
		bloodp_label.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		bloodp_label.setBounds(20, 140, 340, 16);
		options_panel.add(bloodp_label);
		
		bloodp_text = new JTextField();
		bloodp_text.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		bloodp_text.setBounds(372, 135, 96, 26);
		options_panel.add(bloodp_text);
		bloodp_text.setColumns(10);
		
		JLabel cholesterol_label = new JLabel("Ingrese resultados de colesterol (mg/dL):");
		cholesterol_label.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		cholesterol_label.setBounds(20, 180, 248, 16);
		options_panel.add(cholesterol_label);
		
		cholesterol_text = new JTextField();
		cholesterol_text.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		cholesterol_text.setBounds(273, 175, 130, 26);
		options_panel.add(cholesterol_text);
		cholesterol_text.setColumns(10);
		
		JLabel hyper_label = new JLabel("Tratamiento por hipertensión:");
		hyper_label.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
		hyper_label.setBounds(20, 220, 193, 16);
		options_panel.add(hyper_label);
		
		JLabel somker_label = new JLabel("¿Fuma?");
		somker_label.setBounds(20, 260, 61, 16);
		options_panel.add(somker_label);
		
		JLabel diabetes_label = new JLabel("¿Padece de diabetes?");
		diabetes_label.setBounds(20, 300, 139, 16);
		options_panel.add(diabetes_label);
		
		JLabel hdl_label = new JLabel("HDL:");
		hdl_label.setBounds(20, 340, 37, 16);
		options_panel.add(hdl_label);
		
		JLabel heartrate_label = new JLabel("Frecuencia cardiaca máxima:");
		heartrate_label.setBounds(20, 380, 221, 16);
		options_panel.add(heartrate_label);
		
		JRadioButton hyper_yes = new JRadioButton("Si");
		hyper_yes.setBounds(225, 216, 61, 23);
		options_panel.add(hyper_yes);
		
		JRadioButton hyper_no = new JRadioButton("No");
		hyper_no.setBounds(300, 216, 61, 23);
		options_panel.add(hyper_no);
		
		ButtonGroup gp_hyper = new ButtonGroup();
		gp_hyper.add(hyper_yes);
		gp_hyper.add(hyper_no);
		
		JRadioButton smoker_yes = new JRadioButton("Si");
		smoker_yes.setBounds(100, 256, 61, 23);
		options_panel.add(smoker_yes);
		
		JRadioButton smoker_no = new JRadioButton("No");
		smoker_no.setBounds(175, 256, 61, 23);
		options_panel.add(smoker_no);
		
		ButtonGroup gp_smoker = new ButtonGroup();
		gp_smoker.add(smoker_yes);
		gp_smoker.add(smoker_no);
		
		JRadioButton diabetes_no = new JRadioButton("No");
		diabetes_no.setBounds(265, 296, 61, 23);
		options_panel.add(diabetes_no);
		
		JRadioButton diabetes_yes = new JRadioButton("Si");
		diabetes_yes.setBounds(180, 296, 61, 23);
		options_panel.add(diabetes_yes);
		
		ButtonGroup gp_diabetes = new ButtonGroup();
		gp_diabetes.add(diabetes_yes);
		gp_diabetes.add(diabetes_no);
		
		hdl_text = new JTextField();
		hdl_text.setBounds(69, 335, 130, 26);
		options_panel.add(hdl_text);
		hdl_text.setColumns(10);
		
		heartrate_text = new JTextField();
		heartrate_text.setBounds(219, 375, 130, 26);
		options_panel.add(heartrate_text);
		heartrate_text.setColumns(10);
		
		JPanel logo_panel = new JPanel();
		logo_panel.setBackground(Color.WHITE);
		logo_panel.setBorder(null);
		logo_panel.setBounds(516, 6, 201, 102);
		frame.getContentPane().add(logo_panel);
		logo_panel.setLayout(null);
		
		JLabel logo_label = new JLabel();
		logo_label.setBounds(0, 6, 201, 90);
		logo_label.setIcon(new ImageIcon("/Users/sebastiancastaneda/eclipse-workspace/HeartDiseaseGUI/src/application/logo.png"));
		logo_panel.add(logo_label);
		
		JPanel info_panel = new JPanel();
		info_panel.setBackground(Color.WHITE);
		info_panel.setBounds(17, 120, 223, 427);
		frame.getContentPane().add(info_panel);
		info_panel.setLayout(null);
		
		JTextPane info_text = new JTextPane();
		info_text.setEditable(false);
		info_text.setBackground(Color.WHITE);
		info_text.setFont(new Font("Helvetica Neue", Font.ITALIC, 15));
		info_text.setToolTipText("");
		info_text.setBounds(19, 34, 186, 131);
		info_text.setText("Esta herramienta está basada en el Estudio del Corazón de Framingham. Mide las probabilidades de sufrir un paro cardíaco en los próximos 10 años, en personas mayores de 20.");
		info_panel.add(info_text);
		
		JLabel info_img = new JLabel();
		info_img.setIcon(new ImageIcon("/Users/sebastiancastaneda/eclipse-workspace/HeartDiseaseGUI/src/application/Icon.png"));
		info_img.setBounds(0, 177, 233, 229);
		info_panel.add(info_img);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 559, 709, 61);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton save_btn = new JButton("Guardar datos");
		save_btn.setBounds(161, 13, 138, 36);
		panel.add(save_btn);
		
		JButton predict_btn = new JButton("Realizar prediccion");
		predict_btn.setBounds(437, 13, 138, 36);
		panel.add(predict_btn);
		frame.setBounds(300, 100, 763, 654);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
