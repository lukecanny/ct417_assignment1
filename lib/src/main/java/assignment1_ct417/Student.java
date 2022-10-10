package assignment1_ct417;

import java.util.ArrayList;

import org.joda.time.*;

public class Student {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	String courseCode;
	ArrayList<Module> listOfModules = new ArrayList<Module>();
	
	public Student (String name, LocalDate dob, String courseCode){
		id = ++lastIdUsed;
		this.name = name;
		this.dob = dob;
		this.courseCode = courseCode;
	}
	
	public Student() {
		id = ++lastIdUsed;
		name = "";
		courseCode = "";
		dob = new LocalDate();
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
}
