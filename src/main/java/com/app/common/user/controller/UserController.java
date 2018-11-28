package com.app.common.user.controller;
import javax.annotation.Resource;

import com.app.common.configmgr.service.BlocService;
import com.app.common.configmgr.service.BuildService;
import com.app.common.user.service.UserService;
import com.app.common.web.controller.SuperController;
import com.app.energyconsumptionmanagement.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/user")
public class UserController extends SuperController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private BlocService blocService;
	
	@Resource
	private BuildService buildService;

	@Autowired
	DeviceService deviceService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setAutoGrowCollectionLimit(10000);
	}

}
