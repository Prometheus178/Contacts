package contacts.services;

import contacts.dao.PersonDAO;
import contacts.dao.PersonDAOImpl;
import contacts.model.Person;

import java.util.List;

public class PersonServicesImpl implements PersonServices {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAOImpl personDAO) {
        this.personDAO = personDAO;
    }
    public void addPerson(Person person) {
        this.personDAO.addPerson(person);
    }

    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }

    public void updatePerson(Person person) {
        this.personDAO.updatePerson(person);
    }

    public Person getPersonByID(int id) {
        return this.personDAO.getPersonByID(id);
    }

    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
}
