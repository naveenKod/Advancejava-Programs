package com.kod.jdbc;
import java.sql.*;
import java.util.Scanner;
public class JdbcBank {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username= "root";
		String password= "ROOT";
		
		String query1="UPDATE BANK SET AMOUNT=AMOUNT-? WHERE AC_no=1111";
		String query2="UPDATE BANK SET AMOUNT=AMOUNT+? WHERE AC_no=3333";
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			
			PreparedStatement pstmt1=con.prepareStatement(query1);
			PreparedStatement pstmt2=con.prepareStatement(query2);

			
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter the amount to be transfer");
			int amount=scan.nextInt();
			pstmt1.setInt(1,amount);
			pstmt2.setInt(1,amount);
			
			pstmt1.executeUpdate();
			System.out.println("Amount is debited form Ac_no :1111");
			pstmt2.executeUpdate();
			System.out.println("Amount is credite to Ac_no : 3333");
			con.commit();
		}
		catch(Exception e) {
			
			e.printStackTrace();
		}
	}
}

