package com.demo.services;
import java.util.List;
import com.demo.beans.*;

public interface UserServices {
	public List<User> allUser();
	public boolean login(User u);
	public boolean register(User u);
	public boolean forgotPass(User u);
}
