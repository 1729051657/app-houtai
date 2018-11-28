package com.app.common.user.vo;

import com.nysys.configmgr.pojo.Device;

import java.util.Date;
import java.util.List;

public class UserDevice {
    private int id;
    private int qywx_user_id;
    private int user_id;
    private int build_id;
    private List<Device> devicelist;
    private Date recordtime;

    public int getUser_id() {
        return user_id;
    }

    public List<Device> getDevicelist() {
        return devicelist;
    }

    public void setDevicelist(List<Device> devicelist) {
        this.devicelist = devicelist;
    }


    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public UserDevice(int qywx_user_id) {
        this.qywx_user_id = qywx_user_id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UserDevice{");
        sb.append("id=").append(id);
        sb.append(", qywx_user_id=").append(qywx_user_id);
        sb.append(", user_id=").append(user_id);
        sb.append(", build_id=").append(build_id);
        sb.append(", devicelist=").append(devicelist);
        sb.append(", recordtime=").append(recordtime);
        sb.append('}');
        return sb.toString();
    }

    public UserDevice() {
        super();
    }

    public int getQywx_user_id() {
        return qywx_user_id;
    }

    public void setQywx_user_id(int qywx_user_id) {
        this.qywx_user_id = qywx_user_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBuild_id() {
        return build_id;
    }

    public void setBuild_id(int build_id) {
        this.build_id = build_id;
    }
    public Date getRecordtime() {
        return recordtime;
    }

    public void setRecordtime(Date recordtime) {
        this.recordtime = recordtime;
    }
}
