package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JPasswordField;

public class AuthModel {
	
	public boolean login(String email,String pass) {
		
		String url = this.getClass().
				getResource("/files/users.txt").getPath();
		BufferedReader reader;
		
		try {
			reader = new BufferedReader(new FileReader(url));
			String line = reader.readLine();
			
			while (line != null) {
				String[] data = line.split(",");
				line = reader.readLine();
				
			if(email.equals(data[2])) {
				if(pass.equals(data[3])) {
					return true;
				}
			}
			}
			reader.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	
	}


}
