package IDSTV;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame {

	public ventana() {
		this.setTitle("Hola");
		this.setVisible(true);
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);

		ImageIcon icono = new ImageIcon("imagenes/steam_icon.png");
		setIconImage(icono.getImage());
		this.add(this.login());
		// this.add(this.register());
		// this.add(this.users());
		// this.add(this.calculadora());
		// this.add(this.calculadora2());
		// this.add(this.interfaz());
		// this.add(this.recuperacion());

		JMenuBar barra = new JMenuBar();

		JMenu file = new JMenu("Archivo");
		barra.add(file);

		JMenuItem open = new JMenuItem("Abrir");
		file.add(open);

		JCheckBoxMenuItem op_1 = new JCheckBoxMenuItem("hola");
		file.add(op_1);

		JCheckBoxMenuItem op_2 = new JCheckBoxMenuItem("Guardar");
		file.add(op_2);

		JMenuItem open3 = new JMenuItem("Ayuda");
		file.add(open3);

		JMenuItem close = new JMenuItem("Cerrar");
		file.add(close);

		JMenu opciones = new JMenu("Opciones");
		barra.add(opciones);

		JMenuItem open35 = new JMenuItem("Ayuda");
		opciones.add(open35);

		JMenu opciones2 = new JMenu("Cuenta");
		barra.add(opciones2);

		JMenuItem open2 = new JMenuItem("recuperacion de cuenta");
		opciones2.add(open2);
		open2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("recuperacion de cuenta");

			}
		});

		JMenuItem open5 = new JMenuItem("registro");
		open5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");

			}
		});
		opciones2.add(open5);

		JMenuItem open6 = new JMenuItem("login");
		open6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");

			}
		});
		opciones2.add(open6);

		JMenu opciones3 = new JMenu("usuarios");
		barra.add(opciones3);

		JMenuItem open1 = new JMenuItem("Alta");
		open1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Alta");

			}
		});
		opciones3.add(open1);

		JMenuItem open4 = new JMenuItem("Baja");
		open4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Baja");

			}
		});
		opciones3.add(open4);

		JMenuItem open7 = new JMenuItem("Consultar");
		open7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("Consultar");

			}
		});
		opciones3.add(open7);

		JMenu opciones4 = new JMenu("Ayuda");
		barra.add(opciones4);

		JMenuItem open8 = new JMenuItem("¿Cómo crear un usuario?");
		open8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Cómo crear un usuario?");

			}
		});
		opciones4.add(open8);

		JMenuItem open9 = new JMenuItem("¿Cómo acceder al sistema?");
		open9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Cómo acceder al sistema?");

			}
		});
		opciones4.add(open9);

		JMenuItem open10 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		open10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				router("¿Qué pasa si olvidé mi contraseña?");

			}
		});
		opciones4.add(open10);

		this.setJMenuBar(barra);

		this.revalidate();
		this.repaint();

	}

	public JPanel Sistema() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Como acceder al sistema");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 254, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 42, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("sigue estos pasos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 10, 177, 34);
		panel_1.add(lblNewLabel_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 614, 403);
		panel_1.add(scrollPane);

		JTextArea txtrseleccionaLa = new JTextArea();
		txtrseleccionaLa.setText(
				"Sigue estos pasos para iniciar sesión en tu cuenta:  \r\n\r\n1. **Selecciona la opción \"Cuenta\" en la barra superior**  \r\n   - En la parte superior de la página, ubica la barra de navegación.  \r\n   - Haz clic en la opción **\"Cuenta\"** para desplegar las opciones disponibles.  \r\n\r\n2. **Haz clic en \"Login\"**  \r\n   - Dentro del menú desplegable, selecciona la opción **\"Login\"** para acceder al formulario de inicio de sesión.  \r\n\r\n3. **Ingresa tus credenciales**  \r\n   - Escribe tu **correo electrónico** o **nombre de usuario**.  \r\n   - Introduce tu **contraseña**.  \r\n\r\n4. **Haz clic en \"Iniciar sesión\"**  \r\n   - Una vez ingresados los datos, presiona el botón **\"Iniciar sesión\"**.  \r\n");
		scrollPane.setViewportView(txtrseleccionaLa);

		this.revalidate();
		this.repaint();
		return panel;
	}

	public JPanel Nuevacontraseña() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Como recuperar la contraseña");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 285, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 42, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("sigue estos pasos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 10, 177, 34);
		panel_1.add(lblNewLabel_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 614, 403);
		panel_1.add(scrollPane);

		JTextArea txtrseleccionaLa = new JTextArea();
		txtrseleccionaLa.setText(
				"Si olvidaste tu contraseña, sigue estos pasos para restablecerla:  \r\n\r\n1. **Selecciona la opción \"Cuenta\" en la barra superior**  \r\n   - En la parte superior de la página, ubica la barra de navegación.  \r\n   - Haz clic en la opción **\"Cuenta\"** para desplegar las opciones disponibles.  \r\n\r\n2. **Haz clic en \"Recuperación de cuenta\"**  \r\n   - Dentro del menú desplegable, selecciona la opción **\"Recuperación de cuenta\"**.  \r\n\r\n3. **Ingresa tu correo electrónico**  \r\n   - Escribe el correo electrónico asociado a tu cuenta.  \r\n   - Luego, haz clic en el botón **\"Enviar\"** o **\"Recuperar contraseña\"**.  \r\n\r\n4. **Revisa tu correo electrónico**  \r\n   - Recibirás un correo con un enlace para restablecer tu contraseña.  \r\n   - Si no lo encuentras, revisa la carpeta de **spam** o **correo no deseado**.  \r\n\r\n5. **Restablece tu contraseña**  \r\n   - Abre el enlace que recibiste y escribe una nueva contraseña segura.  \r\n   - Confirma la nueva contraseña y haz clic en **\"Guardar\"** o **\"Actualizar contraseña\"**.  \r\n\r\n6. **Inicia sesión con tu nueva contraseña**  \r\n   - Vuelve a la página de inicio de sesión e ingresa con tu nueva contraseña. ");
		scrollPane.setViewportView(txtrseleccionaLa);

		this.revalidate();
		this.repaint();
		return panel;
	}

	public JPanel Usuarionuevo() {

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Como crear una cuenta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 225, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 42, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("sigue estos pasos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 10, 177, 34);
		panel_1.add(lblNewLabel_1_1);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 614, 403);
		panel_1.add(scrollPane);

		JTextArea txtrseleccionaLa = new JTextArea();
		txtrseleccionaLa.setText(
				"1. **Selecciona la opción \"Usuario\" en la barra superior**  \r\n   - En la parte superior de la página, ubica la barra de navegación.  \r\n   - Haz clic en la opción **\"Usuario\"** para desplegar las opciones de cuenta.  \r\n\r\n2. **Haz clic en \"Alta\"**  \r\n   - Dentro del menú desplegable, selecciona la opción **\"Alta\"** para iniciar el registro.  \r\n\r\n3. **Completa el formulario de registro**  \r\n   - Ingresa la información requerida, como:  \r\n     - Nombre completo  \r\n     - Correo electrónico  \r\n     - Contraseña segura  \r\n     - Otros datos necesarios  \r\n\r\n4. **Acepta los términos y condiciones**  \r\n   - Marca la casilla de aceptación de términos y políticas de privacidad.  \r\n\r\n5. **Haz clic en \"Registrar\" o \"Crear cuenta\"**  \r\n   - Una vez completados los datos, presiona el botón de **registro**.  \r\n\r\n6. **Verifica tu correo electrónico**  \r\n   - Revisa tu bandeja de entrada y busca un correo de confirmación.  \r\n   - Haz clic en el enlace de verificación para activar tu cuenta.  \r\n\r\n7. **¡Listo! Inicia sesión**  \r\n   - Vuelve a la página de inicio e ingresa con tu correo y contraseña.");
		scrollPane.setViewportView(txtrseleccionaLa);

		this.revalidate();
		this.repaint();
		return panel;
	}

	public JPanel baja() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Baja  Usuario");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 225, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 42, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1_1 = new JLabel("Eliminar Cuenta");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(89, 10, 152, 43);
		panel_1.add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("HOLA: ");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(20, 67, 38, 35);
		panel_1.add(lblNewLabel_1_1_1);

		JTextField txtUsuario = new JTextField();
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(68, 76, 79, 19);
		panel_1.add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Lamentamos que quieras eliminar tu cuenta\r\n\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(20, 130, 252, 35);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_1_2 = new JLabel("Si te preocupan nuestros condiciones de servicio por favor contactanos");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(20, 175, 394, 35);
		panel_1.add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_2_1 = new JLabel("Recuerda que puedes desabilitar temporalmente tu cuenta");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(20, 220, 394, 35);
		panel_1.add(lblNewLabel_1_2_1);

		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(119, 292, 111, 43);
		panel_1.add(btnNewButton);

		this.revalidate();
		this.repaint();
		return panel;
	}

	public JPanel alta() {
		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nuevo Usuario");
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

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBackground(Color.decode("#789090"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton.setBounds(296, 376, 111, 50);
		panel_2.add(btnNewButton);

		this.revalidate();
		this.repaint();
		return panel;

	}

	public JPanel recuperacion() {

		JFrame frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#789090"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Recuperacion de cuenta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(136, 10, 225, 27);
		panel.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(137, 36, 733, 293);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Ingrese su correo registrado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(231, 10, 210, 40);
		panel_1.add(lblNewLabel_1);

		JTextField textField = new JTextField();
		textField.setBounds(148, 48, 361, 38);
		panel_1.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setBounds(145, 146, 85, 21);
		panel_1.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Enviar");
		btnNewButton_1.setBackground(new Color(0, 255, 0));
		btnNewButton_1.setBounds(411, 148, 85, 21);
		panel_1.add(btnNewButton_1);

		this.revalidate();
		this.repaint();
		return panel;
	}

	public void router(String route) {

		this.getContentPane().removeAll();

		if (route.equals("register")) {
			this.add(this.register());
		}
		if (route.equals("login")) {
			this.add(this.login());
		}

		if (route.equals("recuperacion de cuenta")) {
			this.add(this.recuperacion());
		}
		if (route.equals("Alta")) {
			this.add(this.alta());
		}
		if (route.equals("Baja")) {
			this.add(this.baja());
		}
		if (route.equals("Consultar")) {
			this.add(this.users());
		}
		if (route.equals("¿Cómo crear un usuario?")) {
			this.add(this.Usuarionuevo());
		}
		if (route.equals("¿Qué pasa si olvidé mi contraseña?")) {
			this.add(this.Nuevacontraseña());
		}
		if (route.equals("¿Cómo acceder al sistema?")) {
			this.add(this.Sistema());
		}

		this.revalidate();
		this.repaint();

	}

	// trabajo 9 apartir de aqui
	public JPanel login() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#789090"));
		panel.setOpaque(true);
		panel.setSize(1000, 500);
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
				}

				String myPassword = new String(pass.getPassword());
				if (myPassword.equals("")) {
					pass.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					pass.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				}

				if (flag1 && flag2) {
					if (email.getText().equals("carlos_23"))
						;
				}
				if (pass.equals("123456")) {
					JOptionPane.showMessageDialog(null, "bienvenido", "hello", JOptionPane.WARNING_MESSAGE);
				} else {
					JOptionPane.showMessageDialog(null, "Error en el acceso", "hello", JOptionPane.ERROR_MESSAGE);
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

				router("register");

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

		ImageIcon imagen = new ImageIcon("imagenes/usuario.png");
		JLabel icon_user = new JLabel();
		icon_user.setBounds(90, 103, 30, 30);
		icon_user.setIcon(new ImageIcon(
				imagen.getImage().getScaledInstance(icon_user.getWidth(), icon_user.getHeight(), Image.SCALE_DEFAULT)));
		panel.add(icon_user);

		ImageIcon imagen2 = new ImageIcon("imagenes/password.png");
		JLabel icon_pass = new JLabel();
		icon_pass.setBounds(90, 165, 30, 30);
		icon_pass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(icon_pass.getWidth(),
				icon_pass.getHeight(), Image.SCALE_DEFAULT)));
		panel.add(icon_pass);

		ImageIcon imagen3 = new ImageIcon("imagenes/logo.png");
		JLabel logo = new JLabel();
		logo.setBounds(400, 0, 500, 500);
		logo.setIcon(new ImageIcon(
				imagen3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(), Image.SCALE_SMOOTH)));
		panel.add(logo);

		return panel;
	}

	public JPanel register() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#789090"));
		panel.setOpaque(true);
		panel.setSize(500, 500);
		panel.setLocation(500, 0);
		panel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Username: ");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(200, 10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(etiqueta1);

		JTextField user_tag = new JTextField();
		user_tag.setSize(250, 30);
		user_tag.setOpaque(true);
		user_tag.setHorizontalAlignment(JLabel.HEIGHT);
		user_tag.setFont(new Font("Cambria", Font.BOLD, 14));
		user_tag.setLocation(125, 50);
		panel.add(user_tag);

		JLabel etiqueta2 = new JLabel("Bio: ");
		etiqueta2.setSize(100, 50);
		etiqueta2.setLocation(200, 70);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setFont(new Font("Cambria", Font.BOLD, 16));
		panel.add(etiqueta2);

		JTextArea bio_tag = new JTextArea();
		bio_tag.setSize(250, 80);
		bio_tag.setLocation(125, 110);
		panel.add(bio_tag);

		JLabel etiqueta3 = new JLabel("Marital status: ");
		etiqueta3.setSize(150, 50);
		etiqueta3.setLocation(180, 180);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setFont(new Font("Cambria", Font.BOLD, 16));
		panel.add(etiqueta3);

		JCheckBox boton = new JCheckBox("Married");
		boton.setSize(80, 30);
		boton.setLocation(125, 215);
		boton.setFont(new Font("Cambria", Font.BOLD, 14));
		boton.setBackground(Color.decode("#789090"));
		panel.add(boton);

		JCheckBox boton2 = new JCheckBox("Single");
		boton2.setSize(80, 30);
		boton2.setLocation(210, 215);
		boton2.setFont(new Font("Cambria", Font.BOLD, 14));
		boton2.setBackground(Color.decode("#789090"));
		panel.add(boton2);

		JCheckBox boton3 = new JCheckBox("Divorced");
		boton3.setSize(90, 30);
		boton3.setLocation(285, 215);
		boton3.setFont(new Font("Cambria", Font.BOLD, 14));
		boton3.setBackground(Color.decode("#789090"));
		panel.add(boton3);

		JLabel etiqueta4 = new JLabel("Neighborhood ");
		etiqueta4.setSize(150, 50);
		etiqueta4.setLocation(180, 230);
		etiqueta4.setHorizontalAlignment(JLabel.CENTER);
		etiqueta4.setFont(new Font("Cambria", Font.BOLD, 16));
		panel.add(etiqueta4);

		String[] col = { "Camino Real", "Diana Laura", "Centro", "Calafia" };
		JComboBox colonias = new JComboBox(col);
		colonias.setSize(250, 30);
		colonias.setLocation(125, 270);
		panel.add(colonias);

		JButton join = new JButton("Log in");
		join.setSize(100, 50);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria", Font.BOLD, 14));
		join.setLocation(200, 330);
		join.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel.add(join);

		join.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Boolean flag1 = false, flag2 = false;

				if (user_tag.getText().equals("")) {
					user_tag.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					user_tag.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				}

				if (bio_tag.getText().equals("")) {
					bio_tag.setBorder(BorderFactory.createLineBorder(Color.RED, 3));

				} else {
					bio_tag.setBorder(BorderFactory.createLineBorder(Color.green, 3));
				}

			}

		});

		JButton ir_login = new JButton("ir al login");
		ir_login.setSize(130, 50);
		ir_login.setBackground(Color.LIGHT_GRAY);
		ir_login.setFont(new Font("Cambria", Font.BOLD, 12));
		ir_login.setLocation(200, 400);
		panel.add(ir_login);

		ir_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");

			}

		});

		JRadioButton acep_tag = new JRadioButton("Accept the terms", true);
		acep_tag.setSize(110, 20);
		acep_tag.setLocation(125, 300);
		acep_tag.setFont(new Font("Cambria", Font.BOLD, 10));
		acep_tag.setBackground(Color.decode("#789090"));
		acep_tag.setOpaque(true);
		panel.add(acep_tag);

		JRadioButton dont_tag = new JRadioButton("don't accept the terms", false);
		dont_tag.setSize(150, 20);
		dont_tag.setLocation(246, 300);
		dont_tag.setFont(new Font("Cambria", Font.BOLD, 10));
		dont_tag.setBackground(Color.decode("#789090"));
		dont_tag.setOpaque(true);
		panel.add(dont_tag);

		ButtonGroup botones = new ButtonGroup();
		botones.add(acep_tag);
		botones.add(dont_tag);

		return panel;

	}

	public JPanel users() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#789090"));
		panel.setOpaque(true);
		panel.setSize(500, 500);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		JLabel etiqueta1 = new JLabel("Bienvenido ");
		etiqueta1.setSize(100, 50);
		etiqueta1.setLocation(200, 10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(etiqueta1);

		String titles[] = { "correo electronico", };

		String datos[][] = { { "juan.perez123@email.com " }, { "sofia_gomez99@mail.net " },
				{ "carlos.lopezx@fakeinbox.org " }, { "andrea.mendoza@correo.com" }, { "pedro.alfaro777@inbox.com " },
				{ "maria.rodriguez88@fakemail.io " }, { "luis_fernandez@tempmail.org  ", },
				{ "diana_sanchez@maildrop.cc", }, { "ricardo.morales@trashmail.com", },
				{ "laura.castillo@temporaryinbox.com ", }, { "felipe_garcia@randommail.net", },
				{ "monica_torres@disposablemail.com ", }, { "jose.martinezx@inboxmail.org", },
				{ "angelica_rios@tempinbox.net", }, { "roberto_herrera@throwawaymail.com", } };

		JTable tabla = new JTable(datos, titles);
		JScrollPane scroll_pane = new JScrollPane(tabla);
		scroll_pane.setSize(370, 200);
		scroll_pane.setLocation(60, 200);
		panel.add(scroll_pane);

		JButton join = new JButton("Aceptar");
		join.setSize(70, 40);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria", Font.BOLD, 14));
		join.setLocation(270, 150);
		join.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel.add(join);

		JButton join2 = new JButton("Denegar");
		join2.setSize(70, 40);
		join2.setBackground(Color.LIGHT_GRAY);
		join2.setFont(new Font("Cambria", Font.BOLD, 14));
		join2.setLocation(360, 150);
		join2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel.add(join2);

		JLabel etiqueta2 = new JLabel("Numero de usuarios:");
		etiqueta2.setSize(200, 50);
		etiqueta2.setLocation(33, 70);
		etiqueta2.setHorizontalAlignment(JLabel.CENTER);
		etiqueta2.setFont(new Font("Cambria", Font.BOLD, 16));
		panel.add(etiqueta2);

		JLabel etiqueta3 = new JLabel("15");
		etiqueta3.setSize(200, 50);
		etiqueta3.setLocation(33, 100);
		etiqueta3.setHorizontalAlignment(JLabel.CENTER);
		etiqueta3.setFont(new Font("Cambria", Font.BOLD, 20));
		panel.add(etiqueta3);

		return panel;
	}

	public JPanel calculadora() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#789090"));
		panel.setOpaque(true);
		panel.setSize(300, 350);
		panel.setLocation(0, 0);
		panel.setLayout(null);

		JTextField user_tag = new JTextField();
		user_tag.setSize(265, 30);
		user_tag.setOpaque(true);
		user_tag.setHorizontalAlignment(JLabel.HEIGHT);
		user_tag.setFont(new Font("Cambria", Font.BOLD, 14));
		user_tag.setLocation(10, 10);
		user_tag.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
		panel.add(user_tag);

		JButton button_0 = new JButton("O");
		button_0.setSize(140, 45);
		button_0.setBackground(Color.LIGHT_GRAY);
		button_0.setFont(new Font("Cambria", Font.BOLD, 14));
		button_0.setLocation(10, 235);
		panel.add(button_0);

		JButton button_n = new JButton(".");
		button_n.setSize(55, 45);
		button_n.setBackground(Color.LIGHT_GRAY);
		button_n.setFont(new Font("Cambria", Font.BOLD, 14));
		button_n.setLocation(157, 235);
		panel.add(button_n);

		JButton button_m = new JButton("=");
		button_m.setSize(55, 100);
		button_m.setBackground(Color.LIGHT_GRAY);
		button_m.setFont(new Font("Cambria", Font.BOLD, 14));
		button_m.setLocation(220, 180);
		panel.add(button_m);

		JButton button_k = new JButton("+");
		button_k.setSize(55, 95);
		button_k.setBackground(Color.LIGHT_GRAY);
		button_k.setFont(new Font("Cambria", Font.BOLD, 14));
		button_k.setLocation(220, 80);
		panel.add(button_k);

		JButton button_r = new JButton("-");
		button_r.setSize(55, 30);
		button_r.setBackground(Color.LIGHT_GRAY);
		button_r.setFont(new Font("Cambria", Font.BOLD, 14));
		button_r.setLocation(220, 45);
		panel.add(button_r);

		JButton button_1 = new JButton("1");
		button_1.setSize(70, 50);
		button_1.setBackground(Color.LIGHT_GRAY);
		button_1.setFont(new Font("Cambria", Font.BOLD, 14));
		button_1.setLocation(10, 180);
		panel.add(button_1);

		JButton button_2 = new JButton("2");
		button_2.setSize(65, 50);
		button_2.setBackground(Color.LIGHT_GRAY);
		button_2.setFont(new Font("Cambria", Font.BOLD, 14));
		button_2.setLocation(85, 180);
		panel.add(button_2);

		JButton button_3 = new JButton("3");
		button_3.setSize(55, 50);
		button_3.setBackground(Color.LIGHT_GRAY);
		button_3.setFont(new Font("Cambria", Font.BOLD, 14));
		button_3.setLocation(157, 180);
		panel.add(button_3);

		JButton button_4 = new JButton("4");
		button_4.setSize(70, 45);
		button_4.setBackground(Color.LIGHT_GRAY);
		button_4.setFont(new Font("Cambria", Font.BOLD, 14));
		button_4.setLocation(10, 130);
		panel.add(button_4);

		JButton button_5 = new JButton("5");
		button_5.setSize(65, 45);
		button_5.setBackground(Color.LIGHT_GRAY);
		button_5.setFont(new Font("Cambria", Font.BOLD, 14));
		button_5.setLocation(85, 130);
		panel.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.setSize(55, 45);
		button_6.setBackground(Color.LIGHT_GRAY);
		button_6.setFont(new Font("Cambria", Font.BOLD, 14));
		button_6.setLocation(157, 130);
		panel.add(button_6);

		JButton button_7 = new JButton("7");
		button_7.setSize(70, 45);
		button_7.setBackground(Color.LIGHT_GRAY);
		button_7.setFont(new Font("Cambria", Font.BOLD, 14));
		button_7.setLocation(10, 80);
		panel.add(button_7);

		JButton button_8 = new JButton("8");
		button_8.setSize(65, 45);
		button_8.setBackground(Color.LIGHT_GRAY);
		button_8.setFont(new Font("Cambria", Font.BOLD, 14));
		button_8.setLocation(85, 80);
		panel.add(button_8);

		JButton button_9 = new JButton("9");
		button_9.setSize(55, 45);
		button_9.setBackground(Color.LIGHT_GRAY);
		button_9.setFont(new Font("Cambria", Font.BOLD, 14));
		button_9.setLocation(157, 80);
		panel.add(button_9);

		JButton button_g = new JButton("*");
		button_g.setSize(100, 30);
		button_g.setBackground(Color.LIGHT_GRAY);
		button_g.setFont(new Font("Cambria", Font.BOLD, 14));
		button_g.setLocation(113, 45);
		panel.add(button_g);

		JButton button_a = new JButton("/");
		button_a.setSize(100, 30);
		button_a.setBackground(Color.LIGHT_GRAY);
		button_a.setFont(new Font("Cambria", Font.BOLD, 14));
		button_a.setLocation(10, 45);
		panel.add(button_a);

		return panel;
	}

	public JPanel calculadora2() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#380038"));
		panel.setOpaque(true);
		panel.setLayout(new BorderLayout());

		JLabel results = new JLabel("20.00");
		results.setBackground(Color.WHITE);
		results.setOpaque(true);
		results.setFont(new Font("Cambria", Font.BOLD, 35));
		results.setHorizontalAlignment(JLabel.RIGHT);
		panel.add(results, BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setBackground(Color.BLUE);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel.add(centro, BorderLayout.CENTER);

		JPanel botones = new JPanel();
		botones.setBackground(Color.decode("#789090"));
		botones.setLayout(new GridLayout(4, 3, 2, 2));

		centro.add(botones, BorderLayout.CENTER);

		String[] textos = { "9", "8", "7", "6", "5", "4", "3", "2", "1", "0", "." };

		for (String texto_botton : textos) {
			JButton boton = new JButton(texto_botton);
			botones.add(boton);

		}

		JPanel orilla = new JPanel();
		orilla.setBackground(Color.decode("#789090"));
		orilla.setLayout(new GridLayout(6, 1, 2, 2));
		centro.add(orilla, BorderLayout.LINE_END);

		String[] textos2 = { "+", "-", "*", "/", "=", "CE" };

		for (String texto_boton : textos2) {
			JButton boton = new JButton(texto_boton);
			orilla.add(boton);
		}

		return panel;

	}

	public JPanel interfaz() {

		JPanel panel = new JPanel();

		panel.setOpaque(true);
		panel.setLayout(new BorderLayout());

		JLabel results = new JLabel("Interes");
		results.setFont(new Font("Cambria", Font.BOLD, 18));
		panel.add(results, BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setBackground(Color.CYAN);
		centro.setOpaque(true);
		centro.setLayout(new BorderLayout());
		panel.add(centro, BorderLayout.CENTER);
		centro.setLayout(new GridLayout(3, 3));

		JLabel text3 = new JLabel("Capital: ");
		text3.setFont(new Font("Cambria", Font.BOLD, 18));
		text3.setBorder(BorderFactory.createMatteBorder(45, 70, 45, 1, Color.cyan));
		centro.add(text3);

		JTextField texw3 = new JTextField("1500");
		texw3.setFont(new Font("Cambria", Font.BOLD, 18));
		texw3.setBorder(BorderFactory.createMatteBorder(45, 1, 45, 70, Color.cyan));
		centro.add(texw3);

		JLabel text4 = new JLabel("Tiempo: ");
		text4.setFont(new Font("Cambria", Font.BOLD, 18));
		text4.setBorder(BorderFactory.createMatteBorder(45, 70, 45, 1, Color.cyan));
		centro.add(text4);

		JTextField texw4 = new JTextField("2");
		texw4.setFont(new Font("Cambria", Font.BOLD, 18));
		texw4.setBorder(BorderFactory.createMatteBorder(45, 1, 45, 70, Color.cyan));
		centro.add(texw4);

		JLabel text5 = new JLabel("Tasa de interes: ");
		text5.setFont(new Font("Cambria", Font.BOLD, 18));
		text5.setBorder(BorderFactory.createMatteBorder(45, 35, 45, 1, Color.cyan));
		centro.add(text5);

		JTextField texw5 = new JTextField("0.1");
		texw5.setFont(new Font("Cambria", Font.BOLD, 18));
		texw5.setBorder(BorderFactory.createMatteBorder(45, 1, 45, 70, Color.cyan));
		centro.add(texw5);

		JPanel abajo = new JPanel();
		abajo.setBackground(Color.CYAN);
		abajo.setLayout(new GridLayout(2, 2));
		panel.add(abajo, BorderLayout.SOUTH);

		JLabel text1 = new JLabel("Interes: ");
		text1.setFont(new Font("Cambria", Font.BOLD, 18));
		text1.setBorder(BorderFactory.createMatteBorder(1, 70, 1, 1, Color.cyan));
		abajo.add(text1);

		JTextField texw1 = new JTextField("315.000000");
		texw1.setFont(new Font("Cambria", Font.BOLD, 18));
		texw1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 70, Color.cyan));
		abajo.add(texw1);

		JLabel text2 = new JLabel("Monto");
		text2.setFont(new Font("Cambria", Font.BOLD, 18));
		text2.setBorder(BorderFactory.createMatteBorder(1, 70, 1, 1, Color.cyan));
		abajo.add(text2);

		JTextField texw2 = new JTextField("45.000000");
		texw2.setFont(new Font("Cambria", Font.BOLD, 18));
		texw2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 70, Color.cyan));
		abajo.add(texw2);

		return panel;
	}
//	@Override
//	public void paint(Graphics g) {

//		super.paint(g);
//		
//		Graphics2D g2d = (Graphics2D) g.create();
//		g2d.setStroke(new BasicStroke(5));
//		g2d.setColor(Color.decode("#2e14ed"));
//		g2d.fillRect(0, 0, 1300, 600);
//		g2d.setColor(Color.decode("#AF8260"));
//		g2d.fillRect(0, 550, 600, 50);
//		g2d.setColor(Color.decode("#E4C59E"));
//		g2d.fillRect(0, 500, 600, 50);
//		g2d.setColor(Color.decode("#255F38"));
//		g2d.fillRect(0, 440, 600, 60);
//		g2d.setColor(Color.decode("#18230F"));
//		g2d.fillRect(0, 410, 600, 30);
//		g2d.setColor(Color.decode("#504B38"));//fondo serca
//		g2d.fillRect(0, 365, 600, 30);
//		g2d.fillRect(0, 315, 600, 30);
//		g2d.fillRect(0, 265, 600, 30);
//		g2d.setColor(Color.decode("#F2E2B1"));//sercas
//		g2d.fillRect(0, 240, 40, 170);
//		g2d.fillRect(60, 240, 40, 170);
//		g2d.fillRect(120, 240, 40, 170);
//		g2d.fillRect(180, 240, 40, 170);
//		g2d.fillRect(240, 240, 40, 170);
//		g2d.fillRect(300, 240, 40, 170);
//		g2d.fillRect(360, 240, 40, 170);
//		g2d.fillRect(420, 240, 40, 170);
//		g2d.fillRect(480, 240, 40, 170);
//		g2d.fillRect(540, 240, 40, 170);
//		g2d.setColor(Color.decode("#9AA6B2"));
//		g2d.fillRect(75, 380, 450, 30);//piso
//		g2d.setColor(Color.decode("#FFB22C"));
//		g2d.fillRect(120, 130, 375, 250);//casa
//		g2d.setColor(Color.decode("#854836"));
//		g2d.fillRect(250, 180, 100,200);//puerta
//		g2d.setColor(Color.decode("#000000"));
//		g2d.fillOval(265, 270, 10, 10);//manija
//		g2d.setColor(Color.decode("#854836"));//ventana
//		g2d.fillRect(145, 200, 75,75);
//		g2d.fillRect(385, 200, 75,75);
//		g2d.setColor(Color.decode("#C6E7FF"));//vidrio
//		g2d.fillRect(155, 215, 25,20);
//		g2d.fillRect(185, 215, 25,20);
//		g2d.fillRect(185, 240, 25,20);
//		g2d.fillRect(155, 240, 25,20);
//		g2d.fillRect(395, 215, 25,20);//vidrio2
//		g2d.fillRect(425, 215, 25,20);
//		g2d.fillRect(425, 240, 25,20);
//		g2d.fillRect(395, 240, 25,20);
//		g2d.setColor(Color.decode("#504B38"));//techo
//		g2d.fillRect(75, 130, 450, 40);
//		g2d.setColor(Color.decode("#FFD95F"));
//		g2d.fillOval(-30, 0, 100, 100);

	// aqui inicia el mario 3

//		g2d.setColor(Color.decode("#AF8260"));
//		g2d.fillRect(0, 500, 1300, 100);
//		g2d.setStroke(new BasicStroke(10));
//		g2d.setColor(Color.BLACK);
//		g2d.drawRect(0, 500, 1300, 100);
//		
//		g2d.setStroke(new BasicStroke(7));//cubo azul
//		g2d.setColor(Color.BLACK);
//		g2d.drawRoundRect(450, 165, 230, 330, 30, 30);
//		g2d.fillRoundRect(490, 220, 230, 280, 30, 30);
//		g2d.setColor(Color.decode("#4f2cee"));//color principal
//		g2d.fillRoundRect(450, 165, 230, 330, 30, 30);
//		g2d.setColor(Color.decode("#acacac"));
//		g2d.fillOval(460, 175, 30, 30);
//		g2d.fillOval(645, 175, 30, 30);
//		g2d.setStroke(new BasicStroke(3));
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(460, 175, 30, 30);
//		g2d.drawOval(645, 175, 30, 30);
//		
//		
//		
//		
//		g2d.setStroke(new BasicStroke(7));// cubo rosa
//		g2d.setColor(Color.BLACK);
//		g2d.drawRoundRect(300, 265, 230, 230, 30, 30);
//		g2d.fillRoundRect(320, 300, 250, 200, 30, 30);
//		
//		g2d.setColor(Color.decode("#FFB4A2"));//color principal
//		g2d.fillRoundRect(300, 265, 230, 230, 30, 30);
//		g2d.setColor(Color.decode("#acacac"));
//		g2d.fillOval(310, 460, 30, 30);
//		g2d.fillOval(310, 270, 30, 30);
//		g2d.fillOval(495, 270, 30, 30);
//		g2d.fillOval(495, 460, 30, 30);
//		
//		g2d.setStroke(new BasicStroke(3));
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(310, 460, 30, 30);
//		g2d.drawOval(310, 270, 30, 30);
//		g2d.drawOval(495, 270, 30, 30);
//		g2d.drawOval(495, 460, 30, 30);
//		
//		g2d.setStroke(new BasicStroke(10));// cubo verde
//		g2d.setColor(Color.BLACK);
//		g2d.drawRoundRect(1090, 265, 230, 230, 30, 30);
//		g2d.setColor(Color.decode("#5fb34d"));// color principal
//		g2d.fillRoundRect(1090, 265, 230, 230, 30, 30);
//		
//		g2d.setColor(Color.decode("#acacac"));
//		g2d.fillOval(1100, 270, 30, 30);
//		g2d.fillOval(1100, 460, 30, 30);
//		g2d.setStroke(new BasicStroke(3));
//		g2d.setColor(Color.BLACK);
//		g2d.drawOval(1100, 270, 30, 30);
//		g2d.drawOval(1100, 460, 30, 30);
//		
//	
//		g2d.setColor(Color.BLACK);//cuadro chico
//		g2d.drawRect(75, 190, 75, 75);
//		g2d.fillRect(65, 180, 87, 87);
//		g2d.fillRect(1150, 75, 87, 87);
//		g2d.drawRect(1150, 75, 87, 87);
//		
//		g2d.setStroke(new BasicStroke(3));
//		g2d.drawRect(310, 50, 75, 75);
//		g2d.fillRect(300, 45, 90, 90);
//		g2d.drawRect(225, 50, 75, 75);
//		g2d.fillRect(215, 45, 90, 90);
//		
//		g2d.fillRect(1144, 70, 100, 100);
//		g2d.drawRect(1150, 75, 87, 87);
//		
//		
//		
//		g2d.setColor(Color.decode("#FFAB5B"));//color principal
//		g2d.fillRect(75, 190, 75, 75);
//		
//		g2d.fillRect(310, 50, 75, 75);
//		g2d.fillRect(225, 50, 75, 75);
//		
//		g2d.fillRect(1150, 75, 87, 87);
//		
//		g2d.setColor(Color.BLACK);//puntitos cuadritos
//		g2d.fillOval(315, 55, 10, 10);
//		g2d.fillOval(370, 55, 10, 10);
//		g2d.fillOval(370, 110, 10, 10);
//		g2d.fillOval(315, 110, 10, 10);
//		
//		g2d.fillOval(230, 55, 10, 10);
//		g2d.fillOval(285, 55, 10, 10);
//		g2d.fillOval(285, 110, 10, 10);
//		g2d.fillOval(230, 110, 10, 10);
//		
//		g2d.fillOval(80, 195, 10, 10);
//		g2d.fillOval(135, 195, 10, 10);
//		g2d.fillOval(135, 250, 10, 10);
//		g2d.fillOval(80, 250, 10, 10);
//		
//		g2d.fillOval(1155, 80, 10, 10);
//		g2d.fillOval(1225, 80, 10, 10);
//		g2d.fillOval(1225, 145, 10, 10);
//		g2d.fillOval(1155, 145, 10, 10);
//		
//		try {
//			BufferedImage image = ImageIO.read(new File("Imagenes/mario.png"));
//			g2d.drawImage(image, 650, 355, null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	// super mario

//		g2d.setColor(Color.BLACK);//fondo cuadritos
//		g2d.setStroke(new BasicStroke(10));
//		g2d.drawRect(0, 500, 1300, 100);
//		
//		g2d.setColor(Color.decode("#AF8260"));
//		g2d.fillRect(0, 500, 1300, 100);
//		
//		g2d.setColor(Color.WHITE);//nubes
//		g2d.fillRoundRect(40, 70, 140, 30, 50, 50);
//		g2d.fillRoundRect(40, 110, 190, 30, 50, 50);
//		g2d.fillRoundRect(300, 50, 190, 30, 50, 50);
//		g2d.fillRoundRect(230, 200, 100, 30, 50, 50);
//		g2d.fillRoundRect(180, 300, 100, 30, 50, 50);
//		g2d.fillRoundRect(600, 150, 100, 30, 50, 50);
//		g2d.fillRoundRect(600, 100, 150, 30, 50, 50);
//		g2d.fillOval(100, 80, 10, 10);
//		
//		g2d.setColor(Color.decode("#A9B5DF"));//color principal
//		g2d.fillRect(75, 225, 150, 270);
//		g2d.fillOval(75, 170, 150, 110);
//		
//		
//		
//		g2d.setColor(Color.decode("#2D336B"));
//		g2d.fillRect(-50, 396, 200, 100);
//		g2d.fillOval(-50, 345, 200, 100);
//		
//		g2d.setColor(Color.decode("#A9B5DF"));//color principal
//		g2d.fillRect(300, 225, 150, 270);
//		g2d.fillOval(300, 170, 150, 110);
//		
//		g2d.fillRect(450, 145, 150, 350);
//		g2d.fillOval(450, 95, 150, 110);
//		
//		g2d.setColor(Color.WHITE);
//		g2d.fillRoundRect(350, 250, 300, 30, 50, 50);
//		g2d.fillRoundRect(550, 200, 200, 30, 50, 50);
//		
//		g2d.setColor(Color.decode("#2D336B"));
//		g2d.fillRect(300, 396, 175, 100);
//		g2d.fillOval(300, 345, 175, 100);
//		
//		g2d.fillRect(475, 250, 200, 246);
//		g2d.fillOval(475, 200, 200, 100);
//		
//		g2d.setColor(Color.BLACK);//fondo cuadritos
//		g2d.setStroke(new BasicStroke(7));
//		g2d.drawRect(600, 445, 50, 50);
//		g2d.drawRect(600, 390, 50, 50);
//		g2d.drawRect(600, 335, 50, 50);
//		g2d.drawRect(600, 280, 50, 50);
//		g2d.drawRect(654, 280, 50, 50);//cuadro amarillo
//		g2d.drawRect(707, 280, 50, 50);
//		g2d.drawRect(760, 280, 50, 50);
//		g2d.drawRect(700, 415, 140, 80);//tubo rosa
//		g2d.fillRect(690, 414, 140, 85);
//		g2d.drawRect(680, 350, 160, 62);
//
//		g2d.drawRect(300, 370, 130, 125);
//		g2d.fillRect(310, 370, 130, 130);
//		g2d.drawRoundRect(285, 300, 160, 65, 20, 20);
//		g2d.fillRoundRect(295, 300, 160, 75, 20, 20);
//		
//		
//		g2d.setColor(Color.decode("#9AA6B2"));//cuadritos
//		g2d.fillRect(600, 445, 50, 50);
//		g2d.fillRect(600, 390, 50, 50);
//		g2d.fillRect(600, 335, 50, 50);
//		g2d.fillRect(600, 280, 50, 50);
//		
//		g2d.setColor(Color.decode("#F6DC43"));//cuadros amarillos
//		g2d.fillRect(654, 280, 50, 50);
//		g2d.fillRect(707, 280, 50, 50);
//		g2d.fillRect(760, 280, 50, 50);
//		
//		g2d.setColor(Color.decode("#AA60C8"));//tubo
//		g2d.fillRect(700, 415, 140, 80);
//		g2d.fillRect(680, 350, 160, 62);
//		g2d.fillRect(300, 370, 130, 125);//tubo medio
//		g2d.fillRoundRect(285, 300, 160, 65, 20, 20);
//		g2d.setColor(Color.decode("#FFDFEF"));
//		g2d.fillRect(725, 415, 20, 80);
//		g2d.fillRect(710, 350, 20, 62);
//		g2d.fillRect(695, 350, 100, 5);
//		g2d.fillRect(315, 375, 20, 120);//tubo medio
//		g2d.fillRect(300, 300, 20, 65);
//		g2d.fillRoundRect(290, 300, 100, 5, 5, 5);
//		
//		g2d.setColor(Color.decode("#4B164C"));
//		g2d.fillRect(410, 375, 20, 120);
//		g2d.fillRoundRect(425, 300, 20, 65, 5, 5);
//		
//		
//		g2d.setColor(Color.decode("#D69ADE"));
//		g2d.fillRect(695, 415, 10, 80);
//		g2d.fillRect(680, 355, 10, 57);
//		g2d.setColor(Color.BLACK);
//		g2d.fillRoundRect(290, 365, 145, 10, 10, 10);
//		
//		try {
//			BufferedImage image = ImageIO.read(new File("Imagenes/mario.png"));
//			g2d.drawImage(image, 180, 355, null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			BufferedImage image = ImageIO.read(new File("Imagenes/planta3.png"));
//			g2d.drawImage(image, 260, 180, null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		g2d.setColor(Color.WHITE);
//		g2d.fillOval(100, 200, 20, 35);
//		g2d.fillOval(180, 300, 20, 35);
//		g2d.fillOval(150, 230, 20, 35);
//		g2d.fillOval(320, 230, 20, 35);
//		g2d.fillOval(0, 400, 30, 60);
//		g2d.fillOval(500, 250, 30, 60);
//		g2d.fillOval(470, 130, 20, 35);
//		g2d.fillRoundRect(-50, 200, 100, 30, 50, 50);
//		g2d.fillRoundRect(0, 300, 150, 30, 50, 50);

	// }

}
