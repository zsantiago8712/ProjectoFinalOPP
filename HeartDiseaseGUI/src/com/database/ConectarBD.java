package com.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectarBD {
	static Connection conn;
	
	private static final String driver = "com.mysql.jdbc.Driver";
	private static final String user = "root";
	private static final String password = "root";
	private static final String url = "jdbc:mysql://localhost:8889/HeartDisease?useSSL=false";
	public ConectarBD(){
		
		try{
			
			Class.forName(driver);
			// Gestiona la conexión a la BD
			conn = DriverManager.getConnection(url,user,password);
			if (conn != null){
				JOptionPane.showMessageDialog(null, "Se conecto Primavera 2022","Mens",JOptionPane.INFORMATION_MESSAGE);
			}			
		}catch (ClassNotFoundException | SQLException e){
			System.out.println("Código de Error: " + ((SQLException) e).getErrorCode() + "\n" +
					"SLQState: " + ((SQLException) e).getSQLState() + "\n" +
					"Mensaje: " + e.getMessage() + "\n");
			System.out.println("No se conectó");
		}
	}

	// Desde otra clase probamos  la conexion
	public Connection getConnection(){
		return conn;
	}

	public void DesConnection(){
		if(conn == null){
			System.out.println("Terminó la conexión");

		}
	}
}
