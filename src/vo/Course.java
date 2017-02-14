package vo;

/**
 * Created by alex on 1/27/17.
 */
public class Course {
    private String name;
    private String outcome;
    private int credits;
    private String department_name;
    private String precondition_course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getPrecondition_course() {
        return precondition_course;
    }



    public void setPrecondition_course(String precondition_course) {
        this.precondition_course = precondition_course;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", outcome='" + outcome + '\'' +
                ", credits=" + credits +
                ", department_name='" + department_name + '\'' +
                ", precondition_course='" + precondition_course + '\'' +
                '}';
    }
}
