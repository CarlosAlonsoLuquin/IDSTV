package controllers;

import views.Homeview;

public class HomeController {
	
	private Homeview vista;

	public HomeController() {
		
		vista = new Homeview();
	}
	
	public void home()
	{
		vista.home();
	}

}