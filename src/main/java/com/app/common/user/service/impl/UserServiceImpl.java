package com.app.common.user.service.impl;


import com.app.common.dao.BaseDao;
import com.app.common.user.service.UserService;
import com.app.common.user.vo.Menu;
import com.app.common.user.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private BaseDao baseDao;

	@Override
	public User getUser(User user) {
		return baseDao.get("userMapper.getUser",user);
	}
	@Override
	public List<Menu> getUserMenu(User user){
		return baseDao.getList("userMapper.getUserMenu",user);
	}
}
