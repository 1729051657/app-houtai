package com.app.common.user.vo;

import java.util.Date;

public class User {
	
	private int id;
	
	private String userName;
	
	private String rolename;

	private int rid;
	
	private int roleid;
	
	private String passWord;
	
	private Date createtime;
	
	private String projectname;
	
	private int systype=1;//1为电力监控系统
	
	private int bloc_id;
	
	private int type;
	
	private int build_id;
	
	private int active;
	
	private String name;
	
	private String buildname;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getBuildname() {
		return buildname;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getBuild_id() {
		return build_id;
	}

	public void setBuild_id(int build_id) {
		this.build_id = build_id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBloc_id() {
		return bloc_id;
	}

	public void setBloc_id(int bloc_id) {
		this.bloc_id = bloc_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	public String getProjectname() {
		return projectname;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", rolename=" + rolename + ", roleid=" + roleid
				+ ", passWord=" + passWord + ", createtime=" + createtime + ", projectname=" + projectname
				+ ", systype=" + systype + ", bloc_id=" + bloc_id + ", type=" + type + ", build_id=" + build_id
				+ ", name=" + name + "]";
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public int getSystype() {
		return systype;
	}

	public void setSystype(int systype) {
		this.systype = systype;
	}
	
	

}
