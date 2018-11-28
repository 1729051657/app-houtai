package com.app.common.configmgr.pojo;

import java.util.Date;

public class BuAttr {

	private int id;
	private String inner_code;
	private int active;
	private Date create_date;
	private Date completed_date;
	private String location;
	private double area;
	private double study_area;
	private int bloc_id;
	private int build_id;
	private String pic;
	private String structure;
	private int project_id;
	private Double ktarea;

	public Double getKtarea() {
		return ktarea;
	}

	public void setKtarea(Double ktarea) {
		this.ktarea = ktarea;
	}
	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInner_code() {
		return inner_code;
	}
	public void setInner_code(String inner_code) {
		this.inner_code = inner_code;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getCompleted_date() {
		return completed_date;
	}
	public void setCompleted_date(Date completed_date) {
		this.completed_date = completed_date;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getStudy_area() {
		return study_area;
	}
	public void setStudy_area(double study_area) {
		this.study_area = study_area;
	}
	public int getBloc_id() {
		return bloc_id;
	}
	public void setBloc_id(int bloc_id) {
		this.bloc_id = bloc_id;
	}
	public int getBuild_id() {
		return build_id;
	}
	public void setBuild_id(int build_id) {
		this.build_id = build_id;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public String getStructure() {
		return structure;
	}
	public void setStructure(String structure) {
		this.structure = structure;
	}
	
}
