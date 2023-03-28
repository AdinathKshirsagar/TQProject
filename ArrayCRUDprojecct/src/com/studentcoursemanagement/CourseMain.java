package com.studentcoursemanagement;

import java.util.Scanner;

public class CourseMain {
	static Scanner sc = new Scanner(System.in);
	static int value=0;
	public static void operationPerform()
	{
		System.out.println("Which Operation You Want To Perform ");
		System.out.println("1.Add Course");
		System.out.println("2.Update Course");
		System.out.println("3.View Course");
		System.out.println("4.View Course By Id");
		System.out.println("5.Delete Course");
	}
	public static void addCourse(Course c)
	{
		System.out.println("Enter course Id :");
		c.setCid(sc.nextInt());
		System.out.println("Enter course Name:");
		c.setCName(sc.next());
		System.out.println("Enter fees:");
		c.setFees(sc.nextFloat());
		System.out.println("_____________________");
	}
	public static void updateCourse(Course cr[],int cId) {
		for(int i=0;i<value;i++)
		{
			if(cr[i].getCid()==cId)
			{
				System.out.println(cr[i].getCName()+" "+cr[i].getFees());
				System.out.println("Enter a Course : ");
				String name = sc.next();
				cr[i].setCName(name);
				System.out.println("Enter a Fees : ");
				float fees = sc.nextFloat();
				cr[i].setFees(fees);
				System.out.println("Course update Sucessfully..");
				break;
			}
		}
	}

	public static void deleteCourse(Course[] cour, int cid) {
		boolean flag = false;
		for (int i = 0; i <value; i++) {
			if (cour[i].getCid() == cid) {
				flag = true;
				System.out.println(cour[i].getCid() + " " + cour[i].getCName() + " " + cour[i].getFees());
				for (int j = i; j <value - 1; j++) {
					cour[j] = cour[j + 1];
				}
				cour[value - 1] = null;
				System.out.println("Course " + cid + " delete successfully");
				if (!flag) {
					System.out.println("Course not found");
				}
				break;
			}
		}

	}
	public static void viewCourse(Course ct[]) {
		for (int i = 0; i < value; i++) {
			System.out.println(ct[i]);
		}
	}

	public static void viewCourseByID(Course[] cour, int cid) {
		for (int i = 0; i < value; i++) {
			if (cour[i].getCid() == cid)
				System.out.println(cour[i].toString());
		}
	}
	public static void main(String[] args) {
		
		Course c1[]= new Course[3]; 
		
		int choice=0;
		do
		{
			operationPerform();
			System.out.println("-------Enter Your Choice : --------");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(value<c1.length)
				{
					c1[value]= new Course();
					System.out.println("Add a New Course : ");
					addCourse(c1[value]);
					value++;
					System.out.println("Course Added Sucessfully..");
				}else {
					System.err.println("Oops...You have reach the LIMIT");
				}
				break;
			case 2:
				System.out.println("Enter Course Id to update :");
				int custId = sc.nextInt();
				updateCourse(c1, custId);
				break;
			case 3:
				viewCourse(c1);
				break;
			case 4:
				System.out.println("Enter Id for View Course");
				int courseid=sc.nextInt();
				viewCourseByID(c1,courseid);
				break;
			case 5:
				System.out.println("Enter Id for delete");
				int cid = sc.nextInt();
				deleteCourse(c1, cid);
				break;
			default:
				System.err.println("Wrong Selection...");
			}
			System.out.println("Do you wants to Perform more operation 1-Yes/0-No");
			choice = sc.nextInt();
			
		}while(choice==1);
	}

}
