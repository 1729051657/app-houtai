package com.app.energyconsumptionmanagement.service.impl;

import com.app.common.dao.BaseDao;
import com.app.energyconsumptionmanagement.bean.User;
import com.app.energyconsumptionmanagement.service.UserSrevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserSreviceImpl implements UserSrevice {
    @Autowired
    BaseDao baseDao;
    @Override
    public int addUser(User user) {
        return baseDao.save("userMapper.addUser",user);
    }
    @Override
    public int updUser(User user) {
        return baseDao.update("userMapper.updUser",user);
    }

    @Override
    public User getUser(User user) {
        return baseDao.get("userMapper.getUser",user);
    }

    @Override
    public User login(User user) {
        User user1=baseDao.get("userMapper.getUser",user);
        if(user1==null){
            baseDao.save("userMapper.addUser",user);
            return user;
        }else{
            return user1;
        }
    }
}
