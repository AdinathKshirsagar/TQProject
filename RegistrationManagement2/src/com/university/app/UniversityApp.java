package com.university.app;

import java.util.Scanner;

import com.university.dao.StudentDao;
import com.university.doaimpl.StudentDaoImpl;
import com.university.model.Course;
import com.university.model.Student;
import com.university.model.University;

public class UniversityApp {
	static Scanner sc = new Scanner(System.in);

	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1. Add student");
		System.out.println("2. Delete Student");
		System.out.println("3. Update Student");
		System.out.println("4. Search Student By Student Id");
		System.out.println("5. Display all the students");
		System.out.println("6. Display Student by course");
		System.out.println("0.Exit");

	}

	public static void main(String[] args) {

		System.out.println("================Welcome to University===================");
		System.out.println("Registration Id:" + University.getUid());
		System.out.println("Name:" + University.getUname());
		System.out.println("=============================================================");

		University uni = new University();

		StudentDao st = new StudentDaoImpl();

		int id = 0;
		int choice;
		do {
			menu();
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student ss = new Student();
				Course cs = new Course();
				System.out.println("Enter id:");
				ss.setSid(sc.nextInt());

				System.out.println("Enter student name:");
				ss.setName(sc.next());

				System.out.println("Enter 12th standard percentage:");
				ss.setSpercent(sc.nextDouble());

				/*
				 * System.out.println("----------------------------------------");
				 * System.out.print("Enter Course ID: "); cs.setcId(sc.nextInt());
				 * System.out.print("Enter Course Name: "); cs.setcName(sc.next());
				 * System.out.print("Enter Course Fee: "); cs.setCfee(sc.nextDouble());
				 * System.out.println("Courses available");
				 */
				for (Course c : uni.getCs()) {
					System.out.println(c);
				}

				System.out.println("----------------------------------------");

				System.out.println("Enter the course id you want to apply:");
				id = sc.nextInt();
				for (Course c : uni.getCs()) {
					if (id == c.getcId()) {
						ss.setCourse(c);
					}
				}

				st.addStudent(uni, ss, cs);
				break;

			case 2:
				st.deleteStudent(uni, id);
				break;
			case 3:
				st.updateStudent(uni, id);
				break;
			case 4:
				st.viewStudentBy(uni, id);
			case 5:
				st.displayAllStudent(uni);
				break;

			}

			System.out.println("Do you want to perform more operations(1-yes/0-no)");
			choice = sc.nextInt();

		} while (choice != 0);

	}

}
