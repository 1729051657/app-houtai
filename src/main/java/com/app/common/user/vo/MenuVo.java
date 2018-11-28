package com.app.common.user.vo;

public class MenuVo {
	
	private String path;
	private String component;
	private String name;
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	/**
	 * @return the component
	 */
	public String getComponent() {
		return component;
	}
	/**
	 * @param component the component to set
	 */
	public void setComponent(String component) {
		this.component = component;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MenuVo [path=" + path + ", component=" + component + ", name=" + name + "]";
	}
	public MenuVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
