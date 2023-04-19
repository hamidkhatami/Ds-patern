package main.java.com.pattern.criteria;

public class Person {
    private String name;
    private String family;
    private String Gender;

    public Person(String name, String family, String gender) {
        this.name = name;
        this.family = family;
        Gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public String getGender() {
        return Gender;
    }
}
