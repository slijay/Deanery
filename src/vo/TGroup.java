package vo;

/**
 * Created by alex on 1/27/17.
 */
public class TGroup {
    private int id;
    private int year;
    private String term;
    private int number;
    private int professor_id;
    private String course_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    @Override
    public String toString() {
        return "TGroup{" +
                "id=" + id +
                ", year=" + year +
                ", term='" + term + '\'' +
                ", number=" + number +
                ", professor_id=" + professor_id +
                ", course_name='" + course_name + '\'' +
                '}';
    }
}
