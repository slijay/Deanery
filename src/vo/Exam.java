package vo;

import java.sql.Date;

/**
 * Created by alex on 1/27/17.
 */
public class Exam {

    private String course_name;
    private int group_year;
    private Date date;
    private int professor_id;
    private String aud;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public int getGroup_year() {
        return group_year;
    }

    public void setGroup_year(int group_year) {
        this.group_year = group_year;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(int professor_id) {
        this.professor_id = professor_id;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "course_name='" + course_name + '\'' +
                ", group_year=" + group_year +
                ", date=" + date +
                ", professor_id=" + professor_id +
                ", aud='" + aud + '\'' +
                '}';
    }
}
