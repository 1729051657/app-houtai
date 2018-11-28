package com.app.common.configmgr.pojo;

import java.sql.Date;

public class Bloc {
	private int id;
	private String name;
	private String imgurl;
	private String address;
	private String introduce;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	private String aliasName;
	private String phone;
	private Date recordtime;
	
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Bloc(String name) {
		super();
		this.name = name;
	}
	public Bloc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	@Override
	public String toString() {
		return "Bloc{" +
				"id=" + id +
				", name='" + name + '\'' +
				", imgurl='" + imgurl + '\'' +
				", address='" + address + '\'' +
				", aliasName='" + aliasName + '\'' +
				", phone='" + phone + '\'' +
				", recordtime=" + recordtime +
				'}';
	}
}
