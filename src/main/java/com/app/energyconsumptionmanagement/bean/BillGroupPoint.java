package com.app.energyconsumptionmanagement.bean;

import java.util.Date;

public class BillGroupPoint {
    private int id;
    private int bill_group_id;
    private String combine_name;
    private String desc;
    private String inner_id;
    private String remark;
    private String hostval;
    private Date recordtime;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BillGroupPoint{");
        sb.append("id=").append(id);
        sb.append(", bill_group_id=").append(bill_group_id);
        sb.append(", combine_name='").append(combine_name).append('\'');
        sb.append(", desc='").append(desc).append('\'');
        sb.append(", inner_id='").append(inner_id).append('\'');
        sb.append(", remark='").append(remark).append('\'');
        sb.append(", hostval='").append(hostval).append('\'');
        sb.append(", recordtime=").append(recordtime);
        sb.append('}');
        return sb.toString();
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

    public String getHostval() {
        return hostval;
    }

    public void setHostval(String hostval) {
        this.hostval = hostval;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBill_group_id() {
        return bill_group_id;
    }

    public void setBill_group_id(int bill_group_id) {
        this.bill_group_id = bill_group_id;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public BillGroupPoint() {
        super();
    }
}
