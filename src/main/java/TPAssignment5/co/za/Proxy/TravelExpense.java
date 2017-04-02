package TPAssignment5.co.za.Proxy;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class TravelExpense implements Salary {
    private String name;
    private int hoursWorked;
    private int kilometers;
    private Lecturer lecturer;

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public int employeeSalary(int amount) {
        if(lecturer == null)
        {
            lecturer = new Lecturer(name, hoursWorked);
        }
        return kilometers * amount;

    }
}
