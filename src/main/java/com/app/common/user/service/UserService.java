package com.app.common.user.service;

import java.util.List;

import com.app.common.user.vo.Menu;
import com.app.common.user.vo.User;

/**
 * 
 * <p>
 * Title:用户服务层接口
 * </p> 
 * <p>
 * Description:
 * </p> 
 * <p>
 * Author: 李尧   2013-8-21  上午08:38:19
 * </p> 
 * <p>
 *  
 * </p> 
  * <p>
 * Copyright: @2013 李尧
 * </p> 
 *
 */
public interface UserService {
    /**
     * 查询单个用户
     * @param userId
     * @return
     * @throws BusinessException
     */
	public User getUser(String username);
	public User getUserById(int id);
	public List<Menu> getUserMenu(User user);

}

