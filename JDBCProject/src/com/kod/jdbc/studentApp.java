package com.kod.jdbc;
import java.sql.*;
public class studentApp {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/myjdbcdb";
		String username= "root";
		String password= "ROOT";
		String query =" INSERT INTO student1 values(?,?,?)";
		
		try {
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established");
			PreparedStatement pstmt=con.prepareStatement(query);
			
			
			student1 st1=new student1(11,"ankth",97);
			pstmt.setInt(1, st1.rollno);
			pstmt.setString(2,st1.name);
			pstmt.setInt(3, st1.marks);
			pstmt.execute();
			
			student1 st2=new student1(12,"ajay",93);
			pstmt.setInt(1, st2.rollno);
			pstmt.setString(2,st2.name);
			pstmt.setInt(3, st2.marks);
			pstmt.execute();
			
			student1 st3=new student1(13,"anju",99);
			pstmt.setInt(1, st3.rollno);
			pstmt.setString(2,st3.name);
			pstmt.setInt(3, st3.marks);
			pstmt.execute();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
