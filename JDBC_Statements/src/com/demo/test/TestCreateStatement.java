package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestCreateStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url = "jdbc:mysql://192.168.10.150:3306/dac17?useSSL=false";
			Connection con = DriverManager.getConnection(url, "dac17", "welcome");
			if(con!=null) {
				System.out.println("Connected !!");
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from product");
				while(rs.next()) {
					System.out.println("Product ID : "+rs.getInt(1));
					System.out.println("Description : "+rs.getString(2));
					System.out.println("---------------------------------");
				}
			}
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}
