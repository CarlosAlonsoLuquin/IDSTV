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
    // Datos de conexión centralizados
    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_ProyectoGYM?useSSL=true";
    private static final String DB_USER = "freedb_CarlosLuquin";
    private static final String DB_PASSWORD = "sXYz68y3@ts6$@E";

    public void UsersModel() {
      
    }

    public List<user> getall() {
        String query = "select * from usuario";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            while (rs.next()) {
                Integer id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String role = rs.getString(4);
                String phone = rs.getString(5);
                Date create_at = rs.getDate(6);

                System.out.println("empId:" + id);
                System.out.println("firstName:" + name);
                System.out.println("");

                usuarios.add(new user(id, name, email, role, phone, create_at, null));
            }
            return usuarios;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return usuarios;
    }

    public boolean remove(int id) {
        String query = "DELETE FROM users WHERE `usuario`.`id` = " + id;
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            int rowsAffected = stmt.executeUpdate(query);
            return rowsAffected > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean insert(String name, String email, String role, String phone) {
        String query = "INSERT INTO users (name, email, role, phone, create_at) " + 
                      "VALUES ('" + name + "', '" + email + "', '" + role + "', '" + phone + "', NOW())";

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             Statement stmt = conn.createStatement()) {
            
            int rowsAffected = stmt.executeUpdate(query);
            return rowsAffected > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
