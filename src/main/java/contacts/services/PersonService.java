package contacts.services;

import contacts.model.Person;

import java.util.List;

public interface PersonService {

    public void addPerson(Person person);
    public void removePerson(int id);
    public void updatePerson(Person person);
    public Person getPersonById(int id);
    public List<Person> listPersons();

}
