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
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Como recuperar la contraseña");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(357, 10, 285, 27);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(27, 42, 927, 476);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("sigue estos pasos");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 10, 177, 34);
		panel_1.add(lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 41, 614, 403);
		panel_1.add(scrollPane);
		
		JTextArea txtrseleccionaLa = new JTextArea();
		txtrseleccionaLa.setText("Si olvidaste tu contraseña, sigue estos pasos para restablecerla:  \r\n\r\n1. **Selecciona la opción \"Cuenta\" en la barra superior**  \r\n   - En la parte superior de la página, ubica la barra de navegación.  \r\n   - Haz clic en la opción **\"Cuenta\"** para desplegar las opciones disponibles.  \r\n\r\n2. **Haz clic en \"Recuperación de cuenta\"**  \r\n   - Dentro del menú desplegable, selecciona la opción **\"Recuperación de cuenta\"**.  \r\n\r\n3. **Ingresa tu correo electrónico**  \r\n   - Escribe el correo electrónico asociado a tu cuenta.  \r\n   - Luego, haz clic en el botón **\"Enviar\"** o **\"Recuperar contraseña\"**.  \r\n\r\n4. **Revisa tu correo electrónico**  \r\n   - Recibirás un correo con un enlace para restablecer tu contraseña.  \r\n   - Si no lo encuentras, revisa la carpeta de **spam** o **correo no deseado**.  \r\n\r\n5. **Restablece tu contraseña**  \r\n   - Abre el enlace que recibiste y escribe una nueva contraseña segura.  \r\n   - Confirma la nueva contraseña y haz clic en **\"Guardar\"** o **\"Actualizar contraseña\"**.  \r\n\r\n6. **Inicia sesión con tu nueva contraseña**  \r\n   - Vuelve a la página de inicio de sesión e ingresa con tu nueva contraseña. ");
		scrollPane.setViewportView(txtrseleccionaLa);
	}
}
