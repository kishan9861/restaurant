package com.lotus.restaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Restaurant")
public class RestaurantEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "rst_name")
	private String name;

	@Column(name = "rst_branch")
	private String branch;

	@Column(name = "description")
	private String description;

	@Column(name = "isopen")
	private Boolean isopen;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public String getDescription() {
		return description;
	}

	public Boolean getIsopen() {
		return isopen;
	}

	public void setId(long id) {
		this.id = id;
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

	public void setIsopen(Boolean isopen) {
		this.isopen = isopen;
	}

}
