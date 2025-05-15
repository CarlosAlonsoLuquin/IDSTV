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
import javax.swing.DefaultComboBoxModel;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana2 {

	private JFrame frame;
	private JTextField txtCarlosAlonso;
	private JTextField txtLuquin;
	private JTextField txtLopez;
	private JTextField textField_3;
	private JTextField textField;

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

		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(50, 298, 112, 35);
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2_1_1 = new JLabel("Nombre Completo");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(50, 56, 145, 43);
		panel_1.add(lblNewLabel_2_1_1);

		JTextField textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(50, 109, 374, 19);
		panel_1.add(textField_2);

		JLabel lblNewLabel_1_1 = new JLabel("Datos Personales");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 10, 145, 43);
		panel_1.add(lblNewLabel_1_1);

		JTextField textField_3 = new JTextField();
		textField_3.setBounds(50, 343, 374, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblNewLabel_1_2_2 = new JLabel("Confirmar Contraseña");
		lblNewLabel_1_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBounds(50, 372, 145, 35);
		panel_1.add(lblNewLabel_1_2_2);

		JTextField textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(50, 417, 374, 19);
		panel_1.add(textField_5);

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

		JButton btnNewButton = new JButton("Registrarse");
		btnNewButton.setBackground(Color.decode("#789090"));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(296, 376, 111, 50);
		panel_2.add(btnNewButton);

		JLabel lblNewLabel_3 = new JLabel("Empresa");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 61, 79, 38);
		panel_2.add(lblNewLabel_3);

		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 109, 374, 19);
		panel_2.add(textField);

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

		JTextField textField_6 = new JTextField();
		textField_6.setBounds(50, 269, 374, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);

		JLabel lblNewLabel_2_2_1 = new JLabel("Numero de Telefono");
		lblNewLabel_2_2_1.setBounds(269, 138, 137, 43);
		panel_1.add(lblNewLabel_2_2_1);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JTextField textField_7 = new JTextField();
		textField_7.setBounds(269, 191, 133, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
	}
}
