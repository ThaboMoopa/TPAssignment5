package TPAssignment5.co.za.Singleton;

/**
 * Created by thabomoopa on 2017/04/01.
 */
public class Person {
    private static Person person = null;

    private Person() {
    }
    public static Person getInstance()
    {
        if(person == null)
        {
            person = new Person();
        }
        return person;
    }
    public String name(String name)
    {
        return name;
    }
    public String surname(String surname)
    {
        return surname;
    }
}
