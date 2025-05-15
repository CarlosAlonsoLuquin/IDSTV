package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JPasswordField;

public class AuthModel {

	public boolean registrarUsuario(String nombre, String email,  String password, String empresa ) {

		File archivo = new File("files/users.txt");
		System.out.println("Ruta completa: " + archivo.getAbsolutePath());

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivo, true))) {
			String linea = String.join(",", nombre, email,  password, empresa);
			writer.write(linea);
			writer.newLine();
			return true;
		} catch (IOException e) {
			System.err.println("Error crítico al registrar: " + e.getMessage());
			e.printStackTrace();
			return false;
		}
	}

	public AuthModel() {

	}

	private static final String USERS_FILE = "files/users.txt";

	public boolean login(String email, String pass) {

		String url = this.getClass().getResource("/files/users.txt").getPath();
		BufferedReader reader;

		try {
			reader = new BufferedReader(new FileReader(url));
			String line = reader.readLine();

			while (line != null) {
				String[] data = line.split(",");
				line = reader.readLine();

				if (email.equals(data[2])) {
					if (pass.equals(data[3])) {
						return true;
					}
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;

	}

}
