package INE;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Formulario extends JFrame{

	public Formulario() {
		this.setTitle("Formulario");
		this.setVisible(true);
		this.setSize(550,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.add(this.interfaz());
		this.repaint();
	}
	public JPanel interfaz() {
		
		JPanel panel1 = new JPanel();
		
		panel1.setBackground(Color.decode("#D9BBA9"));
		panel1.setOpaque(true);
		panel1.setSize(600,500);
		panel1.setLocation(0,0);
		panel1.setLayout(null);
		
		JLabel etiqueta1= new JLabel("Ingrese sus datos: ");
		etiqueta1.setSize(250,50);
		etiqueta1.setLocation(150,10);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Cambria",Font.BOLD,18));
		panel1.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Apellido Materno");
		etiqueta2.setSize(200,30);
		etiqueta2.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta2.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta2.setLocation(40,75);
		panel1.add(etiqueta2);
		
		JTextField materno = new JTextField();
		materno.setSize(130,30);
		materno.setOpaque(true);
		materno.setHorizontalAlignment(JLabel.HEIGHT);
		materno.setFont(new Font("Cambria",Font.BOLD,14));
		materno.setLocation(40,100);
		panel1.add(materno);
		
		JLabel etiqueta3 = new JLabel("Apellido Paterno");
		etiqueta3.setSize(200,30);
		etiqueta3.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta3.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta3.setLocation(200,75);
		panel1.add(etiqueta3);
		
		JTextField paterno = new JTextField();
		paterno.setSize(130,30);
		paterno.setOpaque(true);
		paterno.setHorizontalAlignment(JLabel.HEIGHT);
		paterno.setFont(new Font("Cambria",Font.BOLD,14));
		paterno.setLocation(195,100);
		panel1.add(paterno);
		
		JLabel etiqueta4 = new JLabel("Nombre/Nombres");
		etiqueta4.setSize(200,30);
		etiqueta4.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta4.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta4.setLocation(350,75);
		panel1.add(etiqueta4);
		
		JTextField nombre = new JTextField();
		nombre.setSize(130,30);
		nombre.setOpaque(true);
		nombre.setHorizontalAlignment(JLabel.HEIGHT);
		nombre.setFont(new Font("Cambria",Font.BOLD,14));
		nombre.setLocation(350,100);
		panel1.add(nombre);
		
		JLabel etiqueta5 = new JLabel("Sexo");
		etiqueta5.setSize(200,30);
		etiqueta5.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta5.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta5.setLocation(40,130);
		panel1.add(etiqueta5);
		
		JCheckBox boton = new JCheckBox();
		boton.setSize(30,30);
		boton.setLocation(40,155);
		boton.setBackground(Color.decode("#D9BBA9"));;
		panel1.add(boton);
		
		JLabel etiqueta6 = new JLabel("Hombre");
		etiqueta6.setSize(100,30);
		etiqueta6.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta6.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta6.setLocation(70,155);
		panel1.add(etiqueta6);
		
		JCheckBox boton2 = new JCheckBox();
		boton2.setSize(30,30);
		boton2.setLocation(135,155);
		boton2.setBackground(Color.decode("#D9BBA9"));;
		panel1.add(boton2);
		
		JLabel etiqueta7 = new JLabel("Mujer");
		etiqueta7.setSize(100,30);
		etiqueta7.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta7.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta7.setLocation(165,155);
		panel1.add(etiqueta7);
		
		JLabel etiqueta8 = new JLabel("Edad");
		etiqueta8.setSize(100,30);
		etiqueta8.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta8.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta8.setLocation(230,130);
		panel1.add(etiqueta8);
		
		JTextField edad = new JTextField();
		edad.setSize(35,30);
		edad.setOpaque(true);
		edad.setHorizontalAlignment(JLabel.HEIGHT);
		edad.setFont(new Font("Cambria",Font.BOLD,14));
		edad.setLocation(230,155);
		panel1.add(edad);
		
		JLabel etiqueta9 = new JLabel("Domicilio");
		etiqueta9.setSize(100,30);
		etiqueta9.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta9.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta9.setLocation(40,190);
		panel1.add(etiqueta9);
		
		JTextField domicilio = new JTextField();
		domicilio.setSize(440,30);
		domicilio.setOpaque(true);
		domicilio.setHorizontalAlignment(JLabel.HEIGHT);
		domicilio.setFont(new Font("Cambria",Font.BOLD,14));
		domicilio.setLocation(40,220);
		panel1.add(domicilio);
		
		JLabel etiqueta10 = new JLabel("CURP");
		etiqueta10.setSize(100,30);
		etiqueta10.setHorizontalAlignment(JLabel.HEIGHT);
		etiqueta10.setFont(new Font("Cambria",Font.BOLD,14));
		etiqueta10.setLocation(40,260);
		panel1.add(etiqueta10);
		
		JTextField CURP = new JTextField();
		CURP.setSize(440,30);
		CURP.setOpaque(true);
		CURP.setHorizontalAlignment(JLabel.HEIGHT);
		CURP.setFont(new Font("Cambria",Font.BOLD,14));
		CURP.setLocation(40,290);
		panel1.add(CURP);
		
		JButton join = new JButton("Enviar");
		join.setSize(150,30);
		join.setBackground(Color.LIGHT_GRAY);
		join.setFont(new Font("Cambria",Font.BOLD,14));
		join.setLocation(200,350);
		panel1.add(join);
		
		return panel1;
		
	}

}
