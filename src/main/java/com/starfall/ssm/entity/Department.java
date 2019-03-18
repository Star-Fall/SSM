package com.starfall.ssm.entity;

/**
 * @name:Department
 * @description: Department
 * @author: StarFall
 * @data: 2019年3月18日下午9:09:58
 */
public class Department {
	private Integer departmentId;

	private String departmentName;

	private Integer managerId;

	private Integer locationId;

	public Integer getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName == null ? null : departmentName.trim();
	}

	public Integer getManagerId() {
		return managerId;
	}

	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}

	public Integer getLocationId() {
		return locationId;
	}

	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
}