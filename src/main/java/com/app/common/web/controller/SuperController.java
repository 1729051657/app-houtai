package com.app.common.web.controller;

import com.app.common.configmgr.pojo.Bloc;
import com.app.common.configmgr.pojo.Build;
import com.app.common.configmgr.service.BlocService;
import com.app.common.configmgr.service.BuildService;
import com.app.common.user.vo.User;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import java.util.List;


public class SuperController {

	/**
	 * 把信息放入session.
	 * 
	 * @param request
	 *            the request
	 * @param attributeKey
	 *            the attribute key
	 * @param obj
	 *            the obj
	 */
	public void putSession(final HttpServletRequest request,final String attributeKey, final Object obj) {
		request.getSession().setAttribute(attributeKey, obj);
	}

	/**
	 * 从session中取得信息.
	 * 
	 * @param request
	 *            the request
	 * @param attributeKey
	 *            the attribute key
	 * @return the session
	 */
	public Object getSession(final HttpServletRequest request,
			final String attributeKey) {
		return request.getSession().getAttribute(attributeKey);
	}

	/**
	 * 从request或session中移除对象
	 * 
	 * @param request
	 * @param key
	 */
	public void removeSession(HttpServletRequest request, String key) {
		request.removeAttribute(key);
		request.getSession().removeAttribute(key);
	}

	/***
	 * 懒癌图个方便
	 * @param request
	 * @param model
	 * @param buildService
	 * @param blocService
	 * @return
	 */
	public User setBuildAndBlocList(final HttpServletRequest request, Model model, BuildService buildService, BlocService blocService){
		User user =(User)request.getSession().getAttribute("userinfo");
		if(user.getType()==-1){//admin
			List<Bloc> list=blocService.getBlocList();
			model.addAttribute("blocList",list);
			model.addAttribute("buildList",buildService.getBlocBuildList(list.get(0).getId()));
		}else if(user.getType()==0){//集团
			List<Bloc> list=blocService.getUserBloc(user);
			model.addAttribute("blocList",list);
			model.addAttribute("buildList",buildService.getBlocBuildList(user.getBloc_id()));
		}else if(user.getType()==1){//建筑
			List<Bloc> list=blocService.getUserBloc(user);
			model.addAttribute("blocList",list);
			model.addAttribute("buildList",buildService.getList(new Build(0,user.getBuild_id())));
		}else if(user.getType()==2){//分析账户

		}
		return user;
	}

}
