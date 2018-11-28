package com.app.energyconsumptionmanagement.service;


public interface UserSrevice {
    int addUser(User user);
    int updUser(User user);
    User getUser(User user);
    User login(User user);
}
