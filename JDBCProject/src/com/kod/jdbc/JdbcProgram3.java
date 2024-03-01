package com.kod.jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcProgram3 {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username = "root";
		String password = "ROOT";
		String query ="INSERT INTO EMP Values(? ? ?)";//Placeholder
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connectin is establishing");
			PreparedStatement pstmt=con.prepareStatement(query);
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter Emp id");
			int Emp_id=scan.nextInt();
			System.out.println("Enter Emp name");
			String Emp_name=scan.next();
			System.out.println("Enter Emo_slary");
			int Emp_salary=scan.nextInt();
			pstmt.setInt(1,Emp_id);
			pstmt.setString(2, Emp_name);
            pstmt.setInt(3,Emp_salary);
            pstmt.execute();
            System.out.println("Rows are inserted");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
			
			