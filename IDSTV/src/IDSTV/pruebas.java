package IDSTV;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.awt.event.ActionEvent;

public class pruebas {

	private JFrame frame;
	public int cartas[] = {1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8};
	public int c1 = -1,c2 = -1;
	public ArrayList<JButton> cartas2 = new ArrayList<JButton>();
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pruebas window = new pruebas();

                    ArrayList<Integer> listaCartas = new ArrayList<>();
                    for (int carta : window.cartas) {
                        listaCartas.add(carta);
                    }

                    Collections.shuffle(listaCartas);

                    for (int i = 0; i < window.cartas.length; i++) {
                        window.cartas[i] = listaCartas.get(i);
                    }

                    //System.out.println("Cartas mezcladas: " + Arrays.toString(window.cartas));
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
		panel.setBackground(Color.decode("#5080C5"));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));

		JLabel lblNewLabel = new JLabel("Memorama");
		lblNewLabel.setBorder(BorderFactory.createMatteBorder(0,0,0, 0, Color.decode("#5080C5")));
		lblNewLabel.setBackground(Color.decode("#f2f709"));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setFont(new Font("Unispace", Font.PLAIN, 35));
		panel.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(BorderFactory.createMatteBorder(25, 25, 25, 50, Color.decode("#5080C5")));
		panel.add(panel_1, BorderLayout.EAST);
		panel_1.setBackground(Color.decode("#5080C5"));
		panel_1.setLayout(new GridLayout(4, 1, 0, 0));
		
		

		JLabel lblNewLabel_1 = new JLabel("Puntaje");

		lblNewLabel_1.setFont(new Font("Unispace", Font.BOLD, 25));
		panel_1.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");

		lblNewLabel_2.setFont(new Font("Unispace", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("New label");
	
		lblNewLabel_3.setFont(new Font("Unispace", Font.PLAIN, 25));
		panel_1.add(lblNewLabel_3);
		
		JButton btnNewButton_15 = new JButton("Reiniciar");
		
		btnNewButton_15.setBackground(Color.decode("#f2f709"));
		btnNewButton_15.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_15.setFont(new Font("Unispace", Font.PLAIN, 30));
		panel_1.add(btnNewButton_15);

		

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(BorderFactory.createMatteBorder(0, 100, 25, 100, Color.decode("#5080C5")));
		panel.add(panel_3, BorderLayout.CENTER);
		panel_3.setBackground(Color.decode("#5080C5"));
		panel_3.setLayout(new GridLayout(4, 4, 5, 5));

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_1.setIcon(new ImageIcon("Imagenes/Perro"+cartas[0]+".png"));
				
				
				cartas2.add(btnNewButton_1);
				
				if(c1 == -1) {
					c1 = cartas[0];
				}else
					if(c2 == -1) {
						c2 = cartas[0];
					}
			}
		}); 
		btnNewButton_1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_1.setBackground(Color.decode("#f2f709"));
		ImageIcon portada4 = new ImageIcon("Imagenes/invencible.png");
		Image portada5 = portada4.getImage();
		Image portada6 = portada5.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_1.setIcon(new ImageIcon(portada6));
		panel_3.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_2.setIcon(new ImageIcon("Imagenes/Perro"+cartas[1]+".png"));
				
			}
		});
		btnNewButton_2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_2.setBackground(Color.decode("#f2f709"));
		ImageIcon j1 = new ImageIcon("Imagenes/invencible.png");
		Image j2 = j1.getImage();
		Image j3 = j2.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_2.setIcon(new ImageIcon(j3));
		panel_3.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_3.setIcon(new ImageIcon("Imagenes/Perro"+cartas[2]+".png"));
			}
		});
		btnNewButton_3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_3.setBackground(Color.decode("#f2f709"));
		ImageIcon j4 = new ImageIcon("Imagenes/invencible.png");
		Image j5 = j4.getImage();
		Image j6 = j5.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_3.setIcon(new ImageIcon(j6));
		panel_3.add(btnNewButton_3);

		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setIcon(new ImageIcon("Imagenes/Perro"+cartas[3]+".png"));
			}
		});
		btnNewButton.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton.setBackground(Color.decode("#f2f709"));
		ImageIcon j7 = new ImageIcon("Imagenes/invencible.png");
		Image j8 = j7.getImage();
		Image j9 = j8.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton.setIcon(new ImageIcon(j9));
		panel_3.add(btnNewButton);

		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_4.setIcon(new ImageIcon("Imagenes/Perro"+cartas[4]+".png"));
			}
		});
		btnNewButton_4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_4.setBackground(Color.decode("#f2f709"));
		ImageIcon j10 = new ImageIcon("Imagenes/invencible.png");
		Image j11 = j10.getImage();
		Image j12 = j11.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_4.setIcon(new ImageIcon(j12));
		panel_3.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_5.setIcon(new ImageIcon("Imagenes/Perro"+cartas[5]+".png"));
			}
		});
		btnNewButton_5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_5.setBackground(Color.decode("#f2f709"));
		ImageIcon j13 = new ImageIcon("Imagenes/invencible.png");
		Image j14 = j13.getImage();
		Image j15 = j14.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_5.setIcon(new ImageIcon(j15));
		panel_3.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_6.setIcon(new ImageIcon("Imagenes/Perro"+cartas[6]+".png"));
			}
		});
		btnNewButton_6.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_6.setBackground(Color.decode("#f2f709"));
		ImageIcon j16 = new ImageIcon("Imagenes/invencible.png");
		Image j17 = j16.getImage();
		Image j18 = j17.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_6.setIcon(new ImageIcon(j18));
		panel_3.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_7.setIcon(new ImageIcon("Imagenes/Perro"+cartas[7]+".png"));
			}
		});
		btnNewButton_7.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_7.setBackground(Color.decode("#f2f709"));
		ImageIcon a = new ImageIcon("Imagenes/invencible.png");
		Image b = a.getImage();
		Image c = b.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_7.setIcon(new ImageIcon(c));
		panel_3.add(btnNewButton_7);

		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				button.setIcon(new ImageIcon("Imagenes/Perro"+cartas[8]+".png"));
			}
		});
		button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		button.setBackground(Color.decode("#f2f709"));
		ImageIcon d = new ImageIcon("Imagenes/invencible.png");
		Image f = d.getImage();
		Image g = f.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		button.setIcon(new ImageIcon(g));
		panel_3.add(button);

		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_8.setIcon(new ImageIcon("Imagenes/Perro"+cartas[9]+".png"));
			}
		});
		btnNewButton_8.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_8.setBackground(Color.decode("#f2f709"));
		ImageIcon j = new ImageIcon("Imagenes/invencible.png");
		Image h = j.getImage();
		Image i = h.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_8.setIcon(new ImageIcon(i));
		panel_3.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_9.setIcon(new ImageIcon("Imagenes/Perro"+cartas[10]+".png"));
			}
		});
		btnNewButton_9.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_9.setBackground(Color.decode("#f2f709"));
		ImageIcon k = new ImageIcon("Imagenes/invencible.png");
		Image l = k.getImage();
		Image m = l.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_9.setIcon(new ImageIcon(m));
		panel_3.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_10.setIcon(new ImageIcon("Imagenes/Perro"+cartas[11]+".png"));
			}
		});
		btnNewButton_10.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_10.setBackground(Color.decode("#f2f709"));
		ImageIcon ñ = new ImageIcon("Imagenes/invencible.png");
		Image o = ñ.getImage();
		Image p = o.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_10.setIcon(new ImageIcon(p));
		panel_3.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_11.setIcon(new ImageIcon("Imagenes/Perro"+cartas[12]+".png"));
			}
		});
		btnNewButton_11.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_11.setBackground(Color.decode("#f2f709"));
		ImageIcon j19 = new ImageIcon("Imagenes/invencible.png");
		Image j20 = j19.getImage();
		Image j21 = j20.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_11.setIcon(new ImageIcon(j21));
		panel_3.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_12.setIcon(new ImageIcon("Imagenes/Perro"+cartas[13]+".png"));
			}
		});
		btnNewButton_12.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_12.setBackground(Color.decode("#f2f709"));
		ImageIcon j22 = new ImageIcon("Imagenes/invencible.png");
		Image j23 = j16.getImage();
		Image j24 = j17.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_12.setIcon(new ImageIcon(j18));
		panel_3.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_13.setIcon(new ImageIcon("Imagenes/Perro"+cartas[14]+".png"));
			}
		});
		btnNewButton_13.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_13.setBackground(Color.decode("#f2f709"));
		ImageIcon j25 = new ImageIcon("Imagenes/invencible.png");
		Image j26 = j25.getImage();
		Image j27= j26.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_13.setIcon(new ImageIcon(j27));
		panel_3.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton_14.setIcon(new ImageIcon("Imagenes/Perro"+cartas[15]+".png"));
			}
		});
		btnNewButton_14.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
		btnNewButton_14.setBackground(Color.decode("#f2f709"));
		ImageIcon j28 = new ImageIcon("Imagenes/invencible.png");
		Image j29 = j28.getImage();
		Image j30 = j29.getScaledInstance(150, 100, Image.SCALE_SMOOTH);
		btnNewButton_14.setIcon(new ImageIcon(j30));
		panel_3.add(btnNewButton_14);
	}
}
