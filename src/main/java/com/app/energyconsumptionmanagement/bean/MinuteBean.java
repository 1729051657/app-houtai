package com.app.energyconsumptionmanagement.bean;

import java.util.Date;

public class MinuteBean {
    private int id;
    private float value;
    private String status;//null
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private String combine_name;
    private Date gather_time;
    private String type;//AX
    private int station_id;//0
    private int bloc_id;
    private int build_id;
    private int area_id;
    private int area_rootid;
    private String scope_stat;
    private int category_type;
    private int level;
    private int counttype;//1
    private int counted;//0
    private int emengry_id;
    private float net_value;
    private float init_value;
    private int is_statistic;//0
    private Date recordtime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MinuteBean{");
        sb.append("id=").append(id);
        sb.append(", value=").append(value);
        sb.append(", status='").append(status).append('\'');
        sb.append(", combine_name='").append(combine_name).append('\'');
        sb.append(", gather_time=").append(gather_time);
        sb.append(", type='").append(type).append('\'');
        sb.append(", station_id=").append(station_id);
        sb.append(", bloc_id=").append(bloc_id);
        sb.append(", build_id=").append(build_id);
        sb.append(", area_id=").append(area_id);
        sb.append(", area_rootid=").append(area_rootid);
        sb.append(", scope_stat='").append(scope_stat).append('\'');
        sb.append(", category_type=").append(category_type);
        sb.append(", level=").append(level);
        sb.append(", counttype=").append(counttype);
        sb.append(", counted=").append(counted);
        sb.append(", emengry_id=").append(emengry_id);
        sb.append(", net_value=").append(net_value);
        sb.append(", init_value=").append(init_value);
        sb.append(", is_statistic=").append(is_statistic);
        sb.append(", recordtime=").append(recordtime);
        sb.append('}');
        return sb.toString();
    }

    public void setValue(float value) {
        this.value = value;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCombine_name() {
        return combine_name;
    }

    public void setCombine_name(String combine_name) {
        this.combine_name = combine_name;
    }

    public Date getGather_time() {
        return gather_time;
    }

    public void setGather_time(Date gather_time) {
        this.gather_time = gather_time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStation_id() {
        return station_id;
    }

    public void setStation_id(int station_id) {
        this.station_id = station_id;
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

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public int getArea_rootid() {
        return area_rootid;
    }

    public void setArea_rootid(int area_rootid) {
        this.area_rootid = area_rootid;
    }

    public String getScope_stat() {
        return scope_stat;
    }

    public void setScope_stat(String scope_stat) {
        this.scope_stat = scope_stat;
    }

    public int getCategory_type() {
        return category_type;
    }

    public void setCategory_type(int category_type) {
        this.category_type = category_type;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getCounttype() {
        return counttype;
    }

    public void setCounttype(int counttype) {
        this.counttype = counttype;
    }

    public int getCounted() {
        return counted;
    }

    public void setCounted(int counted) {
        this.counted = counted;
    }

    public int getEmengry_id() {
        return emengry_id;
    }

    public void setEmengry_id(int emengry_id) {
        this.emengry_id = emengry_id;
    }

    public float getNet_value() {
        return net_value;
    }

    public void setNet_value(float net_value) {
        this.net_value = net_value;
    }

    public float getInit_value() {
        return init_value;
    }

    public void setInit_value(float init_value) {
        this.init_value = init_value;
    }

    public int getIs_statistic() {
        return is_statistic;
    }

    public void setIs_statistic(int is_statistic) {
        this.is_statistic = is_statistic;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}
