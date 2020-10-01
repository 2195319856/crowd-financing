package com.erp.service;

import java.util.List;

import com.erp.bean.User;

import com.erp.dao.UserDao;

public class UserService {

	private UserDao userDao;

	public User login(User user) {
		return userDao.login(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void updateuser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);

	}

}
