package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Teclado {
	
	 String[] letras = {
	            "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P",
	            "A", "S", "D", "F", "G", "H", "J", "K", "L", "Ñ",
	            "Z", "X", "C", "V", "B", "N", "M", "Borrar", " ", "Espacio"};

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Teclado window = new Teclado();
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
	public Teclado() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1116, 535);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		//lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 0, 0));
		
//		JLabel lblNewLabel_3 = new JLabel("Q");
//		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
//		panel_2.add(lblNewLabel_3);
//		
//		JLabel lblNewLabel_4 = new JLabel("W");
//		panel_2.add(lblNewLabel_4);
//		
//		JLabel lblNewLabel_5 = new JLabel("E");
//		panel_2.add(lblNewLabel_5);
//		
//		JLabel lblNewLabel_6 = new JLabel("R");
//		panel_2.add(lblNewLabel_6);
//		
//		JLabel lblNewLabel_7 = new JLabel("T");
//		panel_2.add(lblNewLabel_7);
//		
//		JLabel lblNewLabel_8 = new JLabel("Y");
//		panel_2.add(lblNewLabel_8);
//		
//		JLabel lblO = new JLabel("U");
//		panel_2.add(lblO);
//		
//		JLabel lblNewLabel_9 = new JLabel("I");
//		panel_2.add(lblNewLabel_9);
//		
//		JLabel lblNewLabel_10 = new JLabel("O");
//		panel_2.add(lblNewLabel_10);
//		
//		JLabel lblNewLabel_11 = new JLabel("P");
//		panel_2.add(lblNewLabel_11);
//		
//		JLabel lblNewLabel_12 = new JLabel("A");
//		panel_2.add(lblNewLabel_12);
//		
//		JLabel lblNewLabel_13 = new JLabel("S");
//		panel_2.add(lblNewLabel_13);
//		
//		JLabel lblNewLabel_14 = new JLabel("D");
//		panel_2.add(lblNewLabel_14);
//		
//		JLabel lblNewLabel_20 = new JLabel("F");
//		panel_2.add(lblNewLabel_20);
//		
//		JLabel lblNewLabel_15 = new JLabel("G");
//		panel_2.add(lblNewLabel_15);
//		
//		JLabel lblNewLabel_23 = new JLabel("H");
//		panel_2.add(lblNewLabel_23);
//		
//		JLabel lblNewLabel_16 = new JLabel("J");
//		panel_2.add(lblNewLabel_16);
//		
//		JLabel lblNewLabel_26 = new JLabel("K");
//		panel_2.add(lblNewLabel_26);
//		
//		JLabel lblNewLabel_24 = new JLabel("L");
//		panel_2.add(lblNewLabel_24);
//		
//		JLabel lblNewLabel_17 = new JLabel("Z");
//		panel_2.add(lblNewLabel_17);
//		
//		JLabel lblNewLabel_18 = new JLabel("X");
//		panel_2.add(lblNewLabel_18);
//		
//		JLabel lblNewLabel_19 = new JLabel("C");
//		panel_2.add(lblNewLabel_19);
//		
//		JLabel lblNewLabel_21 = new JLabel("V");
//		panel_2.add(lblNewLabel_21);
//		
//		JLabel lblNewLabel_22 = new JLabel("B");
//		panel_2.add(lblNewLabel_22);
//		
//		JLabel lblNewLabel_25 = new JLabel("N");
//		panel_2.add(lblNewLabel_25);
//		
//		JLabel lblNewLabel_27 = new JLabel("M");
//		panel_2.add(lblNewLabel_27);
	}

}
