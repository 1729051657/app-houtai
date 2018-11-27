package com.app.energyconsumptionmanagement.service;


import com.app.energyconsumptionmanagement.bean.User;

public interface UserSrevice {
    int addUser(User user);
    int updUser(User user);
    User getUser(User user);
    User login(User user);
}
