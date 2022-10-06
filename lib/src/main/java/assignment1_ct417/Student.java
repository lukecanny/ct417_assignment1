package assignment_1;

import org.joda.time.*;

public class Student {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	
	Student (String name, LocalDate dob, String courseCode){
		this.name = name;
		this.dob = dob;
		id = ++lastIdUsed;
		// courseCode will be used to search for modules.
	}
	
	String getUsername() {
		return name.replaceAll("//s+", "").substring(0,5) + getAge();
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
}
