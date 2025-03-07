package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;
import java.awt.GridBagLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JTable;
import javax.swing.JButton;

public class ventana2 {

	private JFrame frame;
	private JTextField txtCarlosAlonso;
	private JTextField txtLuquin;
	private JTextField txtLopez;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana2 window = new ventana2();
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
	public ventana2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 64));
		panel.setBorder(new LineBorder(new Color(0, 255, 64),20));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 64));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(128, 255, 255));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Datos Generales");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 18));
		panel_2.add(lblNewLabel_1, BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(4, 4, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Nombres: ");
		lblNewLabel_2.setBorder(BorderFactory.createMatteBorder(15, 90, 15, 80, new Color(128, 255, 255)));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		panel_6.add(lblNewLabel_2);
		
		txtCarlosAlonso = new JTextField();
		txtCarlosAlonso.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCarlosAlonso.setText("Carlos Alonso");
		txtCarlosAlonso.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		panel_6.add(txtCarlosAlonso);
		txtCarlosAlonso.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido Paterno:");
		lblNewLabel_3.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_3.setBorder(BorderFactory.createMatteBorder(15, 85, 15, 50, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_3);
		
		txtLuquin = new JTextField();
		txtLuquin.setFont(new Font("Arial", Font.PLAIN, 12));
		txtLuquin.setText("Luquin");
		txtLuquin.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		panel_6.add(txtLuquin);
		txtLuquin.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Materno:");
		lblNewLabel_4.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel_4.setBorder(BorderFactory.createMatteBorder(15, 85, 15, 50, new Color(128, 255, 255)));
		panel_6.add(lblNewLabel_4);
		
		txtLopez = new JTextField();
		txtLopez.setFont(new Font("Arial", Font.PLAIN, 12));
		txtLopez.setText("Lopez");
		txtLopez.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		panel_6.add(txtLopez);
		txtLopez.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Fecha de Nacimiento: ");
		lblNewLabel_5.setBorder(BorderFactory.createMatteBorder(15, 85, 15, 1, new Color(128, 255, 255)));
		lblNewLabel_5.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_6.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setText("29/07/2000");
		textField_3.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		panel_6.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(128, 255, 255));
		panel_2.add(panel_7, BorderLayout.SOUTH);
		panel_7.setLayout(new GridLayout(2, 2, 3, 3));
		
		JLabel lblNewLabel_6 = new JLabel("Sexo:");
		lblNewLabel_6.setBorder(BorderFactory.createMatteBorder(15, 90, 15, 80, new Color(128, 255, 255)));
		lblNewLabel_6.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(lblNewLabel_6);
		
		String[] Sex = { "Hombre", "Mujer", "No especifico" };
		JComboBox comboBox = new JComboBox(Sex);
		comboBox.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		panel_7.add(comboBox);
		
		JLabel lblNewLabel_7 = new JLabel("Nacionalidad");
		lblNewLabel_7.setBorder(BorderFactory.createMatteBorder(15, 90, 15, 80, new Color(128, 255, 255)));
		lblNewLabel_7.setFont(new Font("Arial", Font.PLAIN, 12));
		panel_7.add(lblNewLabel_7);
		
		String[] Naci = { "Mexico", "España", "Estados Unidos", "Peru" };
		JComboBox comboBox_1 = new JComboBox(Naci);
		comboBox_1.setBorder(BorderFactory.createMatteBorder(15, 1, 15, 170, new Color(128, 255, 255)));
		comboBox_1.setBackground(new Color(255, 255, 255));
		panel_7.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 128, 128));
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 128, 128));
		panel_8.setBounds(0, 22, 542, 276);
		panel_3.add(panel_8);
		panel_8.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\LUQUIN\\Downloads\\perfil.png"));
		lblNewLabel.setBounds(42, 28, 194, 186);
		panel_8.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto De Perfil");
		chckbxNewCheckBox.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox.setBounds(279, 40, 225, 44);
		panel_8.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha De Nacimiento");
		chckbxNewCheckBox_1.setBackground(new Color(255, 128, 128));
		chckbxNewCheckBox_1.setFont(new Font("Arial", Font.PLAIN, 18));
		chckbxNewCheckBox_1.setBounds(267, 146, 269, 44);
		panel_8.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_8 = new JLabel("Perfil de Usuario");
		lblNewLabel_8.setBounds(0, 0, 186, 25);
		panel_3.add(lblNewLabel_8);
		lblNewLabel_8.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 128, 192));
		panel_1.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Datos Opcionales");
		lblNewLabel_10.setFont(new Font("Arial", Font.PLAIN, 20));
		
		lblNewLabel_10.setBounds(0, 0, 195, 34);
		panel_4.add(lblNewLabel_10);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 128, 192));
		panel_9.setBounds(0, 28, 542, 271);
		panel_4.add(panel_9);
		panel_9.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Descripcion");
		lblNewLabel_11.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(87, 10, 96, 30);
		panel_9.add(lblNewLabel_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(74, 49, 159, 152);
		panel_9.add(scrollPane);
		
		JTextArea txtrHolaAmigosDe = new JTextArea(10,30);
		scrollPane.setViewportView(txtrHolaAmigosDe);
		txtrHolaAmigosDe.setText("hola amigos de Youtube mi nombre es carlos alonso luquin lopez");
		
		JLabel lblNewLabel_12 = new JLabel("Preferencias");
		lblNewLabel_12.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(341, 10, 113, 30);
		panel_9.add(lblNewLabel_12);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(309, 49, 150, 152);
		panel_9.add(scrollPane_1);
		
		JTextArea txtrMusicaJugarSalir = new JTextArea();
		txtrMusicaJugarSalir.setFont(new Font("Arial", Font.PLAIN, 15));
		txtrMusicaJugarSalir.setText("musica\r\njugar\r\nsalir con amigos\r\nhablar en discord\r\ndivertime\r\nprogramar\r\naprender\r\ncarlos\r\nalonso\r\nluquin \r\nlopez\r\n");
		scrollPane_1.setViewportView(txtrMusicaJugarSalir);
		
		
		
		
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 255, 255));
		panel_1.add(panel_5);
		panel_5.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton.setBounds(176, 46, 168, 49);
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_1.setBounds(175, 118, 168, 49);
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setFont(new Font("Arial", Font.PLAIN, 25));
		btnNewButton_2.setBounds(176, 191, 168, 49);
		panel_5.add(btnNewButton_2);
		
		JLabel lblNewLabel_9 = new JLabel("Registro De Usuario");
		lblNewLabel_9.setForeground(new Color(255, 0, 0));
		lblNewLabel_9.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.add(lblNewLabel_9, BorderLayout.NORTH);
		frame.setBounds(100, 100, 1001, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
