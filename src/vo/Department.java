package vo;

/**
 * Created by alex on 1/27/17.
 */
public class Department {
    private String name;
    private String aud;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAud() {
        return aud;
    }

    public void setAud(String aud) {
        this.aud = aud;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", aud='" + aud + '\'' +
                '}';
    }
}
