package assignment1_ct417;

import org.joda.time.*;
import java.util.ArrayList;

public class Lecturer {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	ArrayList<Module> listOfTaughtModules;
	
	Lecturer (String name, LocalDate dob){
		this.name = name;
		this.dob = dob;
		id = ++lastIdUsed;
	}
	
	public String getUsername() {
		return name.replaceAll("//s+", "").substring(0,5) + getAge();
	}
	
	public int getAge() {
		LocalDate currentDate = new LocalDate();
	    Years age = Years.yearsBetween(dob,currentDate);
	    return age.getYears();
	}
	
	public LocalDate getDateOfBirth() {
		return dob;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void addModule(Module mod) {
		listOfTaughtModules.add(mod);
	}
	
	public void removeModule(Module mod) {
		for (int i = 0; i < listOfTaughtModules.size(); i++) {
			if (mod.equals(listOfTaughtModules.get(i))) {
				listOfTaughtModules.remove(i);
			}
		}
	}
	
	public ArrayList<Module> getListOfModules(){
		return listOfTaughtModules;
	}
}
