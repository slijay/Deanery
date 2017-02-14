package vo;

import java.sql.Date;

/**
 * Created by alex on 1/27/17.
 */
public class Student {
    private int id;
    private String name;
    private String speciality;
    private Date study_start;
    private Date study_finish;
    private String finish_reason;
    private double credits_total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Date getStudy_start() {
        return study_start;
    }

    public void setStudy_start(Date study_start) {
        this.study_start = study_start;
    }

    public Date getStudy_finish() {
        return study_finish;
    }

    public void setStudy_finish(Date study_finish) {
        this.study_finish = study_finish;
    }

    public String getFinish_reason() {
        return finish_reason;
    }

    public void setFinish_reason(String finish_reason) {
        this.finish_reason = finish_reason;
    }

    public double getCredits_total() {
        return credits_total;
    }

    public void setCredits_total(double credits_total) {
        this.credits_total = credits_total;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", speciality='" + speciality + '\'' +
                ", study_start=" + study_start +
                ", study_finish=" + study_finish +
                ", finish_reason='" + finish_reason + '\'' +
                ", credits_total=" + credits_total +
                '}';
    }
}
