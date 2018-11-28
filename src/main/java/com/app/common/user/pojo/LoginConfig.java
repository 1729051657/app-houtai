package com.app.common.user.pojo;

import java.util.Date;

public class LoginConfig {
	
	private int id;
	
	private String login_id;
	
	private String logo_img;
	
	private String login_title;
	private int build_id;
	private String build_name;
	private String bloc_name;

	public String getBuild_name() {
		return build_name;
	}

	public void setBuild_name(String build_name) {
		this.build_name = build_name;
	}

	public String getBloc_name() {
		return bloc_name;
	}

	public void setBloc_name(String bloc_name) {
		this.bloc_name = bloc_name;
	}

	private int bloc_id;
	private int type;

	public int getBuild_id() {
		return build_id;
	}

	public void setBuild_id(int build_id) {
		this.build_id = build_id;
	}

	public int getBloc_id() {
		return bloc_id;
	}

	public void setBloc_id(int bloc_id) {
		this.bloc_id = bloc_id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	private String login_img;
	
	private Date recordtime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String loginId) {
		login_id = loginId;
	}

	public String getLogo_img() {
		return logo_img;
	}

	public void setLogo_img(String logoImg) {
		logo_img = logoImg;
	}

	public String getLogin_title() {
		return login_title;
	}

	public void setLogin_title(String loginTitle) {
		login_title = loginTitle;
	}

	public String getLogin_img() {
		return login_img;
	}

	public void setLogin_img(String loginImg) {
		login_img = loginImg;
	}

	public Date getRecordtime() {
		return recordtime;
	}

	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("LoginConfig{");
		sb.append("id=").append(id);
		sb.append(", login_id='").append(login_id).append('\'');
		sb.append(", logo_img='").append(logo_img).append('\'');
		sb.append(", login_title='").append(login_title).append('\'');
		sb.append(", login_img='").append(login_img).append('\'');
		sb.append(", recordtime=").append(recordtime);
		sb.append('}');
		return sb.toString();
	}
}
