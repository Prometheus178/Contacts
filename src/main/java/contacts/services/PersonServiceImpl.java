package contacts.services;

import contacts.dao.PersonDAO;
import contacts.dao.PersonDAOImpl;
import contacts.model.Person;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    private PersonDAO personDAO;
    public void setPersonDAO(PersonDAOImpl personDAO) {
        this.personDAO = personDAO;
    }
    @Transactional
    public void addPerson(Person person) {
        this.personDAO.addPerson(person);
    }
    @Transactional
    public void removePerson(int id) {
        this.personDAO.removePerson(id);
    }
    @Transactional
    public void updatePerson(Person person) {
        this.personDAO.updatePerson(person);
    }
    @Transactional
    public Person getPersonById(int id) {
        return this.personDAO.getPersonById(id);
    }
    @Transactional
    public List<Person> listPersons() {
        return this.personDAO.listPersons();
    }
}
