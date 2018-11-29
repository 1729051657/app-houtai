package com.app.common.user.service;

import java.util.List;

import com.app.common.user.vo.Menu;
import com.app.common.user.vo.User;

public interface UserService {
	User getUser(User user);
	List<Menu> getUserMenu(User user);
}

