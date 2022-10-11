package assignment1_ct417;
import org.joda.time.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {
	
	Lecturer lect = new Lecturer("Jteve Sobs", new LocalDate(1955, 2,24));
	
	@Test
	@DisplayName("Object Created")
	void objectCreated() {
		assertTrue(lect instanceof Lecturer, "Object Created");
	}
	
	@Test 
	@DisplayName("Get Lecturer Name")
	void getLecturerName() {
		assertEquals("Jteve Sobs", lect.getName(), "Name matches");
	}
	
	@Test
	@DisplayName("Get Username")
	void getUsername() {
		assertEquals("Jteve67", lect.getUsername(), "Username matches");
	}
	
	@Test
	@DisplayName("Get Date of Birth")
	void getDateOfBirth() {
		assertEquals(new LocalDate(1955,2,24), lect.getDateOfBirth(), "Birthday matches");
	}
	
	@Test
	@DisplayName("Get Age")
	void getAge() {
		assertEquals(67, lect.getAge(), "lect should be 21");
	}
	
}
