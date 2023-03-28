package com.studentcoursemanagement;

public class Course {
	private int cid;
	private String cName;
	private float fees;
	public Course()
	{
		
	}
	public Course(int cid,String cName,float fees)
	{
		this.cid=cid;
		this.cName=cName;
		this.fees=fees;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCName() {
		return cName;
	}
	public void setCName(String cName) {
		this.cName = cName;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}

	public String toString() {
		return "Course id : " + cid + ", Course Name=" + cName + ", fees=" + fees ;
	}
	
}
