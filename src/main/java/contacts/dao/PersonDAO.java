package contacts.dao;

import contacts.model.Person;

import java.util.List;

public interface PersonDAO {

    public void addPerson(Person person);
    public void removePerson(int id);
    public void updatePerson(Person person);
    public Person getPersonById(int id);
    public List<Person> listPersons();
}
