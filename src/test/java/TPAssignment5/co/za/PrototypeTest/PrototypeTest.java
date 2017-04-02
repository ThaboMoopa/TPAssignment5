package TPAssignment5.co.za.PrototypeTest;

import TPAssignment5.co.za.Prototype.Student;
import TPAssignment5.co.za.Prototype.Subjects;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class PrototypeTest extends TestCase {

    @Test
    public void testMakeCopy()
    {
        Student student = new Student("Thabo", "Moopa");
        Subjects subject = new Subjects(43568, "IT");
        assertEquals(subject, subject.makeCopy() );
    }
    @Test
    public void testSubjects()
    {

        Subjects subject = new Subjects(5467, "Human Resources");
        assertEquals(subject, subject);
    }
    @Test
    public void testNewCopyStudent()
    {
        Student student = new Student("Thando", "Lerato");
        assertEquals(student.makeCopy(), student.makeCopy());
    }
    @Test
    public void testStudent()
    {
        Student student = new Student("Thando", "Lerato");
        assertEquals(student, student);
    }
}
