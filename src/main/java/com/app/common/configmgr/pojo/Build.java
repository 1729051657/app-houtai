package com.app.common.configmgr.pojo;

import java.util.Date;

/**
 * 建筑实体类
 */
public class Build {
	
	private int id;
	
	private String name;
	
	private int parent_id;

	private String root_id;
	
	private int hasChild;
	
	private int bloc_id;

	private int index_template_id;

	private int backipsdata;

    public int getIndex_template_id() {
        return index_template_id;
    }

    public void setIndex_template_id(int index_template_id) {
        this.index_template_id = index_template_id;
    }

    private String coordinate;

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	public Build(int id) {
		super();
		this.id = id;
	}


	private Date recordtime;
	
	private int pid;
	
	private String desc;
	
	private String pic;

	private int project_id;
	private int user_id;
	private Double ktarea;

	public Double getKtarea() {
		return ktarea;
	}

	public void setKtarea(Double ktarea) {
		this.ktarea = ktarea;
	}
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getProject_id() {
		return project_id;
	}

	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}

	public Build(String name) {
		super();
		this.name = name;
	}


	public Build(String name, int bloc_id) {
		super();
		this.name = name;
		this.bloc_id = bloc_id;
	}


	public Build() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Build(int bloc_id, int build_id) {
		this.bloc_id = bloc_id;
		this.build_id = build_id;
	}

	private int active;
	
	private int build_id;


	public int getBuild_id() {
		return build_id;
	}


	public void setBuild_id(int build_id) {
		this.build_id = build_id;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
		this.active = active;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public int getPid() {
		return pid;
	}


	public void setPid(int pid) {
		this.pid = pid;
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


	public int getParent_id() {
		return parent_id;
	}


	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}


	public String getRoot_id() {
		return root_id;
	}


	public void setRoot_id(String root_id) {
		this.root_id = root_id;
	}


	public int getHasChild() {
		return hasChild;
	}


	public void setHasChild(int hasChild) {
		this.hasChild = hasChild;
	}


	public int getBloc_id() {
		return bloc_id;
	}


	public void setBloc_id(int blocId) {
		bloc_id = blocId;
	}


	public Date getRecordtime() {
		return recordtime;
	}


	public void setRecordtime(Date recordtime) {
		this.recordtime = recordtime;
	}


	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Build{");
		sb.append("id=").append(id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", parent_id=").append(parent_id);
		sb.append(", root_id='").append(root_id).append('\'');
		sb.append(", hasChild=").append(hasChild);
		sb.append(", bloc_id=").append(bloc_id);
		sb.append(", recordtime=").append(recordtime);
		sb.append(", pid=").append(pid);
		sb.append(", desc='").append(desc).append('\'');
		sb.append(", pic='").append(pic).append('\'');
		sb.append(", project_id=").append(project_id);
		sb.append(", user_id=").append(user_id);
		sb.append(", active=").append(active);
		sb.append(", build_id=").append(build_id);
		sb.append('}');
		return sb.toString();
	}

	public int getBackipsdata() {
		return backipsdata;
	}

	public void setBackipsdata(int backipsdata) {
		this.backipsdata = backipsdata;
	}
}
