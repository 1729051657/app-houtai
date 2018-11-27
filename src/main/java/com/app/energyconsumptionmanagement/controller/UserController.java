package com.app.energyconsumptionmanagement.controller;

import com.app.energyconsumptionmanagement.bean.User;
import com.app.energyconsumptionmanagement.service.UserSrevice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    UserSrevice userSrevice;

    @RequestMapping("login")
    @ResponseBody
    Object login(User user){
        return userSrevice.login(user);
    }

}
