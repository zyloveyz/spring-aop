package cn.com.leadfar.spring.service.impl;

import cn.com.leadfar.spring.dao.UserDao;
import cn.com.leadfar.spring.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public UserServiceImpl() {
		System.out.println(this+"被创建了！");
	}

	@Override
	public void add() {
		System.out.println(this+".add()");
		userDao.save();
	}

	@Override
	public void del() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
