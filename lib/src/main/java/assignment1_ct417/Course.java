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
	
	/* Course created with the following parameters
	 * Course name, course code, list of modules, start date and end date.
	 * 
	 * Constructor adds itself to list of associated courses of each module.
	 */
	public Course (String courseName, String courseCode, ArrayList<Module> listOfModules, LocalDate startDate, LocalDate endDate){
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.listOfModules = listOfModules;
		this.listOfStudents = new ArrayList<Student>();
		for (int i = 0; i < listOfModules.size(); i++) {
			((Module)listOfModules.get(i)).addCourse(this);
		}
		this.startDate = startDate;
		this.endDate = endDate;
	}
	
	public Course () {
		courseName = "";
		courseCode = "";
		startDate = new LocalDate();
		endDate = new LocalDate();
	}
	
	public ArrayList<Module> enroll(Student student) {
		listOfStudents.add(student);
		for (int i = 0; i < listOfModules.size(); i++) {
			listOfModules.get(i).addStudent(student);
		}
		return listOfModules;
	}
	
	public ArrayList<Module> disenroll(Student student) {
		listOfStudents.remove(student);
		for (int i = 0; i < listOfModules.size(); i++) {
			listOfModules.get(i).removeStudent(student);
		}
		return listOfModules;
	}
	
	public void addModule(Module module) {
		module.addCourse(this);
		listOfModules.add(module);
		for (int i = 0; i < listOfStudents.size(); i++) {
			listOfStudents.get(i).addModule(module);
		}
	}
	
	public void removeModule(Module module) {
		module.removeCourse(this);
		listOfModules.remove(module);
		for (int i = 0; i < listOfStudents.size(); i++) {
			listOfStudents.get(i).removeModule(module);
		}
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
