package com.studentcoursemanagement;


public class Student {
	private int sid;
	private String sName;
	private int sAge;
	private Course course;
	public Student()
	{
		
	}
	public Student(int sid, String sName,int sAge,Course course)
	{
		this.sid=sid;
		this.sName=sName;
		this.sAge=sAge;
		this.course=course;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course=course;
	}
	@Override
	public String toString() {
		return "Student id=" + sid + ", Student Name=" + sName + ", Student Age=" + sAge + ", \ncourse=" + course;
	}
	
	
	
	
}
