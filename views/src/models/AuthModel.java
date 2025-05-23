package models;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JPasswordField;

public class AuthModel {
    // Datos de conexión a la base de datos
    private static final String DB_URL = "jdbc:mysql://sql.freedb.tech:3306/freedb_ProyectoGYM";
    private static final String DB_USER = "freedb_CarlosLuquin";
    private static final String DB_PASSWORD = "sXYz68y3@ts6$@E"; 
    
    public AuthModel() {
        // Cargar el driver JDBC
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el driver JDBC: " + e.getMessage());
        }
    }
    public boolean registrarUsuario(String email, String password) {
        // Validación básica de campos
        if (email == null || email.trim().isEmpty() ||
            password == null || password.trim().isEmpty()) {
            System.err.println("Error: Email y password son obligatorios");
            return false;
           
        }
        try {//verificacion si exixte correo
            if(correoExiste(email)) {
                System.err.println("Error: El correo ya está registrado");
                return false;
            }
        } catch (SQLException e) {
            System.err.println("Error al verificar correo: " + e.getMessage());
            return false;
        }
        
        String sql = "INSERT INTO usuario (correo, contraseña, id_rol) VALUES (?, ?, 1)";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email.trim());
            pstmt.setString(2, password.trim());
            
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
            
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
    }
    private boolean correoExiste(String email) throws SQLException {
        String sql = "SELECT 1 FROM usuario WHERE correo = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email.trim());
            
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
        }
    }
    public boolean login(String email, String password) {
        if (email == null || email.trim().isEmpty() || password == null) {
            return false;
        }

        String sql = "SELECT id_usuario FROM usuario WHERE correo = ? AND contraseña = ?";
        
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, email.trim());
            pstmt.setString(2, password.trim());
            
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next(); 
            }
            
        } catch (SQLException e) {
            System.err.println("Error en login: " + e.getMessage());
            return false;
        }
        
    }

}
