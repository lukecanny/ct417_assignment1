package assignment1_ct417;

import java.util.ArrayList;

import org.joda.time.*;
/* The Student class is responsible for storing all information relating to an individual student. 
 * This includes name, date of birth, student id, course enrolled to and modules registered for.
 * @author Luke Canny 19339166
 * @date 11-10-22
 */
public class Student implements UniversityElement {
	
	String name;					// Student's Name
	int id;							// Student ID
	LocalDate dob;					// Student Date of Birth
	static int lastIdUsed = 0;		// Static integer storing last student ID number dispensed
	String courseCode = "";			// Code of course that student is enrolled for
	ArrayList<Module> listOfModules = new ArrayList<Module>();	// List of modules student attends (assigned when student enrolls to a course)
	Course course;					// Course 
	
	// Constructor takes student name and date of birth as parameters. enroll method used after student instanciation to add course/modules/coursecode
	public Student (String name, LocalDate dob){
		id = ++lastIdUsed;
		this.name = name;
		this.dob = dob;
	}
	
	// Enroll method takes param Course; assigns values to course, courseCode and listOfModules
	public void enroll(Course course) {
		this.course = course;
		courseCode = course.getCourseCode();
		listOfModules = course.enroll(this);
	}
	
	// Disenroll method achieves opposite of enroll method. 
	public void disenroll() {
		if (course != null) {
			courseCode = "";
			listOfModules = course.disenroll(this);
			course = null;
		}
	}

	// Username is first 5 characters of name plus age.
	public String getUsername() {
		return name.replaceAll(" ", "").substring(0,5) + getAge();
	}
	
	// Age is calculated using years between method from Joda-Time
	public int getAge() {
		LocalDate currentDate = new LocalDate();
	    Years age = Years.yearsBetween(dob,currentDate);
	    return age.getYears();
	}
	
	// Returns date of birth
	public LocalDate getDateOfBirth() {
		return dob;
	}
	
	// Sets date of birth
	public void setDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}
	
	// Returns student's ID
	public int getID() {
		return id;
	}
	
	// Sets student's ID
	public void setID(int id) {
		this.id = id;
	}
	
	// Returns student's name
	public String getName() {
		return name;
	}
	
	// Sets student's Name
	public void setName(String name) {
		this.name = name;
	}
	
	// Returns course code
	public String getCourseCode() {
		return courseCode;
	}
	
	// Sets course code
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	// Adds module to list of modules 
	public void addModule(Module mod) {
		listOfModules.add(mod);
	}
	
	// Adds multiple modules to list of modules
	public void addModules(ArrayList<Module> mods) {
		for (int i = 0; i < mods.size(); i++) {
			listOfModules.add(mods.get(i));
		}
	}
	
	// Removes a module
	public void removeModule(Module mod) {
		listOfModules.remove(mod);
	}
	
	// Sets list of modules
	public void setListOfModules(ArrayList<Module> listOfModules) {
		this.listOfModules = listOfModules;
	}
	
	// Returns list of modules
	public ArrayList<Module> getListOfModules(){
		return listOfModules;
	}
	
	// Overrides toString() method inherited from Object class.
	@Override
	public String toString() {
		String str = "";
		str += "Name: " + getName();
		str += "\nUsername: " + getUsername();
		str += "\nID: " + getID();
		str += "\nCourse: " + getCourseCode();
		str += "\nDate of Birth: " + dob.toString();
		str += "\nAge: " + getAge();
 		str += "\nModules: ";
		for (int i = 0; i < listOfModules.size(); i++) {
			str += "\n     " + listOfModules.get(i).getName();
		}
		return str;
	}
}
