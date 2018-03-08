package example.trgmodel;

public class Target {
    private String name;
    private Long number;

    @Override
    public String toString() {
        return "Target{" +
                "Name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
