package com.app.common.user.vo;

import java.io.Serializable;

public class Menu implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int parentid;
	
	private String name;//菜单名
	
	private String url;//链接地址
	
	private String idname;
	
	private String icon;
	
	private int isshow;
	
	private int systype;

	@Override
	public String toString() {
		return "Menu [id=" + id + ", parentid=" + parentid + ", name=" + name + ", url=" + url + ", idname=" + idname
				+ ", icon=" + icon + ", isshow=" + isshow + ", show_order=" + show_order + ", qpp=" + qpp + ", level="
				+ level + "]";
	}

	private int show_order;
	
	private int qpp;
	
	private int level;
	
	
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentid() {
		return parentid;
	}

	public void setParentid(int parentid) {
		this.parentid = parentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIdname() {
		return idname;
	}

	public void setIdname(String idname) {
		this.idname = idname;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public int getIsshow() {
		return isshow;
	}

	public void setIsshow(int isshow) {
		this.isshow = isshow;
	}

	public int getShow_order() {
		return show_order;
	}

	public void setShow_order(int showOrder) {
		show_order = showOrder;
	}

	public int getQpp() {
		return qpp;
	}

	public void setQpp(int qpp) {
		this.qpp = qpp;
	}

	public int getSystype() {
		return systype;
	}

	public void setSystype(int systype) {
		this.systype = systype;
	}

	
}

