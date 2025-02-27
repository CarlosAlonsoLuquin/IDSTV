package IDSTV;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
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
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ventana extends JFrame {

	public ventana() {
		this.setTitle("Hola");
		this.setVisible(true);
		this.setSize(300, 350);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);

		//this.add(this.login());
		// this.add(this.register());
		// this.add(this.users());
		this.add(this.calculadora());
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
		
		
		
		
		//JMenuBar barra2 = new JMenuBar();
		
		JMenu opciones = new JMenu("Opciones");
		barra.add(opciones);
		
		JMenuItem open35 = new JMenuItem("Ayuda");
		opciones.add(open35);
		
		
		
		this.setJMenuBar(barra);
		this.repaint();
		this.revalidate();
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

		JTextField pass = new JTextField();
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
		icon_user.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(icon_user.getWidth(), icon_user.getHeight(),Image.SCALE_DEFAULT)));
		panel.add(icon_user);
		
		ImageIcon imagen2 = new ImageIcon("imagenes/password.png");
		JLabel icon_pass = new JLabel();
		icon_pass.setBounds(90, 165, 30, 30);
		icon_pass.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(icon_pass.getWidth(), icon_pass.getHeight(),Image.SCALE_DEFAULT)));
		panel.add(icon_pass);
		
		ImageIcon imagen3 = new ImageIcon("imagenes/logo.png");
		JLabel logo = new JLabel();
		logo.setBounds(400, 0, 500, 500);
		logo.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(logo.getWidth(), logo.getHeight(),Image.SCALE_SMOOTH)));
		panel.add(logo);
		
		



		return panel;
	}

	public JPanel register() {

		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#D9BBA9"));
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
		boton.setBackground(Color.decode("#D9BBA9"));
		panel.add(boton);

		JCheckBox boton2 = new JCheckBox("Single");
		boton2.setSize(80, 30);
		boton2.setLocation(210, 215);
		boton2.setFont(new Font("Cambria", Font.BOLD, 14));
		boton2.setBackground(Color.decode("#D9BBA9"));
		panel.add(boton2);

		JCheckBox boton3 = new JCheckBox("Divorced");
		boton3.setSize(90, 30);
		boton3.setLocation(285, 215);
		boton3.setFont(new Font("Cambria", Font.BOLD, 14));
		boton3.setBackground(Color.decode("#D9BBA9"));
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

		JRadioButton acep_tag = new JRadioButton("Accept the terms", true);
		acep_tag.setSize(110, 20);
		acep_tag.setLocation(125, 300);
		acep_tag.setFont(new Font("Cambria", Font.BOLD, 10));
		acep_tag.setBackground(Color.decode("#D9BBA9"));
		acep_tag.setOpaque(true);
		panel.add(acep_tag);

		JRadioButton dont_tag = new JRadioButton("don't accept the terms", false);
		dont_tag.setSize(150, 20);
		dont_tag.setLocation(246, 300);
		dont_tag.setFont(new Font("Cambria", Font.BOLD, 10));
		dont_tag.setBackground(Color.decode("#D9BBA9"));
		dont_tag.setOpaque(true);
		panel.add(dont_tag);

		ButtonGroup botones = new ButtonGroup();
		botones.add(acep_tag);
		botones.add(dont_tag);

		return panel;

	}

	public JPanel users() {


		JPanel panel = new JPanel();

		panel.setBackground(Color.decode("#D9BBA9"));
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

		String titles[] = { "nombre", "apellido", "edad" };

		String datos[][] = { { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" },
				{ "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" },
				{ "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" },
				{ "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" },
				{ "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" }, { "Carlos", "Luquin", "24" } };

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
	
	
	
	

}
