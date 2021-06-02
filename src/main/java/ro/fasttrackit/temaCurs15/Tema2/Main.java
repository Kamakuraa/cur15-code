package ro.fasttrackit.temaCurs15.Tema2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonService person = new PersonService(List.of(
                new Person(1, "Alex", 36 ),
                new Person(20, "Marius", 22 ),
                new Person(11, "Cristi", 33 ),
                new Person(17, "Dana", 44 ),
                new Person(3, "Maria", 43 )
        ));

        System.out.println(person.getPersonList());

        System.out.println(person.addPerson("George"));

        person.removePerson("Maria");

        System.out.println(person.getPerson("George"));


        System.out.println(person.getPersonById(1));

    }
}
