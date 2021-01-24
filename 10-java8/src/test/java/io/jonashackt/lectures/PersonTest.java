package io.jonashackt.lectures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        persons.add(new Person("Max", "Monstermustermann"));
    }

    @Test public void
    should_count_persons_with_firstName_monika() {
        // Java <= 7
        int countMonika = 0;

        for(Person person : persons) {
            if("Monika".equals(person.getFirstName())){
                countMonika++;
            }
        }

        int countPaul = 0;

        for(Person person : persons) {
            if("Paul".equals(person.getFirstName())){
                countPaul++;
            }
        }

        assertEquals(5, countMonika);
        assertEquals(1, countPaul);
    }

    @Test public void
    should_count_persons_with_firstName_monika_with_java8_streams() {

        long countMonika = persons.stream().filter(person -> "Monika".equals(person.getFirstName())).count();
        long countPaul = persons.stream().filter(person -> "Paul".equals(person.getFirstName())).count();

        assertEquals(5, countMonika);
        assertEquals(1, countPaul);
    }


    @Test public void
    should_create_a_normal_collection_out_of_our_stream_again() {

        // Create a stream out of our Collection, use it, then gather a new Collection back from it...
        List<Person> monikas = persons.stream().filter(person -> "Monika".equals(person.getFirstName())).collect(Collectors.toList());

        assertEquals(5, monikas.size());
    }

    @Test public void
    should_create_a_new_list_with_only_the_first_names() {
        // Use Stream.map() to create a new List containing only the firstNames
        List<String> firstNames = persons.stream().map(person -> person.getFirstName()).collect(Collectors.toList());

        assertEquals(7, firstNames.size());
    }

    @Test public void
    should_return_person_with_longest_lastname() {

        Person personWithLongestLastname = persons.stream().max(Comparator.comparing(person -> person.getLastName().length())).get();

        assertEquals("Monstermustermann", personWithLongestLastname.getLastName());
    }
}
