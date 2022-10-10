package assignment1_ct417;

import org.joda.time.*;
import java.util.ArrayList;

public class Course implements UniversityElement{
	String courseName;
	String courseCode;
	ArrayList<Student> listOfStudents;
	ArrayList<Module> listOfModules;
	LocalDate startDate;
	LocalDate endDate;
	
	public Course (String courseName, String courseCode, ArrayList<Student> listOfStudents, ArrayList<Module> listOfModules, LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.listOfStudents = listOfStudents;
		this.listOfModules = listOfModules;
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Course (String courseName, String courseCode,LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.startDate = startDate;
		this.endDate = endDate;
		listOfStudents = new ArrayList<Student>();
		listOfModules = new ArrayList<Module>();
	}
	
	public Course () {
		courseName = "";
		courseCode = "";
		startDate = new LocalDate();
		endDate = new LocalDate();
	}
	
	public void addStudent(Student newStudent) {
		listOfStudents.add(newStudent);
	}
	
	public void removeStudent(Student stu) {
		listOfStudents.remove(stu);
	}
	
	
	public void addModule(Module newMod) {
		listOfModules.add(newMod);
	}
	
	public void removeModule(Module mod) {
		listOfModules.remove(mod);
	}
	
	
	public String getName() {
		return courseName;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public ArrayList<Student> getListOfStudents(){
		return listOfStudents;
	}
	
	public ArrayList<Module> getListOfModules() {
		return listOfModules;
	}
	
	public LocalDate getStartDate() {
		return startDate;
	}
	
	public LocalDate getEndDate() {
		return endDate;
	}
	
	public String toString() {
		String str = "";
		str += "Name: " + getName();
		str += "\nCourse Code: " + getCourseCode();
		str += "\nStart Date: " + getStartDate();
		str += "\nEnd Date: "+getEndDate();
 		str += "\nRelated Modules: ";
		for (int i = 0; i < listOfModules.size(); i++) {
			str += "\n     " + listOfModules.get(i).getName();
		}
		str += "\nEnrolled Students: ";
		for (int i = 0; i < listOfStudents.size(); i++) {
			str += "\n     " + listOfStudents.get(i).getName();
		}
		return str;
	}
}
