package com.demo.dao;
import com.demo.beans.*;
import java.util.*;
public interface Userdao {
	public List<User> getAll();
	public boolean validate(User u);
	public boolean insert(User u);
	public boolean update(User u);
}
