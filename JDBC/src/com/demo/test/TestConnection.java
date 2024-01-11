package com.demo.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://192.168.10.150:3306/dac17?useSSL=false";
			Connection con = DriverManager.getConnection(url,"dac17","welcome");
			if(con!=null)
				System.out.println("Connected");
		}catch(SQLException e)
		{
			System.out.println("Error : "+e.getMessage());
		}	
	}
}
