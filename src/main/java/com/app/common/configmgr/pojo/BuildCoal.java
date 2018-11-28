package com.app.common.configmgr.pojo;

public class BuildCoal {

    private int id;
    private int build_id;
    private int emengry_id;
    private double coal_param;

    private String builds;

    public String getBuilds() {
        return builds;
    }

    public void setBuilds(String builds) {
        this.builds = builds;
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

    public int getEmengry_id() {
        return emengry_id;
    }

    public void setEmengry_id(int emengry_id) {
        this.emengry_id = emengry_id;
    }

    public double getCoal_param() {
        return coal_param;
    }

    public void setCoal_param(double coal_param) {
        this.coal_param = coal_param;
    }

    @Override
    public String toString() {
        return "BuildCoal{" +
                "id=" + id +
                ", build_id=" + build_id +
                ", emengry_id=" + emengry_id +
                ", coal_param=" + coal_param +
                '}';
    }
}
