package contacts.model;

public class Person {
    private int id;
    private String name;
    private int phoneNumber;
    private String country;

    public Person(int id, String name, int phoneNumber, String country) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.country = country;
    }

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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
