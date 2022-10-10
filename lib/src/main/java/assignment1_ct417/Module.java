package assignment1_ct417;

import java.util.ArrayList;


public class Module implements UniversityElement{
	Lecturer lecturer;
	String moduleName;
	String moduleCode;
	ArrayList<Course> associatedCourses;
	ArrayList<Student> listOfStudents;
	
	public Module(Lecturer lecturer, String moduleName, String moduleCode){
		this.lecturer= lecturer;
		this.moduleName = moduleName;
		this.moduleCode = moduleCode;
		lecturer.addModule(this);
		associatedCourses = new ArrayList<Course>();
		listOfStudents = new ArrayList<Student>();
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
