package com.kod.jdbc;
import java.sql.*;
public class JdbcProgram6 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "ROOT";
		String query="SELECT * FROM STUDENT";
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded sucessfully");
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			
			Statement stmt=con.createStatement();
			stmt.execute(query);
			System.out.println("Query is executed");
			
		}catch (Exception e) {
			e.printStackTrace();
	}
		
	}

}
