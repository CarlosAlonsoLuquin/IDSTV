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

import controllers.HomeController;
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

				String passText = new String(pass.getPassword());
				Boolean flag1 = false, flag2 = false;

				if (passText.equals("")) {

					pass.setBorder(BorderFactory.createLineBorder(Color.red, 2));

				} else {

					pass.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					flag1 = true;
				}

				if (email.getText().equals("")) {
					email.setBorder(BorderFactory.createLineBorder(Color.red, 2));
				} else {

					email.setBorder(BorderFactory.createLineBorder(Color.green, 2));
					flag2 = true;
				}

				if (flag1 && flag2) {

					AuthModel am = new AuthModel();
					boolean is_login = am.login(email.getText(), passText);

					if (is_login) {
						JOptionPane.showMessageDialog(null, "Bienvenido.");

						ventana.dispose();
						HomeController hc = new HomeController();

						hc.home();

					} else {
						JOptionPane.showMessageDialog(null, "Error al acceder", "verifique su información",
								JOptionPane.WARNING_MESSAGE);
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

		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
		ventana.setVisible(true);

	}

	public void register() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setLocationRelativeTo(null);
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

		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 298, 112, 35);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Nombre Completo");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(50, 56, 145, 43);
		panel_1.add(lblNewLabel_2_1_1);

		JTextField nombre_field = new JTextField();
		nombre_field.setColumns(10);
		nombre_field.setBounds(50, 109, 374, 19);
		panel_1.add(nombre_field);

		JLabel lblNewLabel_1_1 = new JLabel("Datos Personales");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 10, 145, 43);
		panel_1.add(lblNewLabel_1_1);

		JPasswordField contraseña1 = new JPasswordField();
		contraseña1.setBounds(50, 343, 374, 19);
		panel_1.add(contraseña1);
		contraseña1.setColumns(10);

		JLabel lblNewLabel_1_2_2 = new JLabel("Confirmar Contraseña");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(50, 372, 145, 35);
		panel_1.add(lblNewLabel_1_2_2);

		JPasswordField contraseña2 = new JPasswordField();
		contraseña2.setColumns(10);
		contraseña2.setBounds(50, 417, 374, 19);
		panel_1.add(contraseña2);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(449, 0, 478, 495);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1_1_1 = new JLabel("Datos de la Empresa");
		lblNewLabel_1_1_1.setBounds(10, 23, 191, 22);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_1_1_1);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los Terminos y condiciones");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxNewCheckBox.setBounds(33, 329, 219, 21);
		panel_2.add(chckbxNewCheckBox);


		JLabel lblNewLabel_3 = new JLabel("Empresa");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 61, 79, 38);
		panel_2.add(lblNewLabel_3);

		JTextField empresa_field = new JTextField();
		empresa_field.setColumns(10);
		empresa_field.setBounds(10, 109, 374, 19);
		panel_2.add(empresa_field);

		JLabel lblNewLabel_4 = new JLabel("Ambito de la empresa");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(20, 158, 140, 38);
		panel_2.add(lblNewLabel_4);

		JComboBox ambito_empresa = new JComboBox(
				new Object[] { "Tecnología", "Salud", "Educación", "Comercio", "Otro" });
		ambito_empresa.setBounds(20, 211, 140, 30);
		panel_2.add(ambito_empresa);

		JButton btnLogin = new JButton("Login ");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AuthView.this.login();
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBackground(new Color(120, 144, 144));
		btnLogin.setBounds(124, 376, 111, 50);
		panel_2.add(btnLogin);

		JLabel lblNewLabel_2 = new JLabel("Fecha de nacimiento");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(50, 138, 145, 43);
		panel_1.add(lblNewLabel_2);

		JComboBox dia = new JComboBox(new Object[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
				"12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28",
				"29", "30", "31" });
		dia.setBounds(50, 191, 48, 19);
		panel_1.add(dia);

		JComboBox mes = new JComboBox(
				new Object[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" });
		mes.setBounds(108, 191, 47, 21);
		panel_1.add(mes);

		JComboBox año = new JComboBox(
				new Object[] { "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997" });
		año.setBounds(165, 191, 60, 21);
		panel_1.add(año);

		JLabel lblNewLabel_2_2 = new JLabel("Correo Electronico");
		lblNewLabel_2_2.setBounds(50, 220, 137, 43);
		panel_1.add(lblNewLabel_2_2);
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JTextField emailField = new JTextField();
		emailField.setBounds(50, 269, 374, 19);
		panel_1.add(emailField);
		emailField.setColumns(10);

		JLabel lblNewLabel_2_2_1 = new JLabel("Numero de Telefono");
		lblNewLabel_2_2_1.setBounds(269, 138, 137, 43);
		panel_1.add(lblNewLabel_2_2_1);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JTextField telefono = new JTextField();
		telefono.setBounds(269, 191, 133, 19);
		panel_1.add(telefono);
		telefono.setColumns(10);
		
		JButton registar = new JButton("Registrarse");
		registar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        String nombre = nombre_field.getText();
		        String email = emailField.getText();
		        String password = new String(contraseña1.getPassword());
		        String confirmPassword = new String(contraseña2.getPassword());  
		        String empresa = empresa_field.getText();
		       

		        if (nombre.isEmpty() || email.isEmpty() ||
		            password.isEmpty() || empresa.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, 
		                "Todos los campos son obligatorios.", 
		                "Error", 
		                JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		        if (!password.equals(confirmPassword)) {
		            JOptionPane.showMessageDialog(frame, 
		                "Las contraseñas no coinciden.", 
		                "Error", 
		                JOptionPane.ERROR_MESSAGE);
		            return;
		        }

		    

		        AuthModel modelo = new AuthModel();
		        boolean registroExitoso = modelo.registrarUsuario(nombre, email, password, empresa);

		        if (registroExitoso) {
		            JOptionPane.showMessageDialog(frame, 
		                "¡Registro exitoso!", 
		                "Éxito", 
		                JOptionPane.INFORMATION_MESSAGE);
		            frame.dispose(); 
		            login(); 
		        } else {
		            JOptionPane.showMessageDialog(frame, 
		                "Error al guardar los datos.", 
		                "Error", 
		                JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		registar.setBackground(Color.decode("#789090"));
		registar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		registar.setBounds(296, 376, 111, 50);
		panel_2.add(registar);
		
		
		frame.add(panel);
		frame.repaint();
		frame.revalidate();
		frame.setVisible(true);
	}

}
