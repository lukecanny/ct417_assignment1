package assignment1_ct417;

import org.joda.time.*;
import java.util.ArrayList;
/* The Lecturer class is responsible for storing all information relating to an individual lecturer. 
 * This includes name, date of birth, staff id, modules they are responsible for.
 * @author Luke Canny 19339166
 * @date 11-10-22
 */
public class Lecturer implements UniversityElement {
	
	String name;
	int id;
	LocalDate dob;
	static int lastIdUsed = 0;
	ArrayList<Module> listOfTaughtModules = new ArrayList<Module>();
	
	// Constructor takes name and date of birth as fields
	public Lecturer (String name, LocalDate dob){
		this.name = name;
		this.dob = dob;
		id = ++lastIdUsed;	// New Staff ID assigned here
	}
	
	// Returns user name of lecturer (first 5 letters of name and age)
	public String getUsername() {
		return name.replaceAll(" ", "").substring(0,5) + getAge();
	}
	
	// Returns age
	public int getAge() {
		LocalDate currentDate = new LocalDate();
	    Years age = Years.yearsBetween(dob,currentDate);
	    return age.getYears();
	}
	
	// returns date of birth
	public LocalDate getDateOfBirth() {
		return dob;
	}
	
	// returns staff id
	public int getID() {
		return id;
	}
	
	// returns lecturer's name
	public String getName() {
		return name;
	}

	// Adds module to list of taught modules
	public void addModule(Module mod) {
		listOfTaughtModules.add(mod);
	}

	// Adds multiple modules to list of taught modules
	public void addModules(ArrayList<Module> mods) {
		for (int i = 0; i < mods.size(); i++) {
			listOfTaughtModules.add(mods.get(i));
		}
	}
	
	// Removes a module from the arraylist listOfTaughtModules
	public void removeModule(Module mod) {
		for (int i = 0; i < listOfTaughtModules.size(); i++) {
			if (mod.equals(listOfTaughtModules.get(i))) {
				listOfTaughtModules.remove(i);
			}
		}
	}
	
	// Returns arraylist of modules taught by lecturer
	public ArrayList<Module> getListOfModules(){
		return listOfTaughtModules;
	}
	
	// Overridden toString 
	@Override
	public String toString() {
		String str = "";
		str += "Name: " + getName();
		str += "\nUsername: " + getUsername();
		str += "\nID: " + getID();
		str += "\nDate of Birth" + dob.toString();
		str += "\nAge: " + getAge();
		str += "\nModules: ";
		for (int i = 0; i < listOfTaughtModules.size(); i++) {
			str += "\n     " + listOfTaughtModules.get(i).getName();
		}
		return str;
	}
}
