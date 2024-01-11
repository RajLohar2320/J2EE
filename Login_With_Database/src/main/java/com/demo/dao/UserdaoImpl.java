package com.demo.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.demo.beans.*;
import java.util.ArrayList;

public class UserdaoImpl implements Userdao{
	static Connection con;
	static PreparedStatement getAllUser, insertUser, updateUser;
	static {
		con = DBUtil.getMyConnection();
		try {
			con = DBUtil.getMyConnection();
			getAllUser = con.prepareStatement("Select * from login");
			insertUser = con.prepareStatement("insert into login values(?,?,?)");
			updateUser = con.prepareStatement("update login set password=? where email=?");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public List<User> getAll(){
		List<User> u_arr = new ArrayList<>();
		try {
			ResultSet rs = getAllUser.executeQuery();
			while(rs.next()) {
				u_arr.add(new User(rs.getString(1), rs.getString(2), rs.getString(3)));
			}
			return u_arr;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public boolean insert(User u_data) {
		List<User> u_arr = getAll();
		for (User u : u_arr){
			if(u.getUname().equals(u_data.getUname()) && u.getEmail().equals(u_data.getEmail())) {
				return false;
			}
		}
		try {
			insertUser.setString(1, u_data.getUname());
			insertUser.setString(2, u_data.getPass());
			insertUser.setString(3, u_data.getEmail());
			insertUser.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean update(User u_data) {
		List<User> u_arr = getAll();
		for (User u : u_arr){
			if(u.getEmail().equals(u_data.getEmail())) {
				try {
					updateUser.setString(1,u_data.getPass());
					updateUser.setString(2,u_data.getEmail());
					updateUser.executeUpdate();
					return true;
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return false;
		
	}
	public boolean validate(User u_data) {
		List<User> u_arr = getAll();
		for (User u : u_arr){
			if(u.getUname().equals(u_data.getUname()) && u.getPass().equals(u_data.getPass())) {
				return true;
			}
		}
		return false;
	}
	
}
