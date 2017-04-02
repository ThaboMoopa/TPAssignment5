package TPAssignment5.co.za.AdapterTest;

import TPAssignment5.co.za.Adapter.CarManufacturer;
import TPAssignment5.co.za.Adapter.CarManufacturerAdapter;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class CarTest extends TestCase {



    @Test
    public void testSUVAdapter()
    {
        CarManufacturerAdapter adapter = new CarManufacturerAdapter("SUV");
        assertEquals("SUV", adapter.producerCar("SUV"));
    }
    @Test
    public void testSudanAdapeter()
    {
        CarManufacturerAdapter adapter = new CarManufacturerAdapter("Sudan");
        assertEquals("Sudan", adapter.producerCar("Sudan"));
    }
}
