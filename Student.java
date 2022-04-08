package org.student;

import org.department.Department;

public class Student extends Department{
	
public void studentName() {
		
		System.out.println("Student Name is Sivani");
		
	}

public void studentDept() {
	
	System.out.println("Student Department is Computer Science");
	
}

public void studentId() {
	
	System.out.println("Student ID is 17859");
	
}

public static void main(String args[]) {
	
	Student st= new Student();
	
	st.collegeCode();
	st.collegeName();
	st.collegeRank();
	st.deptName();
	st.studentDept();
	st.studentId();
	st.studentName();
	
	
}

}
