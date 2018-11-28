package com.app.common.configmgr.pojo;

/**
 * 建筑属性
 * @author lushuntong
 *
 */
public class BlocAttribute {
	
	private int id;
	private int bloc_id;
	private String location;
	private String voltagelevel;
	private String capacity;
	private String introduce;

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	private int mainsum;
	private int zgypdgsl;
	private int dypdgsl;
	private String starttime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBloc_id() {
		return bloc_id;
	}
	public void setBloc_id(int bloc_id) {
		this.bloc_id = bloc_id;
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
}
