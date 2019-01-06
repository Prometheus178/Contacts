package contacts.services;

import contacts.model.Person;

import java.util.List;

public interface PersonServices {

    public void addPerson(Person person);
    public void removePerson(int id);
    public void updatePerson(Person person);
    public Person getPersonByID(int id);
    public List<Person> listPersons();

}
