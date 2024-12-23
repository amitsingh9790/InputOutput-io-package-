package com.io;
import java.io.Serializable;

public class Employee implements Serializable {

	private int empId;
	private String name;
	private String department;
	private String empType;

	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", department=" + department + ", empType=" + empType
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getEmpType() {
		return empType;
	}

}

