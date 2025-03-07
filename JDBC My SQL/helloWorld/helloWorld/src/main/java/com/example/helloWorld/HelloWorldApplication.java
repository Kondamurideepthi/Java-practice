package com.example.helloWorld;
import java.sql.*;


public class HelloWorldApplication {
	public static void main(String[] args) throws ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/youtube";
		String Uname = "root";
		String password = "Deepthi@2001";
		String sql = "SELECT * FROM student WHERE sid = 100";


//        Class.forName("com.mysql.cj.jdbc.Driver");

		try {
			Connection con = DriverManager.getConnection(url, Uname, password);
			System.out.println("Connection established");

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Query executed successfully");

			if (rs.next()) {  // Check if a row exists
				String name = rs.getString("sname");
				System.out.println("Student Name: " + name);
			} else {
				System.out.println("No student found with sid = 100");
			}

			// Close resources
			rs.close();
			st.close();
			con.close();

		} catch (SQLException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}