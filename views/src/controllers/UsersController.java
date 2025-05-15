package controllers;

import java.util.ArrayList;
import java.util.List;

import models.Usermodel;
import models.user;
import views.UsersView;

public class UsersController  {
	
	private UsersView vista;
	private List<user> usuarios = new ArrayList<>();
	
	public UsersController() {
		
		vista = new UsersView();
	}
	
	public void index() {
		
		Usermodel um = new Usermodel();
		
		usuarios = um.getall();
		
		vista.index(usuarios);
		
	}

}