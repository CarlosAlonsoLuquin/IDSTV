package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import models.AuthModel;

public class AuthView {
	
	
	public AuthView() { 
	}
	
	public void login() {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Login"); 
	    ventana.setSize(1000, 600);
	    ventana.setLocationRelativeTo(null);
	    ventana.setResizable(true); 
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
		
		
		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#789090"));
		panel.setOpaque(true);
		panel.setSize(1000, 600);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Welcome");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(200, 10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(etiqueta1);

		JLabel etiqueta2 = new JLabel("Username/Email: ");
		etiqueta2.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta2.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta2.setFont(new Font("Cambria", Font.BOLD, 14));
		etiqueta2.setLocation(200, 75);
		panel.add(etiqueta2);

		JTextField email = new JTextField();
		email.setSize(250, 30);
		email.setOpaque(true);
		email.setHorizontalAlignment(JLabel.HEIGHT);
		email.setFont(new Font("Cambria", Font.BOLD, 14));
		email.setLocation(125, 105);
		panel.add(email);

		JLabel etiqueta3 = new JLabel("Password: ");
		etiqueta3.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta3.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta3.setFont(new Font("Cambria", Font.BOLD, 14));
		etiqueta3.setLocation(200, 135);
		panel.add(etiqueta3);

		JPasswordField pass = new JPasswordField();
		pass.setSize(250, 30);
		pass.setOpaque(true);
		pass.setHorizontalAlignment(JLabel.HEIGHT);
		pass.setFont(new Font("Cambria", Font.BOLD, 14));
		pass.setLocation(125, 165);
		panel.add(pass);

		JButton join = new JButton("Log in");
		join.setSize(100, 50);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria", Font.BOLD, 14));
		join.setLocation(200, 250);
		panel.add(join);

		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Boolean flag1 = false, flag2 = false;

				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					email.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					flag1 = true;
				}

				String myPassword = new String(pass.getPassword());
				if (myPassword.equals("")) {
					pass.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					pass.setBorder(BorderFactory.createLineBorder(Color.green, 3));
					flag2 = true;
				}

				if (flag1 && flag2) {
					AuthModel am = new AuthModel();
					boolean is_login = am.login(email.getText(), myPassword);
					
					
					if (is_login) {
						JOptionPane.showMessageDialog(null, "Bienvenido al sistema");
					} else {
						JOptionPane.showMessageDialog(null, "Error en el acceso", "Hello", JOptionPane.ERROR_MESSAGE);

					}
				}
			}

		});
		JButton ir_registro = new JButton("ir al registro");
		ir_registro.setSize(130, 50);
		ir_registro.setBackground(Color.LIGHT_GRAY);
		ir_registro.setFont(new Font("Cambria", Font.BOLD, 12));
		ir_registro.setLocation(200, 320);
		panel.add(ir_registro);

		ir_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispose();
				AuthView.this.register();

				
			}

		});

		JLabel etiqueta4 = new JLabel("Forgot your password? ");
		etiqueta4.setSize(200, 30);
		// etiqueta2.setOpaque(true);
		etiqueta4.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta4.setFont(new Font("Cambria", Font.BOLD, 10));
		etiqueta4.setLocation(270, 200);
		panel.add(etiqueta4);

		JCheckBox boton = new JCheckBox("Remindme");
		boton.setSize(85, 30);
		boton.setLocation(120, 200);
		boton.setFont(new Font("Cambria", Font.BOLD, 10));
		boton.setBackground(Color.decode("#789090"));
		panel.add(boton);

//		ImageIcon imagen = new ImageIcon("imagenes/usuario.png");
//		JLabel icon_user = new JLabel();
//		icon_user.setBounds(90, 103, 30, 30);
//		icon_user.setIcon(new ImageIcon(
//				imagen.getImage().getScaledInstance(icon_user.getWidth(), icon_user.getHeight(), Image.SCALE_DEFAULT)));
//		panel.add(icon_user);

//		ImageIcon imagen2 = new ImageIcon("imagenes/password.png");
//		JLabel icon_pass = new JLabel();
//		icon_pass.setBounds(90, 165, 30, 30);
//		icon_pass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(icon_pass.getWidth(),
//				icon_pass.getHeight(), Image.SCALE_DEFAULT)));
//		panel.add(icon_pass);

//		ImageIcon imagen3 = new ImageIcon("imagenes/logo.png");
//		JLabel logo = new JLabel();
//		logo.setBounds(400, 0, 500, 500);
//		logo.setIcon(new ImageIcon(
//				imagen3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
//		panel.add(logo);
		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
		ventana.setVisible(true);
		
		
	}
	public void register() {
		
		JFrame ventana = new JFrame();
		
		ventana.setTitle("Registro"); 
	    ventana.setSize(1000, 600);
	    ventana.setLocationRelativeTo(null);
	    ventana.setResizable(true); 
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Registro");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 225, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(26, 41, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Direccion");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 140, 112, 35);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Apellido Paterno");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(50, 53, 112, 43);
		panel_1.add(lblNewLabel_2);

		JTextField textField = new JTextField();
		textField.setBounds(50, 106, 117, 19);
		panel_1.add(textField);
		textField.setColumns(10);

		JLabel lblNewLabel_2_1 = new JLabel("Apellido Materno");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(185, 53, 112, 43);
		panel_1.add(lblNewLabel_2_1);

		JTextField textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(180, 106, 117, 19);
		panel_1.add(textField_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Nombre/Nombres");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(307, 53, 112, 43);
		panel_1.add(lblNewLabel_2_1_1);

		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(307, 106, 117, 19);
		panel_1.add(textField_2);

		JLabel lblNewLabel_1_1 = new JLabel("Datos Personales");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 10, 145, 43);
		panel_1.add(lblNewLabel_1_1);

		JTextField textField_3 = new JTextField();
		textField_3.setBounds(50, 185, 374, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_1_2 = new JLabel("Ciudad");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(50, 214, 112, 35);
		panel_1.add(lblNewLabel_1_2);

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(
				new DefaultComboBoxModel(new String[] { "Selecciona una", "Cancún", "Chihuahua", "Ciudad de México",
						"Culiacán", "Guadalajara", "León", "La Paz", "Mérida", "Monterrey", "Puebla", "Querétaro" }));
		comboBox.setBounds(50, 259, 139, 21);
		panel_1.add(comboBox);

		JLabel lblNewLabel_1_2_1 = new JLabel("Estado");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(198, 214, 112, 35);
		panel_1.add(lblNewLabel_1_2_1);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "Selecciona una", "Aguascalientes  ",
				"Baja California  ", "Baja California Sur  ", "Campeche  ", "Chiapas  ", "Chihuahua  ",
				"Ciudad de México  ", "Coahuila  ", "Colima  ", "Durango  ", "Estado de México  ", "Guanajuato  ",
				"Guerrero  ", "Hidalgo  ", "Jalisco  ", "Michoacán  ", "Morelos  ", "Nayarit  ", "Nuevo León  ",
				"Oaxaca  ", "Puebla  ", "Querétaro  ", "Quintana Roo  ", "San Luis Potosí  ", "Sinaloa  ", "Sonora  ",
				"Tabasco  ", "Tamaulipas  ", "Tlaxcala  ", "Veracruz  ", "Yucatán  ", "Zacatecas  " }));
		comboBox_1.setBounds(199, 259, 139, 21);
		panel_1.add(comboBox_1);

		JLabel lblNewLabel_1_2_1_1 = new JLabel("CP");
		lblNewLabel_1_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1_1.setBounds(364, 214, 45, 35);
		panel_1.add(lblNewLabel_1_2_1_1);

		JTextField textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(348, 260, 76, 19);
		panel_1.add(textField_4);

		JLabel lblNewLabel_1_2_2 = new JLabel("CURP");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(50, 290, 112, 35);
		panel_1.add(lblNewLabel_1_2_2);

		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(50, 335, 374, 19);
		panel_1.add(textField_5);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(449, 0, 478, 495);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_1_1 = new JLabel("Datos de Contacto");
		lblNewLabel_1_1_1.setBounds(10, 23, 156, 22);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_2_2 = new JLabel("Correo Electronico");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(33, 55, 137, 43);
		panel_2.add(lblNewLabel_2_2);

		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(33, 108, 374, 19);
		panel_2.add(textField_6);

		JLabel lblNewLabel_2_2_1 = new JLabel("Numero de Telefono");
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(29, 137, 137, 43);
		panel_2.add(lblNewLabel_2_2_1);

		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(33, 190, 133, 19);
		panel_2.add(textField_7);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los Terminos y condiciones");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(33, 244, 219, 21);
		panel_2.add(chckbxNewCheckBox);

		JButton btnNewButton = new JButton("ir al login");
		btnNewButton.setBackground(Color.decode("#789090"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(296, 376, 111, 50);
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispose();
				AuthView.this.login();

				
			}

		});
		panel_2.add(btnNewButton);
		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
		ventana.setVisible(true);
		
	}

}
