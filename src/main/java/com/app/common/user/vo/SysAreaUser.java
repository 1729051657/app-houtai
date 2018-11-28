package com.app.common.user.vo;

import java.util.Date;

public class SysAreaUser {
	
	private int id;
	private int user_id;
	private int build_id;
	private String buildname;
	private Date recordtime;
	
	/**
	 * @return the buildname
	 */
	public String getBuildname() {
		return buildname;
	}
	/**
	 * @param buildname the buildname to set
	 */
	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	public SysAreaUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SysAreaUser [id=" + id + ", user_id=" + user_id + ", build_id=" + build_id + ", buildname=" + buildname
				+ ", recordtime=" + recordtime + "]";
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the build_id
	 */
	public int getBuild_id() {
		return build_id;
	}
	/**
	 * @param build_id the build_id to set
	 */
	public void setBuild_id(int build_id) {
		this.build_id = build_id;
	}
	/**
	 * @return the recordtime
	 */
	public Date getRecordtime() {
		return recordtime;
	}
	/**
	 * @param recordtime the recordtime to set
	 */
	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}
	
	
}
