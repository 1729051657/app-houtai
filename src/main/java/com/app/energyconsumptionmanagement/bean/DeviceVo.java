package com.app.energyconsumptionmanagement.bean;

public class DeviceVo {

	private String id;

	private String name;

	private int parent_id;

	private String inner_id;

	private int intelligent;

	private int bloc_id;

	private int area_id;
	private String area_name;

	private int comm_build;

	private int ptype;
	private int is_md;
	private int is_virtual;
	private String imgurl;

	public String getImgurl() {
		return imgurl;
	}


	public String getArea_name() {
		return area_name;
	}

	public void setArea_name(String area_name) {
		this.area_name = area_name;
	}

	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}

	public int getIs_virtual() {
		return is_virtual;
	}

	public void setIs_virtual(int is_virtual) {
		this.is_virtual = is_virtual;
	}

	public int getIs_md() {
		return is_md;
	}

	public void setIs_md(int is_md) {
		this.is_md = is_md;
	}
	private Integer emphasis;

	private String device_name;

	private int level;

	private int category_type_id;

	private String category_type_name;

	private int emengry_id;

	private String emengry_name;

	private Float rate;//倍率

	private int isbalance;

	private String old_desc;

	private String typename;

	private String dctname;

	private String desc;

	private int department_id;

	private String state;

	private String areaname;

	private String blocname;

	private String buildname;

	private int type_id;
	private String type_name;

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}

	private int user_id;

	public int getParent_id() {
		return parent_id;
	}

	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}

	public String getCategory_type_name() {
		return category_type_name;
	}

	public void setCategory_type_name(String category_type_name) {
		this.category_type_name = category_type_name;
	}

	public String getEmengry_name() {
		return emengry_name;
	}

	public void setEmengry_name(String emengry_name) {
		this.emengry_name = emengry_name;
	}

	public DeviceVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeviceVo(int bloc_id, int comm_build) {
		super();
		this.bloc_id = bloc_id;
		this.comm_build = comm_build;
	}

	public DeviceVo(int bloc_id, int comm_build, int is_md) {
		this.bloc_id = bloc_id;
		this.comm_build = comm_build;
		this.is_md = is_md;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getDctname() {
		return dctname;
	}

	public void setDctname(String dctname) {
		this.dctname = dctname;
	}

	public String getTypename() {
		return typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getOld_desc() {
		return old_desc;
	}

	public void setOld_desc(String old_desc) {
		this.old_desc = old_desc;
	}

	public int getIsbalance() {
		return isbalance;
	}

	public void setIsbalance(int isbalance) {
		this.isbalance = isbalance;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public int getEmengry_id() {
		return emengry_id;
	}

	public void setEmengry_id(int emengry_id) {
		this.emengry_id = emengry_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public int getIntelligent() {
		return intelligent;
	}

	public void setIntelligent(int intelligent) {
		this.intelligent = intelligent;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAreaname() {
		return areaname;
	}

	public void setAreaname(String areaname) {
		this.areaname = areaname;
	}

	public String getBlocname() {
		return blocname;
	}

	public void setBlocname(String blocname) {
		this.blocname = blocname;
	}

	public String getBuildname() {
		return buildname;
	}

	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInner_id() {
		return inner_id;
	}

	public void setInner_id(String inner_id) {
		this.inner_id = inner_id;
	}

	public int getBloc_id() {
		return bloc_id;
	}

	public void setBloc_id(int bloc_id) {
		this.bloc_id = bloc_id;
	}

	public int getComm_build() {
		return comm_build;
	}

	public void setComm_build(int comm_build) {
		this.comm_build = comm_build;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getCategory_type_id() {
		return category_type_id;
	}

	public void setCategory_type_id(int category_type_id) {
		this.category_type_id = category_type_id;
	}

	public int getPtype() {
		return ptype;
	}

	public void setPtype(int ptype) {
		this.ptype = ptype;
	}

	public Integer getEmphasis() {
		return emphasis;
	}

	public void setEmphasis(Integer emphasis) {
		this.emphasis = emphasis;
	}

	public String getDevice_name() {
		return device_name;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}

	public int getArea_id() {
		return area_id;
	}

	public void setArea_id(int area_id) {
		this.area_id = area_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	@Override
	public String toString() {
		return "DeviceVo{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", parent_id=" + parent_id +
				", inner_id='" + inner_id + '\'' +
				", intelligent=" + intelligent +
				", bloc_id=" + bloc_id +
				", area_id=" + area_id +
				", comm_build=" + comm_build +
				", ptype=" + ptype +
				", emphasis=" + emphasis +
				", device_name='" + device_name + '\'' +
				", level=" + level +
				", category_type_id=" + category_type_id +
				", category_type_name='" + category_type_name + '\'' +
				", emengry_id=" + emengry_id +
				", emengry_name='" + emengry_name + '\'' +
				", rate=" + rate +
				", isbalance=" + isbalance +
				", old_desc='" + old_desc + '\'' +
				", typename='" + typename + '\'' +
				", dctname='" + dctname + '\'' +
				", desc='" + desc + '\'' +
				", department_id=" + department_id +
				", state='" + state + '\'' +
				", areaname='" + areaname + '\'' +
				", blocname='" + blocname + '\'' +
				", buildname='" + buildname + '\'' +
				", type_id=" + type_id +
				", type_name='" + type_name + '\'' +
				", user_id=" + user_id +
				'}';
	}
}
