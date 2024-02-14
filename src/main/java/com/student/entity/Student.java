package com.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	int roll;
	String name;
	String branch;
	int yop;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int roll, String name, String branch, int yop) {
		super();
		this.roll = roll;
		this.name = name;
		this.branch = branch;
		this.yop = yop;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getYop() {
		return yop;
	}
	public void setYop(int yop) {
		this.yop = yop;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", branch=" + branch + ", yop=" + yop + "]";
	}
	

}


