package TPAssignment5.co.za.ProxyTest;

import TPAssignment5.co.za.Proxy.Lecturer;
import TPAssignment5.co.za.Proxy.Salary;
import TPAssignment5.co.za.Proxy.TravelExpense;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class ProxyTest extends TestCase {
    @Test
    public void testLecturer()
    {
        Lecturer lecturer = new Lecturer("Thabo", 8);
        Salary salary = new TravelExpense();
        assertEquals(320, salary.employeeSalary(lecturer.getHoursWorked()));
    }
}
