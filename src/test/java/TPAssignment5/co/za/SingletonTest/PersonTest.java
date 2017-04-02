package TPAssignment5.co.za.SingletonTest;

import TPAssignment5.co.za.Singleton.Person;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class PersonTest extends TestCase {

    String name = "Thabo";
    String surname = "Moopa";

    Person person = Person.getInstance();
    Person person2 = Person.getInstance();
    @Test
    public void testPersonName()
    {
      assertEquals( "Thabo", person.name(name));
    }

    @Test
    public void testPersonSurname()
    {
        assertEquals("Moopa", person2.surname(surname));
    }
}
