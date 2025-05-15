package models;

import java.util.Date;

public class user {
	
	public int id;
	public String name;
	private String email;
	private String role;
	private String phone;
	private Date create_at;
	private Date update_at;
	
	public user(int id, String name, String email, String role, String phone, Date create, Date update) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.phone = phone;
		this.create_at = create;
		this.update_at = update;
	}
	



}
