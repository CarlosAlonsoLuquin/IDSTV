package aplication;

import controllers.AuthController;
import views.AuthView;

public class Main {

	public static void main(String[] args) {
		AuthController app = new AuthController(); 
		app.login();
	
	}

}
