package com.app.common.configmgr.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;


/**
 * 集团vo类
 * @author Raytine
 *
 */
public class BlocAttributeVo {
	
	private int id;
	private String name;
	private String imgurl;
	private String address;
	private String phone;
	private String aliasName;
	private int active;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date recordtime;
	private int bid;
	private int bloc_id;
	private String location;
	private String voltagelevel;
	private String capacity;
	private int mainsum;
	private int zgypdgsl;
	private String introduce;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	private int dypdgsl;
	private String starttime;

	public int getBid() {
		return bid;
	}
	public BlocAttributeVo(String name) {
		super();
		this.name = name;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public BlocAttributeVo() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getName() {
		return name;
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
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Date getRecordtime() {
		return recordtime;
	}
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getVoltagelevel() {
		return voltagelevel;
	}
	public void setVoltagelevel(String voltagelevel) {
		this.voltagelevel = voltagelevel;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public int getMainsum() {
		return mainsum;
	}
	public void setMainsum(int mainsum) {
		this.mainsum = mainsum;
	}
	public int getZgypdgsl() {
		return zgypdgsl;
	}
	public void setZgypdgsl(int zgypdgsl) {
		this.zgypdgsl = zgypdgsl;
	}
	public int getDypdgsl() {
		return dypdgsl;
	}
	public void setDypdgsl(int dypdgsl) {
		this.dypdgsl = dypdgsl;
	}
	public String getStarttime() {
		return starttime;
	}
	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}
	@Override
	public String toString() {
		return "BlocAttributeVo [id=" + id + ", name=" + name + ", imgurl=" + imgurl + ", address=" + address
				+ ", phone=" + phone + ", aliasName=" + aliasName + ", active=" + active + ", recordtime=" + recordtime
				+ ", bid=" + bid + ", bloc_id=" + bloc_id + ", location=" + location + ", voltagelevel=" + voltagelevel
				+ ", capacity=" + capacity + ", mainsum=" + mainsum + ", zgypdgsl=" + zgypdgsl + ", dypdgsl=" + dypdgsl
				+ ", starttime=" + starttime + "]";
	}
}
