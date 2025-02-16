package IDSTV;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame {

	public ventana() {
		this.setTitle("Hola");
		this.setVisible(true);
		this.setSize(500,500);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true);
		
		this.add(this.login());
		this.repaint();
	}
	//trabajo 9 apartir de aqui
		public JPanel login(){
			
			JPanel panel = new JPanel();
			
			panel.setBackground(Color.decode("#D9BBA9"));
			panel.setOpaque(true);
			panel.setSize(500,500);
			panel.setLocation(0,0);
			panel.setLayout(null);
			
			
			JLabel etiqueta1= new JLabel("Welcome");
			etiqueta1.setSize(100,50);
			//etiqueta1.setOpaque(true);
			//etiqueta1.setBackground(Color.LIGHT_GRAY);
			etiqueta1.setLocation(200,10);
			etiqueta1.setHorizontalAlignment(JLabel.CENTER);
			etiqueta1.setFont(new Font("Cambria",Font.BOLD,18));
			panel.add(etiqueta1);
			
			JLabel etiqueta2 = new JLabel("Username/Email: ");
			etiqueta2.setSize(200,30);
			//etiqueta2.setOpaque(true);
			etiqueta2.setHorizontalAlignment(JLabel.HEIGHT);
			etiqueta2.setFont(new Font("Cambria",Font.BOLD,14));
			etiqueta2.setLocation(200,75);
			panel.add(etiqueta2);
			
			JTextField email = new JTextField();
			email.setSize(250,30);
			email.setOpaque(true);
			email.setHorizontalAlignment(JLabel.HEIGHT);
			email.setFont(new Font("Cambria",Font.BOLD,14));
			email.setLocation(125,105);
			panel.add(email);
			
			JLabel etiqueta3 = new JLabel("Password: ");
			etiqueta3.setSize(200,30);
			//etiqueta2.setOpaque(true);
			etiqueta3.setHorizontalAlignment(JLabel.HEIGHT);
			etiqueta3.setFont(new Font("Cambria",Font.BOLD,14));
			etiqueta3.setLocation(200,135);
			panel.add(etiqueta3);
			
			JTextField pass = new JTextField();
			pass.setSize(250,30);
			pass.setOpaque(true);
			pass.setHorizontalAlignment(JLabel.HEIGHT);
			pass.setFont(new Font("Cambria",Font.BOLD,14));
			pass.setLocation(125,165);
			panel.add(pass);
			
			JButton join = new JButton("Log in");
			join.setSize(100,50);
			join.setBackground(Color.LIGHT_GRAY);
			join.setFont(new Font("Cambria",Font.BOLD,14));
			join.setLocation(200,250);
			panel.add(join);
			
			JLabel etiqueta4 = new JLabel("Forgot your password? ");
			etiqueta4.setSize(200,30);
			//etiqueta2.setOpaque(true);
			etiqueta4.setHorizontalAlignment(JLabel.HEIGHT);
			etiqueta4.setFont(new Font("Cambria",Font.BOLD,10));
			etiqueta4.setLocation(270,200);
			panel.add(etiqueta4);
			
			JCheckBox boton = new JCheckBox();
			boton.setSize(30,30);
			boton.setLocation(120,200);
			boton.setBackground(Color.decode("#D9BBA9"));;
			panel.add(boton);
			
			JLabel etiqueta5 = new JLabel("Remindme ");
			etiqueta5.setSize(200,30);
			//etiqueta2.setOpaque(true);
			etiqueta5.setHorizontalAlignment(JLabel.HEIGHT);
			etiqueta5.setFont(new Font("Cambria",Font.BOLD,10));
			etiqueta5.setLocation(150,200);
			panel.add(etiqueta5);
			
			
			
			
			
			return panel;
		}
}
