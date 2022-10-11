package assignment1_ct417;
import org.joda.time.*;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class CourseTest {
	
	Course course = new Course("Electronic and Computer Engineering", "GY406", new ArrayList<Module>(), new LocalDate(2019,9,5), new LocalDate(2024,5,10));
	
	@Test
	@DisplayName("Object Created")
	void objectCreated() {
		assertTrue(course instanceof Course, "Object Created");
	}
	
	@Test 
	@DisplayName("Get Course Name")
	void getCourseName() {
		assertEquals("Electronic and Computer Engineering", course.getName(), "Name matches");
	}
	
	@Test
	@DisplayName("Get Course Code")
	void getCourseCode() {
		assertEquals("GY406", course.getCourseCode(), "Course Code Matches");
	}
	
	@Test
	@DisplayName("Start Date")
	void getStartDate() {
		assertEquals(new LocalDate(2019,9,5), course.getStartDate(), "Start date matches");
	}
	
	@Test
	@DisplayName("End Date")
	void getEndDate() {
		assertEquals(new LocalDate(2024,5,10), course.getEndDate(), "End date matches");
	}
	
}
