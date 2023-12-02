package encapsulation;

public class EncapsulationA {

    private String name;
    private String surName;
    private int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getId() {
        return id;
    }
}
