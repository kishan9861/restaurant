package com.lotus.restaurant.dao;

public class RestaurantDao {

	private String name;

	private String branch;

	private String description;

	private Boolean isopen;

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getIsopen() {
		return isopen;
	}

	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}

}
