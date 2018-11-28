package com.app.common.configmgr.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * 单位实体类
 */
public class BuildAttribute implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private int id;
	
	private int bloc_id;
	
	private String name;
	
	private String desc;//建筑描述
	
	private int parent_id;

	private String root_id;
	private Double ktarea;


	private String capacity;
	
	private String voltagelevel;
	
	private int mainsum;
	
	private int zgypdgsl;
	
	private int dypdgsl;
	
	private String starttime;
	
	private Date create_data;
	
	private int hasChild;
	
	private String pic;//图片
	
	private String inner_code;//部门内部编码
	
	private String strcompleted_date;//竣工日期
	
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date completed_date;
	
	private String location;//坐落位置
	private int index_template_id;

    public int getIndex_template_id() {
        return index_template_id;
    }

    public void setIndex_template_id(int index_template_id) {
        this.index_template_id = index_template_id;
    }

    private float area;//建筑面积
	
	private float study_area;//科研用房面积
	
	private int status;//状态
	
	private int build_id;//建筑typeid
	
	private String structure;//建筑结构
	
	private int aid;
	
	private int active;
	private String coordinate;

	private int backipsdata;

	public String getCoordinate() {
		return coordinate;
	}

	public void setCoordinate(String coordinate) {
		this.coordinate = coordinate;
	}

	private int numberpeople;//人数
	private int project_id;
	private int user_id;

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BuildAttribute{");
		sb.append("id=").append(id);
		sb.append(", bloc_id=").append(bloc_id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", desc='").append(desc).append('\'');
		sb.append(", parent_id=").append(parent_id);
		sb.append(", root_id='").append(root_id).append('\'');
		sb.append(", capacity='").append(capacity).append('\'');
		sb.append(", voltagelevel='").append(voltagelevel).append('\'');
		sb.append(", mainsum=").append(mainsum);
		sb.append(", zgypdgsl=").append(zgypdgsl);
		sb.append(", dypdgsl=").append(dypdgsl);
		sb.append(", starttime='").append(starttime).append('\'');
		sb.append(", create_data=").append(create_data);
		sb.append(", hasChild=").append(hasChild);
		sb.append(", pic='").append(pic).append('\'');
		sb.append(", inner_code='").append(inner_code).append('\'');
		sb.append(", strcompleted_date='").append(strcompleted_date).append('\'');
		sb.append(", completed_date=").append(completed_date);
		sb.append(", location='").append(location).append('\'');
		sb.append(", area=").append(area);
		sb.append(", study_area=").append(study_area);
		sb.append(", status=").append(status);
		sb.append(", build_id=").append(build_id);
		sb.append(", structure='").append(structure).append('\'');
		sb.append(", aid=").append(aid);
		sb.append(", active=").append(active);
		sb.append(", numberpeople=").append(numberpeople);
		sb.append(", project_id=").append(project_id);
		sb.append(", user_id=").append(user_id);
		sb.append(", isactivate=").append(isactivate);
		sb.append('}');
		return sb.toString();
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
	public Double getKtarea() {
		return ktarea;
	}
	public void setKtarea(Double ktarea) {
		this.ktarea = ktarea;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	/**
	 * @return the numberpeople
	 */
	public int getNumberpeople() {
		return numberpeople;
	}

	/**
	 * @param numberpeople the numberpeople to set
	 */
	public void setNumberpeople(int numberpeople) {
		this.numberpeople = numberpeople;
	}

	public String getCapacity() {
		return capacity;
	}
	
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getVoltagelevel() {
		return voltagelevel;
	}

	public void setVoltagelevel(String voltagelevel) {
		this.voltagelevel = voltagelevel;
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

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getCreate_data() {
		return create_data;
	}

	public void setCreate_data(Date create_data) {
		this.create_data = create_data;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public void setaid(int aid) {
		this.aid = aid;
	}
	
	public int getaid() {
		return aid;
	}


	public BuildAttribute() {
		super();
	}

	public BuildAttribute(String name) {
		super();
		this.name = name;
	}

	private int isactivate;
	
	
	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
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


	public String getInner_code() {
		return inner_code;
	}


	public void setInner_code(String inner_code) {
		this.inner_code = inner_code;
	}




	public String getStrcompleted_date() {
		return strcompleted_date;
	}


	public void setStrcompleted_date(String strcompleted_date) {
		this.strcompleted_date = strcompleted_date;
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


	public float getArea() {
		return area;
	}


	public void setArea(float area) {
		this.area = area;
	}


	public float getStudy_area() {
		return study_area;
	}


	public void setStudy_area(float study_area) {
		this.study_area = study_area;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getPic() {
		return pic;
	}


	public void setPic(String pic) {
		this.pic = pic;
	}




	public int getBuild_id() {
		return build_id;
	}


	public void setBuild_id(int buildId) {
		build_id = buildId;
	}


	public String getStructure() {
		return structure;
	}


	public void setStructure(String structure) {
		this.structure = structure;
	}


	public int getIsactivate() {
		return isactivate;
	}


	public void setIsactivate(int isactivate) {
		this.isactivate = isactivate;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public int getBackipsdata() {
		return backipsdata;
	}

	public void setBackipsdata(int backipsdata) {
		this.backipsdata = backipsdata;
	}
}
