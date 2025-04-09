package IDSTV;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel Tablero;
	private int x = 200, y = 100;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pacman window = new Pacman();
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
	public Pacman() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x=200;
				y=100;
				Tablero.repaint();
				Tablero.requestFocus();
				
				
			}
		});
		panel_1.add(btnNewButton);

		Tablero = new DrawingPanel();
		Tablero.setBackground(Color.decode("#222222"));
		frame.getContentPane().add(Tablero, BorderLayout.CENTER);

		Tablero.addKeyListener(this);
		Tablero.setFocusable(true);

	}

	class DrawingPanel extends JPanel {
		public DrawingPanel() {
			// setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			// Configuración del dibujo
			g2d.setColor(Color.YELLOW);
			g2d.fillOval(x, y, 35, 35);

		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(x);
		if (e.getKeyCode() == 87) {
			y -= 5;
			if(y <= -35) { 
	            y = Tablero.getHeight(); 
	        }

		}
		if (e.getKeyCode() == 83) {
			y += 5;
			if(y>= Tablero.getHeight()) {
				 y = -35;
			}
		}
		if (e.getKeyCode() == 65) {
			x -= 5;
			if(x<=-25) {
				x=Tablero.getWidth();
			}
		}
		if (e.getKeyCode() == 68) {
			x += 5;
			if(x >= Tablero.getWidth()) {
	            x = -35;
	        }

		}
		Tablero.repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
