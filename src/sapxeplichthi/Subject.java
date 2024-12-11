package sapxeplichthi;

public class Subject {
    private String code, name, format;

    public Subject(String code, String name, String format) {

        this.code = code;
        this.name = name;
        this.format = format;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
