package assignment1_ct417;
import org.joda.time.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {
	
	Module mod = new Module(new Lecturer("Jteve Sobs", new LocalDate(1955, 2,24)), "Software Engineering", "CT417");
	
	@Test
	@DisplayName("Object Created")
	void objectCreated() {
		assertTrue(mod instanceof Module, "Object Created");
	}
	
	@Test 
	@DisplayName("Get Module Name")
	void getModuleName() {
		assertEquals("Software Engineering", mod.getName(), "Name matches");
	}
	
	@Test
	@DisplayName("Get Module Code")
	void getModuleCode() {
		assertEquals("CT417", mod.getModuleCode(), "Code matches");
	}
	
	@Test
	@DisplayName("Get Lecturer Name")
	void getLecturerName() {
		assertEquals((mod.getLecturer()).getName(),"Jteve Sobs", "Lecturer is correct");
	}
	
	
}
