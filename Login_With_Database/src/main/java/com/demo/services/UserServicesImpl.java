package com.demo.services;

import java.util.List;

import com.demo.beans.User;
import com.demo.dao.Userdao;
import com.demo.dao.UserdaoImpl;

public class UserServicesImpl implements UserServices{
	Userdao udao = new UserdaoImpl();
	@Override
	public List<User> allUser() {
		return udao.getAll();
	}
	@Override
	public boolean login(User u) {
		return udao.validate(u);
	}
	@Override
	public boolean register(User u) {
		return udao.insert(u);
	}

	@Override
	public boolean forgotPass(User u) {
		return udao.update(u);
	}

}
