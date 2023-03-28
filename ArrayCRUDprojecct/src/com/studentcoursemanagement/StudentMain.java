package com.studentcoursemanagement;

import java.util.Scanner;

public class StudentMain {
	static Scanner sc = new Scanner(System.in);
	static int value=0;
	static int choice=0;
	public static void operationPerformStudent()
	{
		System.out.println("Which Operation You Want To Perform ");
		System.out.println("1.Add Student");
		System.out.println("2.Update Student");
		System.out.println("3.View Students");
		System.out.println("4.View Student By Id");
		System.out.println("5.Delete Student");
	}
	public static void addStudent(Student st)
	{
		System.out.println("Enter Student Id :");
		st.setSid(sc.nextInt());
		System.out.println("Enter Student Name:");
		st.setsName(sc.next());
		System.out.println("Enter Age :");
		st.setsAge(sc.nextInt());
		System.out.println("_____________________");
		
		/*System.out.println("Enter course Details ");
		addCourse();
		System.out.println("_____________________");*/
	}
	public static void updateStudent(Student st[],int sId) {
		for(int i=0;i<value;i++)
		{
			if(st[i].getSid()==sId)
			{
				System.out.println(st[i].getsName()+" "+st[i].getsAge());
				System.out.println("Enter a Student : ");
				String name = sc.next();
				st[i].setsName(name);
				System.out.println("Enter a Age : ");
				int Age = sc.nextInt();
				st[i].setsAge(Age);
				System.out.println("Student update Sucessfully..");
				break;
			}
		}
	}

	public static void deleteStudent(Student[] stud, int sid) {
		boolean flag = false;
		for (int i = 0; i <value; i++) {
			if (stud[i].getSid() == sid) {
				flag = true;
				System.out.println(stud[i].getSid() + " " + stud[i].getsName() + " " + stud[i].getsAge());
				for (int j = i; j <value - 1; j++) {
					stud[j] = stud[j + 1];
				}
				stud[value - 1] = null;
				System.out.println("Student " + sid + " delete successfully");
				if (!flag) {
					System.out.println("Student not found");
				}
				break;
			}
		}

	}
	public static void viewStudent(Student st[]) {
		for (int i = 0; i < value; i++) {
			System.out.println(st[i]);
		}
	}

	public static void viewStudentByID(Student[] stud, int sid) {
		for (int i = 0; i < value; i++) {
			if (stud[i].getSid() == sid)
				System.out.println(stud[i].toString());
		}
	}
	
	public static void main(String[] args) {
		
		Student stud[] = new Student[5];
		
		do
		{
			operationPerformStudent();
			System.out.println("-------Enter Your Choice : --------");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				if(value<stud.length)
				{
					stud[value]= new Student();
					System.out.println("Add a New Student : ");
					addStudent(stud[value]);
					value++;
					System.out.println("Student Added Sucessfully..");
				}else {
					System.err.println("Oops...You have reach the LIMIT");
				}
				break;
			case 2:
				System.out.println("Enter Student Id to update :");
				int studId = sc.nextInt();
				updateStudent(stud, studId);
				break;
			case 3:
				viewStudent(stud);
				break;
			case 4:
				System.out.println("Enter Id for View Student");
				int studentid=sc.nextInt();
				viewStudentByID(stud, studentid);
				break;
			case 5:
				System.out.println("Enter Id for delete");
				int sid = sc.nextInt();
				deleteStudent(stud, sid);
				break;
			default:
				System.err.println("Wrong Selection...");
			}
			System.out.println("Do you wants to Perform more operation 1-Yes/0-No");
			choice = sc.nextInt();
			
		}while(choice==1);
		
	}

}
