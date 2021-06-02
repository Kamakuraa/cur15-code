package ro.fasttrackit.temaCurs15.Tema2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private final int id;
    private final List<String> names;
    private final int age;

    public Person(int id, String name, int age) {
        this.id = id;
        this.names = new ArrayList<>();
        this.age = age;
    }

    public void addPerson(String name) {
        names.add(name);
    }

    public void removePerson(String name) {
        names.remove(name);
    }

    public boolean containsPeople(String people) {
        return names.contains(people);
    }

    public int getId() {
        return id;
    }

    public List<String> getName() {
        return names;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && age == person.age && Objects.equals(names, person.names);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, names, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + names + '\'' +
                ", age=" + age +
                '}';
    }
}
