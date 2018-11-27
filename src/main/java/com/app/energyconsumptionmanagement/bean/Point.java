package com.app.energyconsumptionmanagement.bean;

import java.util.Date;

public class Point {
    private int id;
    private int type;
    private int buildid;
    private int rmid;
    private String combine_name;
    private Date recordtime;
    private int next_node_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getBuildid() {
        return buildid;
    }

    public void setBuildid(int buildid) {
        this.buildid = buildid;
    }

    public int getRmid() {
        return rmid;
    }

    public void setRmid(int rmid) {
        this.rmid = rmid;
    }

    public String getCombine_name() {
        return combine_name;
    }

    public void setCombine_name(String combine_name) {
        this.combine_name = combine_name;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public int getNext_node_id() {
        return next_node_id;
    }

    public void setNext_node_id(int next_node_id) {
        this.next_node_id = next_node_id;
    }
}
