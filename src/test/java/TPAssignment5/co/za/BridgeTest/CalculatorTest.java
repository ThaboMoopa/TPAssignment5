package TPAssignment5.co.za.BridgeTest;

import TPAssignment5.co.za.Bridge.Addition;
import TPAssignment5.co.za.Bridge.Calculate;
import TPAssignment5.co.za.Bridge.CalculateImp;
import TPAssignment5.co.za.Bridge.Calculator;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class CalculatorTest extends TestCase {

    @Test
    public void testAddition()
    {
        Calculate calc = new CalculateImp(new Addition(), 6, 8 );
        assertEquals(14, calc.calc());

    }
}
