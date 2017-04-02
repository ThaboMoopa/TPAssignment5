package TPAssignment5.co.za.Bridge;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public abstract class Calculate {
    protected Calculator calculator;

    protected Calculate (Calculator calculator)
    {
        this.calculator = calculator;
    }
    public abstract int calc();


}
