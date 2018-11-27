package com.app.energyconsumptionmanagement.bean;

public class Files {
	private String src;
	private String name;
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Files [src=" + src + ", name=" + name + "]";
	}
	public Files(String src, String name) {
		super();
		this.src = src;
		this.name = name;
	}
	public Files() {
		super();
		// TODO Auto-generated constructor stub
	}
}
