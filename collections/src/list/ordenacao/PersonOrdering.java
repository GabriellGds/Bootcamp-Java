package list.ordenacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class PersonOrdering {
    private List<Person> persons;

    public PersonOrdering() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(String name, Integer age, Double height) {
        persons.add(new Person(name, age, height));
    }

    public List<Person> sortedByAge() {
        List<Person> personsByAge = new ArrayList<>(persons);
        Collections.sort(personsByAge);
        return personsByAge;
    }

    public List<Person> sortedByHeight() {
        List<Person> personByHeight = new ArrayList<>(persons);
        personByHeight.sort(new comparatorPorAltura());
        return personByHeight;
    }

    public static void main(String[] args) {
        PersonOrdering personOrdering = new PersonOrdering();
        personOrdering.addPerson("nome 1", 20, 1.56);
        personOrdering.addPerson("nome 2", 30, 1.80);
        personOrdering.addPerson("nome 3", 20, 1.72);
        personOrdering.addPerson("nome 4", 17, 1.56);

        System.out.println(personOrdering.sortedByAge());
        System.out.println(personOrdering.sortedByHeight());
    }
}
