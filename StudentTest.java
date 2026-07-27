import static org.junit.jupiter.api.Assertions.*;

import org.assignment.Student;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    public void testStudentInitialization() {
        int expectedAge = 21;
        String expectedName = "John Doe";

        Student student = new Student(expectedAge, expectedName);

        assertEquals(expectedAge, student.getAge(), "Age should match the initialized value.");
        assertEquals(expectedName, student.getName(), "Name should match the initialized value.");
    }
}