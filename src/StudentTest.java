import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    @Test
    public void TestAverageGrade(){
       Student s1 = new Student(Arrays.asList(23.0,25.2,25.3),Level.First, "bill");
       Student s2 = new Student(Arrays.asList(85.0,95.3,50.6),Level.Fourth, "yoy");
       Student s3 = new Student(Arrays.asList(64.0,71.8,45.5),Level.Second, "den");
       assertEquals(23.5, s1.getAverageGrade());
       assertEquals(20.5, s2.getAverageGrade());
       assertEquals(23.5, s3.getAverageGrade());
    }

}