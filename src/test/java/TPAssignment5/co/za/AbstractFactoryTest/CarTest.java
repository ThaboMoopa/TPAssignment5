package TPAssignment5.co.za.AbstractFactoryTest;

import TPAssignment5.co.za.AbstractFactory.Car;
import TPAssignment5.co.za.AbstractFactory.CarFactory;
import TPAssignment5.co.za.AbstractFactory.Corolla;
import TPAssignment5.co.za.AbstractFactory.ToyotaCarFactory;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class CarTest extends TestCase {

    @Test
    public void testCorolla()
    {
        ToyotaCarFactory factory = new ToyotaCarFactory();
        Car corolla = factory.produceCar("Corolla");
        assertEquals("Corolla", corolla);
    }

    @Test
    public void testYaris()
    {
        ToyotaCarFactory factory = new ToyotaCarFactory();
        Car yaris = factory.produceCar("Yaris");
        assertEquals("Corolla", yaris);
    }


}
