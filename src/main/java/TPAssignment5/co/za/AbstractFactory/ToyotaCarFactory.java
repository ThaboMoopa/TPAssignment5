package TPAssignment5.co.za.AbstractFactory;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class ToyotaCarFactory implements CarFactory {

    public Car produceCar(String carType) {

        if("Corolla".equalsIgnoreCase(carType))
        {
            return new Corolla();
        }
        if("Yaris".equalsIgnoreCase(carType))
        {
            return new Yaris();
        }
        return null;
    }
}
