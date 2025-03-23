package ExamenU2;

import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class U2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					U2 window = new U2();
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
	public U2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 717);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel BG = new JPanel();
		BG.setBounds(0, 0, 543, 680);
		frame.getContentPane().add(BG);
		BG.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 153));
		panel.setBounds(0, 0, 543, 85);
		BG.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 10, 523, 65);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		panel_1.setBounds(42, 117, 456, 85);
		BG.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setBounds(10, 10, 69, 13);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Direccion:");
		lblNewLabel_2_1.setBounds(10, 52, 69, 13);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Nombres:");
		lblNewLabel_2_2.setBounds(222, 10, 69, 13);
		panel_1.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("Telefono:");
		lblNewLabel_2_3.setBounds(222, 52, 69, 13);
		panel_1.add(lblNewLabel_2_3);
		
		textField = new JTextField();
		textField.setBounds(89, 7, 123, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(89, 46, 123, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(301, 7, 137, 19);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(301, 49, 137, 19);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del cliente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(42, 95, 129, 23);
		BG.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Datos de Factura");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(42, 212, 129, 23);
		BG.add(lblNewLabel_1_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		panel_2.setBounds(42, 240, 456, 59);
		BG.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Num Factura:");
		lblNewLabel_3.setBounds(10, 20, 83, 13);
		panel_2.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setBounds(90, 17, 128, 19);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Fecha:");
		lblNewLabel_3_1.setBounds(228, 20, 48, 13);
		panel_2.add(lblNewLabel_3_1);
		
		textField_5 = new JTextField();
		textField_5.setText("21/50/21");
		textField_5.setColumns(10);
		textField_5.setBounds(301, 17, 145, 19);
		panel_2.add(textField_5);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
		panel_3.setBounds(42, 309, 456, 142);
		BG.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Ver listado de facturas");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(68, 10, 153, 23);
		panel_3.add(lblNewLabel_1_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 43, 426, 89);
		panel_3.add(scrollPane);
		
		
		table = new JTable();

		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Celear","5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Varlor", "Subtotal"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_4 = new JLabel("Añadir");
		lblNewLabel_4.setBounds(290, 17, 45, 13);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Eliminar");
		lblNewLabel_5.setBounds(382, 17, 51, 13);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("Imagenes/eliminar.png"));
		lblNewLabel_7.setBounds(345, 10, 37, 23);
		panel_3.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon("Imagenes/anadir.png"));
		lblNewLabel_7_1.setBounds(243, 10, 37, 23);
		panel_3.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("");
		lblNewLabel_7_1_1.setIcon(new ImageIcon("Imagenes/lista.png"));
		lblNewLabel_7_1_1.setBounds(20, 10, 37, 23);
		panel_3.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_6 = new JLabel("Subtotal:");
		lblNewLabel_6.setBounds(63, 461, 89, 23);
		BG.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("% Descuento");
		lblNewLabel_6_1.setBounds(63, 494, 89, 23);
		BG.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("IVA 19%:");
		lblNewLabel_6_2.setBounds(63, 527, 89, 23);
		BG.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Total de factura");
		lblNewLabel_6_3.setBounds(63, 560, 89, 23);
		BG.add(lblNewLabel_6_3);
		
		textField_6 = new JTextField();
		textField_6.setBounds(162, 463, 96, 19);
		BG.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 496, 96, 19);
		BG.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(162, 529, 96, 19);
		BG.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(162, 562, 96, 19);
		BG.add(textField_9);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("",true);
		chckbxNewCheckBox.setBounds(264, 495, 21, 21);
		BG.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Valor Descontado");
		lblNewLabel_6_1_1.setBounds(291, 494, 101, 23);
		BG.add(lblNewLabel_6_1_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(402, 496, 83, 19);
		BG.add(textField_10);
		
		JButton btnNewButton = new JButton("Finalizar Factura");
		btnNewButton.setBounds(264, 649, 128, 21);
		BG.add(btnNewButton);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setBounds(413, 649, 85, 21);
		BG.add(btnLimpiar);
	}
}
