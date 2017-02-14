package vo;

/**
 * Created by alex on 1/27/17.
 */
public class Schedule {
    private String day;
    private int lesson;
    private int group_id;
    private String aud;

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getLesson() {
        return lesson;
    }

    public void setLesson(int lesson) {
        this.lesson = lesson;
    }

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "day='" + day + '\'' +
                ", lesson=" + lesson +
                ", group_id=" + group_id +
                ", aud='" + aud + '\'' +
                '}';
    }
}
