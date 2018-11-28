package com.app.common.configmgr.vo;

import java.util.Date;

/**
 * title:建筑vo类
 * @author lushuntong
 *
 */
public class BuildVo {
	
	private int id;
	private int bloc_id;
	private String name;
	private String desc;
	private String pic;
	private int root_id;
	private int parent_id;
	private int hasChild;
	private int active;
	private Date recordtime;
	private int project_id;

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	//vo
	private String blocname;
	
	
	public String getBlocname() {
		return blocname;
	}
	public void setBlocname(String blocname) {
		this.blocname = blocname;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getRoot_id() {
		return root_id;
	}
	public void setRoot_id(int root_id) {
		this.root_id = root_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getHasChild() {
		return hasChild;
	}
	public void setHasChild(int hasChild) {
		this.hasChild = hasChild;
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
}
