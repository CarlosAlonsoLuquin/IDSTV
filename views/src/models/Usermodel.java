package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Usermodel {
	
	private List<user> usuarios = new ArrayList<>();
	
	public void UsersModel() {
		// TODO Auto-generated constructor stub
	}

	public List getall() {
		
		String query = "select * from users";
		Connection conn = null;
		Statement stmt = null;

		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2); 
				
				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				 
				System.out.println(""); 
				
				usuarios.add(new user(id,name,"","","",null,null));
			}
			
			rs.close();
			return usuarios;
		}catch(
		Exception e)
		{
			e.printStackTrace();
		}finally
		{
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {
			}
		}
		return usuarios;
		
	}
}


