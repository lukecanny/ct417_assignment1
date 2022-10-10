package assignment1_ct417;

import java.util.ArrayList;

import org.joda.time.*;

public class Student implements UniversityElement {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	String courseCode = "";
	ArrayList<Module> listOfModules = new ArrayList<Module>();
	
	public Student (String name, LocalDate dob){
		id = ++lastIdUsed;
		this.name = name;
		this.dob = dob;
	}
	
	public void enroll(Course course) {
		courseCode = course.getCourseCode();
		listOfModules = course.enroll(this);
	}

	public String getUsername() {
		return name.replaceAll(" ", "").substring(0,5) + getAge();
	}
	
	public int getAge() {
		LocalDate currentDate = new LocalDate();
	    Years age = Years.yearsBetween(dob,currentDate);
	    return age.getYears();
	}
	
	public LocalDate getDateOfBirth() {
		return dob;
	}
	
	public void setDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourseCode() {
		return courseCode;
	}
	
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	
	public void addModule(Module mod) {
		listOfModules.add(mod);
	}
	
	public void addModules(ArrayList<Module> mods) {
		for (int i = 0; i < mods.size(); i++) {
			listOfModules.add(mods.get(i));
		}
	}
	
	public void removeModule(Module mod) {
		listOfModules.remove(mod);
	}
	
	public void setListOfModules(ArrayList<Module> listOfModules) {
		this.listOfModules = listOfModules;
	}
	
	public ArrayList<Module> getListOfModules(){
		return listOfModules;
	}
	
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
