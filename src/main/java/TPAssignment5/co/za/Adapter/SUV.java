package TPAssignment5.co.za.Adapter;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class SUV implements CarDistributor {


    @Override
    public String SUV(String name) {
        return name;
    }

    @Override
    public String Sudan(String name) {
        return null;
    }
}
