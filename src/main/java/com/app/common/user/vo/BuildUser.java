package com.app.common.user.vo;

import com.common.configmgr.pojo.Build;

public class BuildUser {
	
	private Build build;
	private User user;
	
	public BuildUser(Build build, User user) {
		super();
		this.build = build;
		this.user = user;
	}
	public BuildUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Build getBuild() {
		return build;
	}
	public void setBuild(Build build) {
		this.build = build;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
}
