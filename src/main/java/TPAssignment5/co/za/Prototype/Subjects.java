package TPAssignment5.co.za.Prototype;

/**
 * Created by thabomoopa on 2017/04/02.
 */
public class Subjects implements CloneObject {
    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Subjects(int courseNumber, String courseName) {

        this.courseNumber = courseNumber;
        this.courseName = courseName;
    }

    private int courseNumber;
    private String courseName;

    @Override
    public CloneObject makeCopy() {
        return new Subjects(courseNumber, courseName);

    }
}
