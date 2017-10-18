package Assignment1.StudentRegistrationSystemPartA;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentUsernameTest {


@Test
	public void testGetUserName() {
		StudentDetails student = new StudentDetails("Victoria Campbell", 22);
		String expected = student.getUsername();
		assertEquals(expected, "Victoria Campbell22");	
	}
	
}
