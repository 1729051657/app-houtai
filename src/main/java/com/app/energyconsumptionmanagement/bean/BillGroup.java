package com.app.energyconsumptionmanagement.bean;

import java.util.Date;

public class BillGroup {
    private int id;
    private int bloc_id;
    private int build_id;
    private String name;
    private int type;
    private int emengry_id;
    private Date recordtime;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getBuild_id() {
        return build_id;
    }

    public void setBuild_id(int build_id) {
        this.build_id = build_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmengry_id() {
        return emengry_id;
    }

    public void setEmengry_id(int emengry_id) {
        this.emengry_id = emengry_id;
    }

    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }

    public BillGroup() {
        super();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BillGroup{");
        sb.append("id=").append(id);
        sb.append(", bloc_id=").append(bloc_id);
        sb.append(", build_id=").append(build_id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", emengry_id=").append(emengry_id);
        sb.append(", recordtime=").append(recordtime);
        sb.append('}');
        return sb.toString();
    }
}
