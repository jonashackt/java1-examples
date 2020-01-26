package io.jonashackt.lectures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    private ArrayList<Person> persons;

    @BeforeEach
    public void setUp() {
        persons = new ArrayList<Person>();

        persons.add(new Person("Monika", "Meyer"));
        persons.add(new Person("Monika", "Müller"));
        persons.add(new Person("Monika", "Stark"));
        persons.add(new Person("Monika", "Metzger"));
        persons.add(new Person("Monika", "Wyoming"));
        persons.add(new Person("Paul", "Panzer"));
    }

    @Test public void
    should_count_persons_with_firstName_monika() {
        int count = 0;

        for(Person person : persons) {
            if("Monika".equals(person.getFirstName())){
                count++;
            }
        }

        assertEquals(5, count);
    }

    @Test public void
    should_count_persons_with_firstName_monika_with_java8_streams() {

        long count = persons.stream().filter(person -> "Monika".equals(person.getFirstName())).count();

        assertEquals(5, count);
    }
}
