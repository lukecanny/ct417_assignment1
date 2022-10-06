package assignment_1;

import org.joda.time.*;
import java.util.ArrayList;

public class Course {
	String courseName;
	String courseCode;
	ArrayList<Student> listOfStudents;
	ArrayList<Module> listOfModules;
	LocalDate startDate;
	LocalDate endDate;
	
	Course (String courseName, String courseCode, ArrayList<Student> listOfStudents, ArrayList<Module> listOfModules, LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.listOfStudents = listOfStudents;
		this.listOfModules = listOfModules;
		this.startDate = startDate;
		this.endDate = endDate;
	}
}
