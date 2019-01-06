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

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        if (phoneNumber != person.phoneNumber) return false;
        if (name != null ? !name.equals(person.name) : person.name != null) return false;
        if (country != null ? !country.equals(person.country) : person.country != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + phoneNumber;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
