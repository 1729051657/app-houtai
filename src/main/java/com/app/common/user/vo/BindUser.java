package com.app.common.user.vo;

import java.util.Date;

public class BindUser {
    private int id;
    private String username;
    private int type;
    private int build_id;
    private String build_name;
    private String bloc_name;
    private int bloc_id;
    private int active;
    private int role_id;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BindUser{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", type=").append(type);
        sb.append(", build_id=").append(build_id);
        sb.append(", build_name='").append(build_name).append('\'');
        sb.append(", bloc_name='").append(bloc_name).append('\'');
        sb.append(", bloc_id=").append(bloc_id);
        sb.append(", active=").append(active);
        sb.append(", role_id=").append(role_id);
        sb.append(", role_name='").append(role_name).append('\'');
        sb.append(", createtime=").append(createtime);
        sb.append('}');
        return sb.toString();
    }

    private String role_name;
    private Date createtime;

    public int getRole_id() {
        return role_id;
    }

    public void setRole_id(int role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getBuild_name() {
        return build_name;
    }

    public void setBuild_name(String build_name) {
        this.build_name = build_name;
    }

    public String getBloc_name() {
        return bloc_name;
    }

    public void setBloc_name(String bloc_name) {
        this.bloc_name = bloc_name;
    }

    public BindUser() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getBuild_id() {
        return build_id;
    }

    public void setBuild_id(int build_id) {
        this.build_id = build_id;
    }

    public int getBloc_id() {
        return bloc_id;
    }

    public void setBloc_id(int bloc_id) {
        this.bloc_id = bloc_id;
    }

    public int getActive() {
        return active;
    }

    public void setActive(int active) {
        this.active = active;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
