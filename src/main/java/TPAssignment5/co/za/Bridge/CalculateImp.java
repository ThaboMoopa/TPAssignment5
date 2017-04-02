package TPAssignment5.co.za.Bridge;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class CalculateImp extends Calculate{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public CalculateImp(Calculator calculator, int a, int b) {
        super(calculator);
        this.a = a;
        this.b = b;
        this.calculator = calculator;
    }

    protected CalculateImp(Calculator calculator) {
        super(calculator);
    }

    @Override
    public int calc() {
        return calculator.calculation(a,b);
    }


}
