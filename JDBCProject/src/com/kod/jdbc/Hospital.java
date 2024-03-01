package com.kod.jdbc;
import java.sql.*;
import java.util.Scanner;
public class Hospital {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username= "root";
		String password= "ROOT";
		String query="INSERT INTO HOSPITAL VALUES(?,?,?) ";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("How many rows to be insert");
			int rows =scan.nextInt();
			for(int i=1;i<=rows;i++) {
				System.out.println("Enter the Patient_id"+i);
				int Patient_id=scan.nextInt();
				System.out.println("Enter the Patient_name"+i);
				String Patient_name=scan.next();
				System.out.println("Enter the Patient_age"+i);
				int Patient_age=scan.nextInt();
			
			pstmt.setInt(1, Patient_id);
			pstmt.setString(2, Patient_name);
			pstmt.setInt(3,Patient_age);
			pstmt.execute();
			System.out.println("Rows are are inserted");
			}
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}


