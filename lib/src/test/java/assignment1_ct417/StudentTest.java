package assignment1_ct417;
import org.joda.time.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
	
	Student student = new Student("Luke Canny", new LocalDate(2001, 2,20));
	
	@Test
	@DisplayName("Object Created")
	void objectCreated() {
		assertTrue(student instanceof Student, "Object Created");
	}
	
	@Test 
	@DisplayName("Get Student Name")
	void getStudentName() {
		assertEquals("Luke Canny", student.getName(), "Name matches");
	}
	
	@Test
	@DisplayName("Get Username")
	void getUsername() {
		assertEquals("LukeC21", student.getUsername(), "Username matches");
	}
	
	@Test
	@DisplayName("Get Date of Birth")
	void getDateOfBirth() {
		assertEquals(new LocalDate(2001,2,20), student.getDateOfBirth(), "Birthday matches");
	}
	
	@Test
	@DisplayName("Get Age")
	void getAge() {
		assertEquals(21, student.getAge(), "Student should be 21");
	}

}
