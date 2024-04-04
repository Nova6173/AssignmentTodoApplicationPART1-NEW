package se.JavaLexicon.assignmentsTodoApplication.Dao;

import se.JavaLexicon.assignmentsTodoApplication.Person;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class PersonDAOImpl implements PersonDAO {
    private final Map<Integer, Person> persons = new HashMap<>();

    @Override
    public void persist(Person person) {
        persons.put(person.getId(), person);
    }

    @Override
    public Person findById(int id) {
        return persons.get(id);
    }

    @Override
    public Person findByEmail(String email) {
        for (Person person : persons.values()) {
            if (person.getEmail().equals(email)) {
                return person;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return persons.values();
    }

    @Override
    public void remove(Person person) {
        persons.remove(person.getId());
    }
}
