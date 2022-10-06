package assignment1_ct417;

import org.joda.time.*;

public class Student {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	String courseCode;
	
	Student (String name, LocalDate dob, String courseCode){
		this.name = name;
		this.dob = dob;
		id = ++lastIdUsed;
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
}
