package com.kod.jdbc;
import java.sql.*;
import java.util.Scanner;
public class jdbcProgram7 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "ROOT";
		String query ="INSERT INTO Emp VALUES(? ? ?)";
		
		try {
			Connection con = DriverManager.getConnection(url,username ,password);
			System.out.println("System is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Emp_id");
			int Emp_id=scan.nextInt();
			System.out.println("Enter the Emp_name");
			String Emp_name=scan.next();
			System.out.println("Enter the Emp_Slary");
			int Emp_salry=scan.nextInt();
			pstmt.setInt(1, Emp_id);
			pstmt.setString(2,Emp_name);
			pstmt.setInt(3, Emp_salry);
			pstmt.execute();
			System.out.println("Rows are inserted");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
