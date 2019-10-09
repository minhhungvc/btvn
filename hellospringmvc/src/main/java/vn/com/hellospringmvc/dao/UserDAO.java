package vn.com.hellospringmvc.dao;

import vn.com.hellospringmvc.model.User;

public interface UserDAO {
		public User getUserByUsername(String name);
	}

