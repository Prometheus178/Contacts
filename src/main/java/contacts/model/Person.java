package contacts.model;

import javax.persistence.*;

@Entity
@Table(name="Person")

public class Person {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
//    private int phoneNumber;
    private String country;

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

//    public int getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(int phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString(){
        return "id="+id+", name="+name+", country="+country;
    }

}
