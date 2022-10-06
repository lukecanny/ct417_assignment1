package assignment1_ct417;

import org.joda.time.*;

public class Student {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	String courseCode;
	
	Student (String name, LocalDate dob, String courseCode){
		
		id = ++lastIdUsed;
		this.name = name;
		this.dob = dob;
		this.courseCode = courseCode;
		System.out.println("Student generated with id of: " + id);
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
