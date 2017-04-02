package TPAssignment5.co.za.Adapter;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class CarManufacturerAdapter implements CarManufacturer {

    CarDistributor distributor;

    public CarManufacturerAdapter (String name){
        if(name.equalsIgnoreCase("SUV"))
        {
            distributor = new SUV();
        }
        else if(name.equalsIgnoreCase("Sudan"))
        {
            distributor = new Sudan();
        }
    }

    @Override
    public String producerCar( String name) {
        if(name.equalsIgnoreCase("SUV"))
        {
            return distributor.SUV(name);
        }
        else if(name.equalsIgnoreCase("Sudan"))
        {
            return distributor.Sudan(name);
        }
        else
            return null;
    }
}
