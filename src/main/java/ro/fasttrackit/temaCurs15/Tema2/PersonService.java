package ro.fasttrackit.temaCurs15.Tema2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PersonService {
    private final List<Person> personList = new ArrayList<>();

    public PersonService(Collection<Person> personCollection) {
        this.personList.addAll(personCollection);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public String addPerson(String person) {
        if (person == null) {
            throw new NoPersonException("person is null");
        }
        var foundPerson = getPersonList();
        return person;
    }

    public void removePerson(String person) {
        List<Person> persons = getPersonList();
        if (persons == null || !person.contains(person)) {
            throw new NoPersonException("no person");
        } else {
            persons.remove(person);
        }
     }
    public Person getPerson(String name) throws NoPersonException{
        for (Person person: personList){
            if (person.getName().equals(name)){
                return person;
            }
        }
        return null;
    }

    public Person getPersonById(int id){
        for (Person person:personList){
            if (person.getId()==id){
                return person;
            }
        }
        return null;
    }

}
