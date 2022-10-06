package assignment1_ct417;

import org.joda.time.*;
import java.util.ArrayList;

public class Course {
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
	
	public String getCourseName() {
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
}
