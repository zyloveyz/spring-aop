package cn.com.leadfar.spring.dao.impl;

import org.springframework.stereotype.Repository;

import cn.com.leadfar.spring.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println(this+".save()");
	}

}
