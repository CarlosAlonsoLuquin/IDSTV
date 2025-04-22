package IDSTV;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pacman implements KeyListener {

	private JFrame frame;
	private DrawingPanel tablero;

	private player pacman;
	private List<player> paredes = new ArrayList<>();
	Timer timer;
	private int lastPress = 0;

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
		frame.setBounds(100, 100, 460, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		pacman = new player(210, 330, 20, 20, Color.yellow);
		
		 // Bordes exteriores 
	    paredes.add(new player(0, 0, 180, 30, Color.BLUE));
	    paredes.add(new player(270, 0, 180, 30, Color.BLUE)); 
	    
	    paredes.add(new player(0, 520, 180, 30, Color.BLUE)); 
	    paredes.add(new player(270, 520, 180, 30, Color.BLUE));
	    
	    // Paredes laterales 
	    paredes.add(new player(0, 30, 30, 200, Color.BLUE)); 
	    paredes.add(new player(0, 280, 30, 240, Color.BLUE)); 
	    
	    paredes.add(new player(420, 30, 30, 200, Color.BLUE));
	    paredes.add(new player(420, 280, 30, 240, Color.BLUE)); 
	    
	    // Área central 
	    paredes.add(new player(180, 180, 90, 90, Color.BLUE));
	    
	    // Pasillos superiores
	    paredes.add(new player(60, 60, 90, 30, Color.BLUE));
	    paredes.add(new player(180, 60, 90, 30, Color.BLUE));
	    paredes.add(new player(300, 60, 90, 30, Color.BLUE));
	    
	    // Pasillos inferiores
	    paredes.add(new player(60, 460, 90, 30, Color.BLUE));
	    paredes.add(new player(180, 460, 90, 30, Color.BLUE));
	    paredes.add(new player(300, 460, 90, 30, Color.BLUE));
	    
	    // Columnas verticales
	    paredes.add(new player(60, 80, 30, 90, Color.BLUE));
	    paredes.add(new player(60, 210, 30, 90, Color.BLUE));
	    paredes.add(new player(60, 340, 30, 90, Color.BLUE));
	    
	    paredes.add(new player(360, 80, 30, 90, Color.BLUE));
	    paredes.add(new player(360, 210, 30, 90, Color.BLUE));
	    paredes.add(new player(360, 340, 30, 90, Color.BLUE));
	    
	    paredes.add(new player(150, 120, 60, 30, Color.BLUE));
	    paredes.add(new player(150, 120, 30, 60, Color.BLUE));
	    
	    paredes.add(new player(240, 120, 60, 30, Color.BLUE));
	    paredes.add(new player(270, 120, 30, 60, Color.BLUE));
	    
	    paredes.add(new player(150, 390, 60, 30, Color.BLUE));
	    paredes.add(new player(150, 360, 30, 60, Color.BLUE));
	    
	    paredes.add(new player(240, 390, 60, 30, Color.BLUE));
	    paredes.add(new player(270, 360, 30, 60, Color.BLUE));

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);

		JPanel footer = new JPanel();
		footer.setBackground(new Color(109, 89, 213));
		frame.getContentPane().add(footer, BorderLayout.SOUTH);

		tablero = new DrawingPanel();
		tablero.setBackground(new Color(0, 0, 0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);

		tablero.addKeyListener(this);
		tablero.setFocusable(true);

		JButton reiniciar = new JButton("Reiniciar");
		reiniciar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pacman.x = 210;
				pacman.y = 330;

				tablero.repaint();

				tablero.requestFocus();
			}

		});
		footer.add(reiniciar);

		ActionListener taskPerformer = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
			}
		};
		timer = new Timer(10, taskPerformer);

	}

	class DrawingPanel extends JPanel {
		public DrawingPanel() {
			setBackground(Color.WHITE);
		}

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;

			g2d.setColor(pacman.c);
			g2d.fillOval(pacman.x, pacman.y, pacman.w, pacman.h);

			for (player pared : paredes) {
				g2d.setColor(pared.c);
				g2d.fillRect(pared.x, pared.y, pared.w, pared.h);

			}

		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		lastPress = e.getKeyCode();
		timer.start();
		update();

	}

	public void update() {
		Boolean colision = false;

		for (player pared : paredes) {

			if (pacman.colision(pared)) {
				colision = true;
				break;
			}

		}

		if (lastPress == 87) { // Tecla W (arriba)
			if (!colision) {
				pacman.y -= 2;
				// Si sale por arriba, aparece abajo
				if (pacman.y + pacman.h < 0) {
					pacman.y = tablero.getHeight();
				}
			} else {
				pacman.y += 2;
				lastPress = 0;
			}
		}
		if (lastPress == 83) { // Tecla S (abajo)
			if (!colision) {
				pacman.y += 2;
				// Si sale por abajo, aparece arriba
				if (pacman.y > tablero.getHeight()) {
					pacman.y = -pacman.h;
				}
			} else {
				pacman.y -= 2;
				lastPress = 0;
			}
		}
		if (lastPress == 65) { // Tecla A (izquierda)
			if (!colision) {
				pacman.x -= 2;
				// Si sale por la izquierda, aparece derecha
				if (pacman.x + pacman.w < 0) {
					pacman.x = tablero.getWidth();
				}
			} else {
				pacman.x += 2;
				lastPress = 0;
			}
		}
		if (lastPress == 68) { // Tecla D (derecha)
			if (!colision) {
				pacman.x += 2;
				// Si sale por la derecha, aparece izquierda
				if (pacman.x > tablero.getWidth()) {
					pacman.x = -pacman.w;
				}
			} else {
				pacman.x -= 2;
				lastPress = 0;
			}
		}
		tablero.repaint();

	}

	class player {
		int x, y, w, h;
		Color c;

		public player(int x, int y, int w, int h, Color c) {
			this.x = x;
			this.y = y;
			this.w = w;
			this.h = h;
			this.c = c;

		}

		public boolean colision(player target) {
			if (this.x < target.x + target.w &&

					this.x + this.w > target.x &&

					this.y < target.y + target.h &&

					this.y + this.h > target.y) {

				return true;
			}
			return false;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}
