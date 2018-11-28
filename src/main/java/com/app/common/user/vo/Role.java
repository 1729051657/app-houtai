package com.app.common.user.vo;

public class Role {
	
	private int id;
	
	private String rolename;

	private int type;
	
	private int systype;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public int getSystype() {
		return systype;
	}

	public void setSystype(int systype) {
		this.systype = systype;
	}
	
	

}
