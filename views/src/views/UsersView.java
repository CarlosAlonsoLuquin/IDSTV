package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.Usermodel;
import models.user;

public class UsersView {

	public UsersView() {

	}

	public void index(List usuarios) {
		JFrame ventana = new JFrame();

		ventana.setVisible(true);
		ventana.setSize(930, 600);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("Login");
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(true);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		// this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600);

		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);

		String[] columnas = { "ID", "Nombre", "Email", "Rol", "Teléfono", "Create_At" };
		DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
		JTable tabla = new JTable(modelo);

		for (Object user : usuarios) {
			user usuario = (user) user;
			Object[] fila = { usuario.id, usuario.name, usuario.email, usuario.role, usuario.phone };
			modelo.addRow(fila);
		}

		JScrollPane scrollpane = new JScrollPane(tabla);
		scrollpane.setBounds(50, 80, 800, 300);
		panel.add(scrollpane);
		
		 JButton btnAgregar = new JButton("Agregar Usuario");
		    btnAgregar.setBounds(400, 400, 200, 30);
		    btnAgregar.addActionListener(new ActionListener() {
		        @Override
		        public void actionPerformed(ActionEvent e) {
		            // Abre un formulario para agregar usuario
		            agregarUsuario(ventana);
		        }
		    });
		    panel.add(btnAgregar);

		int y = 400;
	    for (Object obj : usuarios) {
	        user usuario = (user) obj;
	        JButton delete = new JButton("Eliminar " + usuario.id);
	        delete.setBounds(50, y, 200, 30);
	        delete.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	            	Usermodel um = new Usermodel();
	                um.remove(usuario.id);
	                ventana.dispose();
	                UsersController us = new UsersController();
	                us.index();
	            }
	        });
	        panel.add(delete);
	        y += 40;
	    }


		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
	}
	private void agregarUsuario(JFrame parentFrame) {
	    JFrame formulario = new JFrame("Agregar Usuario");
	    formulario.setSize(400, 400);
	    formulario.setLocationRelativeTo(parentFrame);
	    formulario.setLayout(null);
	    

	    JPanel panel = new JPanel();
	    panel.setLayout(null);
	    panel.setBounds(0, 0, 400, 400);

	    // Campos del formulario
	    JLabel lblNombre = new JLabel("Nombre:");
	    lblNombre.setBounds(20, 20, 100, 25);
	    panel.add(lblNombre);
	    JTextField txtNombre = new JTextField();
	    txtNombre.setBounds(130, 20, 200, 25);
	    panel.add(txtNombre);
	    

	    JLabel lblEmail = new JLabel("Email:");
	    lblEmail.setBounds(20, 60, 100, 25);
	    panel.add(lblEmail);
	    JTextField txtEmail = new JTextField();
	    txtEmail.setBounds(130, 60, 200, 25);
	    panel.add(txtEmail);

	    JLabel lblRol = new JLabel("Rol:");
	    lblRol.setBounds(20, 100, 100, 25);
	    panel.add(lblRol);
	    JTextField txtRol = new JTextField();
	    txtRol.setBounds(130, 100, 200, 25);
	    panel.add(txtRol);
	    

	    JLabel lblTelefono = new JLabel("Teléfono:");
	    lblTelefono.setBounds(20, 140, 100, 25);
	    panel.add(lblTelefono);
	    JTextField txtTelefono = new JTextField();
	    txtTelefono.setBounds(130, 140, 200, 25);
	    panel.add(lblTelefono);

	    // Botón de guardar
	    JButton btnGuardar = new JButton("Guardar");
	    btnGuardar.setBounds(150, 200, 100, 30);
	    panel.add(txtTelefono);
	    btnGuardar.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            String nombre = txtNombre.getText();
	            String email = txtEmail.getText();
	            String rol = txtRol.getText();
	            String telefono = txtTelefono.getText();

	            Usermodel um = new Usermodel();
	            boolean exito = um.insert(nombre, email, rol, telefono);

	            if (exito) {
	                JOptionPane.showMessageDialog(formulario, "Usuario agregado correctamente");
	                formulario.dispose();
	                parentFrame.dispose();
	                new UsersController().index(); // Refresca la lista
	            } else {
	                JOptionPane.showMessageDialog(formulario, "Error al agregar usuario", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	            
	        }
	    });
	    panel.add(btnGuardar);
	    formulario.setVisible(true);
	    formulario.add(panel);
	    formulario.repaint();
	    formulario.revalidate();
	}
	

}
