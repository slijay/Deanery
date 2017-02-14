package vo;

/**
 * Created by alex on 1/27/17.
 */
public class Auditorium {
    private String number;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Auditorium{" +
                "number='" + number + '\'' +
                '}';
    }
}
