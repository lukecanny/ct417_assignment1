package assignment1_ct417;

import java.util.ArrayList;
/* The Module class is responsible for storing all information relating to an individual module. 
 * This includes name, code, lecturer responsible for teaching the module, list of courses that 
 * the module is assosciated with and list of students enrolled to attend the module.
 * @author Luke Canny 19339166
 * @date 11-10-22
 */

public class Module implements UniversityElement{
	Lecturer lecturer;
	String moduleName;
	String moduleCode;
	ArrayList<Course> associatedCourses;
	ArrayList<Student> listOfStudents;
	
	// Constructor takes lecturer object, string for name and string for module code as parameters
	public Module(Lecturer lecturer, String moduleName, String moduleCode){
		this.lecturer= lecturer;
		this.moduleName = moduleName;
		this.moduleCode = moduleCode;
		lecturer.addModule(this);	// Pass this module to the Lecturer object (Lecturer object stores modules responsible for teaching)
		associatedCourses = new ArrayList<Course>();
		listOfStudents = new ArrayList<Student>();
	}
	
	// Add associated course to associatedCourses arraylist.
	public int addCourse(Course course) {
		try {
			associatedCourses.add(course);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	
	// Remove an associated course from the associatedCourses arraylist.
	public int removeCourse(Course course) {
		try {
			associatedCourses.remove(course);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	
	// Adds (registers) a student to the list of students arrayList.
	public int addStudent(Student student) {
		try {
			listOfStudents.add(student);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	
	// Removes a student from the list of students arraylist.
	public int removeStudent(Student student) {
		try {
			listOfStudents.remove(student);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	
	
	// Returns lecturer
	public Lecturer getLecturer() {
		return lecturer;
	}
	// Returns module name
	public String getName() {
		return moduleName;
	}
	// Returns module code
	public String getModuleCode() {
		return moduleCode;
	}
	// returns associated courses arraylist
	public ArrayList<Course> getAssociatedCourses(){
		return associatedCourses;
	}
	// returns list of students registered for the module
	public ArrayList<Student> getListOfStudents(){
		return listOfStudents;
	}
	// Overridden toString method
	@Override
	public String toString() {
		String str = "";
		str += "Name: " + getName();
		str += "\nLecturer: " + getLecturer().getName();
		str += "\nModule Code: " + getModuleCode();
 		str += "\nRelated Courses: ";
		for (int i = 0; i < associatedCourses.size(); i++) {
			str += "\n     " + associatedCourses.get(i).getName();
		}
		str += "\nEnrolled Students: ";
		for (int i = 0; i < listOfStudents.size(); i++) {
			str += "\n     " + listOfStudents.get(i).getName();
		}
		return str;
	}

	

}
