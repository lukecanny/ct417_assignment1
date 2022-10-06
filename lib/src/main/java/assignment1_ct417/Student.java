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
	
	Student (String name, LocalDate dob, String courseCode){
		
		id = ++lastIdUsed;
		this.name = name;
		this.dob = dob;
		this.courseCode = courseCode;
	}

	String getUsername() {
		return name.replaceAll(" ", "").substring(0,5) + getAge();
	}
	
	int getAge() {
		LocalDate currentDate = new LocalDate();
	    Years age = Years.yearsBetween(dob,currentDate);
	    return age.getYears();
	}
	
	LocalDate getDateOfBirth() {
		return dob;
	}
	
	int getID() {
		return id;
	}
	
	String getName() {
		return name;
	}
	
	String getCourseCode() {
		return courseCode;
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
		for (int i = 0; i < listOfModules.size(); i++) {
			if (mod.equals(listOfModules.get(i))) {
				listOfModules.remove(i);
			}
		}
	}
	
	public ArrayList<Module> getListOfModules(){
		return listOfModules;
	}
}
