package contacts.dao;

import contacts.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class PersonDAOImpl implements PersonDAO{
    private SessionFactory sessionFactory;

    public void addPerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.save(person);
    }

    public void removePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(id);
    }

    public void updatePerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.update(person);

    }

    public Person getPersonByID(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person person = (Person) session.load(Person.class, new Integer(id));
        return person;
    }

    public List<Person> listPersons() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> personList = session.createFilter(Person.class, "from Person").list();
        return personList;
    }
}
