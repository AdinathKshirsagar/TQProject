package com.university.model;

public class Course {

	private int cId;
	private String cName;
	private double Cfee;

	public Course() {
		super();
	}

	public Course(int cId, String cName, double cfee) {
		super();
		this.cId = cId;
		this.cName = cName;
		Cfee = cfee;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public double getCfee() {
		return Cfee;
	}

	public void setCfee(double cfee) {
		Cfee = cfee;
	}

	@Override
	public String toString() {
		return "Course Id=" + cId + "Course Name=" + cName + "Course Fee=" + Cfee;
	}

}
