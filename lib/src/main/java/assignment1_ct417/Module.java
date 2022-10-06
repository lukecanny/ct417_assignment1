package assignment1_ct417;

import java.util.ArrayList;


public class Module {
	Lecturer lecturer;
	String moduleName;
	String moduleCode;
	ArrayList<Course> associatedCourses;
	ArrayList<Student> listOfStudents;
	
	Module(Lecturer lecturer, String moduleName, String moduleCode){
		this.lecturer= lecturer;
		this.moduleName = moduleName;
		this.moduleCode = moduleCode;
	}
	
	public int addCourse(Course course) {
		try {
			associatedCourses.add(course);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}
	
	
	public int addStudent(Student student) {
		try {
			listOfStudents.add(student);
		} catch (Exception e) {
			return -1;
		}
		return 0;
	}

	public Lecturer getLecturer() {
		return lecturer;
	}

	public String getName() {
		return moduleName;
	}

	public String getModuleCode() {
		return moduleCode;
	}
	
	public ArrayList<Course> getAssociatedCourses(){
		return associatedCourses;
	}
	
	public ArrayList<Student> getListOfStudents(){
		return listOfStudents;
	}

}
