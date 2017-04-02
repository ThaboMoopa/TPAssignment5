package TPAssignment5.co.za.Prototype;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class Student implements CloneObject {
    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String surname;

    @Override
    public CloneObject makeCopy() {
        return new Student(name, surname);
    }
}
