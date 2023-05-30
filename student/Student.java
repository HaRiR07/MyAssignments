package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Hari Prakash");
	}
	public void studentDept() {
		System.out.println("IT");
	}
	public void studentId() {
		System.out.println("913218114006");
	}
	public static void main(String[] args) {
		Student std = new Student();
		std.collegeName();
		std.collegeCode();
		std.collegeRank();
		std.deptName();
		std.studentName();
		std.studentDept();
		std.studentId();
		
	}

}
