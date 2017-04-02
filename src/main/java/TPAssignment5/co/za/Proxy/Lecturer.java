package TPAssignment5.co.za.Proxy;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class Lecturer implements Salary {
    public Lecturer(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private String name;
    private int hoursWorked;

    @Override
    public int employeeSalary(int amount) {
        return hoursWorked * amount;
    }
}
