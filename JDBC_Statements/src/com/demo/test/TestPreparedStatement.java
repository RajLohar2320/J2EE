package com.demo.test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestPreparedStatement {
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
				int pid = 200390;
				String Decs = "SANTOOR PACK OF 100";
				PreparedStatement st1 = con.prepareStatement("insert into product values(?,?)");
				st1.setInt(1, pid);
				st1.setString(2, Decs);
				int n = st1.executeUpdate();
				if(n>0)
					System.out.println("Data Inserted Successfully !!");
			}
		} catch (SQLException e) {
			System.out.println("Error : "+e.getMessage());
		}
	}
}

