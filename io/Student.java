package com.io;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private String branch;
	public Student(int id, String name, String branch) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", branch=" + branch + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getBranch() {
		return branch;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	
}
