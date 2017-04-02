package TPAssignment5.co.za.Bridge;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class Addition implements Calculator {
    public Addition() {
    }

    @Override
    public int calculation(int a, int b) {
        return a + b;
    }
}
