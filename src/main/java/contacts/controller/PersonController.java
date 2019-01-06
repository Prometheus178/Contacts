package contacts.controller;

import contacts.model.Person;
import contacts.services.PersonServices;
import org.springframework.ui.Model;

import java.util.List;

public class PersonController {

    private PersonServices personServices;

    public String addPerson(Person person){
        personServices.addPerson(person);
        return "redirect:/persons";
    }

    public String editPerson(int id, Model model){
        model.addAttribute("person",Person.class);
        model.addAttribute("listPersons",personServices.listPersons());
        return "person";
    }

    public String removePerson(int id){
        personServices.removePerson(id);
        return "redirect:/persons";
    }

    public String listPersons(Model model){
        model.addAttribute("person",Person.class);
        model.addAttribute("listPersons",personServices.listPersons());
        return "person";
    }
}
