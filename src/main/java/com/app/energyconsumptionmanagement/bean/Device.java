package com.app.energyconsumptionmanagement.bean;

public class Device {

	private int qywx_user_id;
	
	private String buildname;

	private int deviceid;

	private int id;

	private int root_id;

	private int parent_id;
	
	private String name;//设备名称

	private String desc;//设备描述
	
	private String inner_id;//企业内部设备编号
	
	private Float rate;//倍率
	
	private int intelligent;//是否自动读取数据

	public int getQywx_user_id() {
		return qywx_user_id;
	}

	public void setQywx_user_id(int qywx_user_id) {
		this.qywx_user_id = qywx_user_id;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Device{");
		sb.append("buildname='").append(buildname).append('\'');
		sb.append(", id=").append(id);
		sb.append(", root_id=").append(root_id);
		sb.append(", parent_id=").append(parent_id);
		sb.append(", name='").append(name).append('\'');
		sb.append(", desc='").append(desc).append('\'');
		sb.append(", inner_id='").append(inner_id).append('\'');
		sb.append(", rate=").append(rate);
		sb.append(", intelligent=").append(intelligent);
		sb.append(", bloc_id=").append(bloc_id);
		sb.append(", area_id=").append(area_id);
		sb.append(", department_id=").append(department_id);
		sb.append(", type_id=").append(type_id);
		sb.append(", category_type_id=").append(category_type_id);
		sb.append(", emengry_id=").append(emengry_id);
		sb.append(", station_id=").append(station_id);
		sb.append(", level=").append(level);
		sb.append(", savetype=").append(savetype);
		sb.append(", emphasis=").append(emphasis);
		sb.append(", statistic_point_name='").append(statistic_point_name).append('\'');
		sb.append(", isbalance=").append(isbalance);
		sb.append(", hasChild=").append(hasChild);
		sb.append(", orderstr='").append(orderstr).append('\'');
		sb.append(", old_desc='").append(old_desc).append('\'');
		sb.append(", comm_build=").append(comm_build);
		sb.append(", user_id=").append(user_id);
		sb.append(", area_rootid=").append(area_rootid);
		sb.append(", is_md=").append(is_md);
		sb.append('}');
		return sb.toString();
	}

	private int bloc_id;
	
	private int area_id;
	
	private int department_id;
	
	private int type_id;
	
	private int category_type_id;
	
	private int emengry_id;
	
	private int station_id;

	private int level;
	
	private int savetype;//保存类型
	
	private Integer emphasis;//是否重大设备
	
	private String statistic_point_name;
	
	private int isbalance;
	
	private int hasChild;
	
	private String orderstr;
	
	private String old_desc;
	
	private int comm_build;
	
	private int user_id;
	
	private int area_rootid;
	private int is_md;

	public int getIs_md() {
		return is_md;
	}

	public void setIs_md(int is_md) {
		this.is_md = is_md;
	}

	public int getArea_rootid() {
		return area_rootid;
	}

	public void setArea_rootid(int area_rootid) {
		this.area_rootid = area_rootid;
	}

	public Device(String name) {
		this.name = name;
	}

	public Device() {
		super();

	}

	public Device(String buildname, int root_id, String name, String desc, int area_id, int category_type_id, int emengry_id, int level, int area_rootid) {
		this.buildname = buildname;
		this.root_id = root_id;
		this.name = name;
		this.desc = desc;
		this.area_id = area_id;
		this.category_type_id = category_type_id;
		this.emengry_id = emengry_id;
		this.level = level;
		this.area_rootid = area_rootid;
	}

	public Device(int bloc_id) {
		super();
		this.bloc_id = bloc_id;
	}
	
	public String getBuildname() {
		return buildname;
	}

	public Device(int bloc_id, int comm_build) {
		super();
		this.bloc_id = bloc_id;
		this.comm_build = comm_build;
	}

	public void setBuildname(String buildname) {
		this.buildname = buildname;
	}
	
	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getOld_desc() {
		return old_desc;
	}

	public void setOld_desc(String old_desc) {
		this.old_desc = old_desc;
	}

	public int getComm_build() {
		return comm_build;
	}

	public void setComm_build(int comm_build) {
		this.comm_build = comm_build;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getInner_id() {
		return inner_id;
	}

	public void setInner_id(String inner_id) {
		this.inner_id = inner_id;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public int getIntelligent() {
		return intelligent;
	}

	public void setIntelligent(int intelligent) {
		this.intelligent = intelligent;
	}

	
	public int getBloc_id() {
		return bloc_id;
	}

	public void setBloc_id(int blocId) {
		bloc_id = blocId;
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

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public int getCategory_type_id() {
		return category_type_id;
	}

	public void setCategory_type_id(int category_type_id) {
		this.category_type_id = category_type_id;
	}

	public int getEmengry_id() {
		return emengry_id;
	}

	public void setEmengry_id(int emengry_id) {
		this.emengry_id = emengry_id;
	}

	public int getStation_id() {
		return station_id;
	}

	public void setStation_id(int station_id) {
		this.station_id = station_id;
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

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getSavetype() {
		return savetype;
	}

	public void setSavetype(int savetype) {
		this.savetype = savetype;
	}
	
	public Integer getEmphasis() {
		return emphasis;
	}

	public void setEmphasis(Integer emphasis) {
		this.emphasis = emphasis;
	}

	public String getStatistic_point_name() {
		return statistic_point_name;
	}

	public void setStatistic_point_name(String statistic_point_name) {
		this.statistic_point_name = statistic_point_name;
	}

	public int getIsbalance() {
		return isbalance;
	}

	public void setIsbalance(int isbalance) {
		this.isbalance = isbalance;
	}

	public String getOrderstr() {
		return orderstr;
	}

	public void setOrderstr(String orderstr) {
		this.orderstr = orderstr;
	}

	public int getHasChild() {
		return hasChild;
	}

	public void setHasChild(int hasChild) {
		this.hasChild = hasChild;
	}

	public int getDeviceid() {
		return deviceid;
	}

	public void setDeviceid(int deviceid) {
		this.deviceid = deviceid;
	}
}
