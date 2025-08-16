package StudentReg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//You must implement the logic inside these methods.


public class StudentRegistry {
	
	private List<String> enrolledStudents;
	private Set<String> uniqueCourses;
	private Map<String, Integer> studentGrades;
	
	public StudentRegistry() {
		enrolledStudents = new ArrayList<>();
		uniqueCourses = new HashSet<>();
		studentGrades = new HashMap<>();
	}


 // Task 1: Use a List to store the names of enrolled students.
 public void enrollStudent(String studentName) {
	 enrolledStudents.add(studentName);
     // TODO: Add the student's name to the list of enrolled students.
 }

 public List<String> getEnrolledStudents() {
     // TODO: Return the list of all enrolled students.
     return enrolledStudents;
 }

 // Task 2: Use a Set to store unique course names offered by the bootcamp.
 public void registerCourse(String courseName) {
     // TODO: Add a new, unique course name to the set of available courses.
	 uniqueCourses.add(courseName);
 }

 public Set<String> getUniqueCourses() {
     // TODO: Return the set of all unique courses.
     return uniqueCourses;
 }

 // Task 3: Use a Map to associate each student with their final grade.
 public void assignGrade(String studentName, int grade) {
	 studentGrades.put(studentName, grade);
     // TODO: Map the student's name to their assigned grade.
     // Assume the student is already enrolled.
 }

 public int getStudentGrade(String studentName) {
     // TODO: Return the grade for a specific student.
     // If the student has no grade, return -1.
     return studentGrades.getOrDefault(studentName, -1);
 }
 
 public static void main(String[] args) {
	 StudentRegistry registry = new StudentRegistry();
	 
	 registry.enrollStudent("Suman");
	 registry.enrollStudent("Shekhar");
	 registry.enrollStudent("Jena");
	 
	 System.out.println("Enrolled Students: " + registry.getEnrolledStudents());
	 
	 registry.registerCourse("Java 101");
	 registry.registerCourse("data Structure");
	 registry.registerCourse("Java 101");
	 System.out.println("Unique Courses : " + registry.getUniqueCourses());
	 
	 registry.assignGrade("Suman", 93);
	 registry.assignGrade("Shekhar", 80);
	 
	 System.out.println("Suman's Grade :" + registry.getStudentGrade("Suman"));
	 System.out.println("Shekhar's Grade :" + registry.getStudentGrade("Shekhar"));
	 System.out.println("Jena's Grade :" + registry.getStudentGrade("Jena"));
	 
	 
 }
}

