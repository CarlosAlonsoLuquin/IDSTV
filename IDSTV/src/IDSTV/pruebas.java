package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class pruebas {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebas window = new pruebas();
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
	public pruebas() {
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
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Memorama");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel lblNewLabel_1 = new JLabel("Puntaje");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		panel_1.add(lblNewLabel_3);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.SOUTH);
		
		JButton btnNewButton_15 = new JButton("New button");
		panel_2.add(btnNewButton_15);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(new GridLayout(4, 4, 0, 0));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("Imagenes/Perro1.png"));
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		panel_3.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("Imagenes/Perro2.png"));
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon("Imagenes/Perro3.png"));
		panel_3.add(btnNewButton_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("Imagenes/Perro4.png"));
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setIcon(new ImageIcon("Imagenes/Perro5.png"));
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button");
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button");
		panel_3.add(btnNewButton_7);
		
		JButton button = new JButton("New button");
		panel_3.add(button);
		
		JButton btnNewButton_8 = new JButton("New button");
		panel_3.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button");
		panel_3.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("New button");
		panel_3.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("New button");
		panel_3.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("New button");
		panel_3.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("New button");
		panel_3.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("New button");
		panel_3.add(btnNewButton_14);
	}
}
