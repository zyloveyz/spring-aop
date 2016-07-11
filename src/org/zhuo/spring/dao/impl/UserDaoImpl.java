package org.zhuo.spring.dao.impl;

import org.springframework.stereotype.Repository;
import org.zhuo.spring.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Override
	public void save() {
		System.out.println(this+".save()");
	}

}
