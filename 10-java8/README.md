# 10-java8

Example project showing how Lamdas, Streams & FunctionalInterfaces work with Java 8.

Check out the FunctionalInterfaces Test in: [FunctionalInterfacesTest.java](src/test/java/io/jonashackt/lectures/FunctionalInterfacesTest.java):

```java
package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import java.util.function.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalInterfacesTest {

    @Test public void
    predicate_should_check_something() {

        // java.util.function.Predicate
        // one parameter - and always return a boolean!
        Predicate<Integer> isGreaterThen5 = x -> x > 5;

        assertEquals(false, isGreaterThen5.test(4));
        assertEquals(true, isGreaterThen5.test(6));
    }

    @Test public void
    function_should_apply_something_onto_a_parameter() {

        // java.util.function.Function
        // one parameter, one return value
        Function<String, Integer> stringLength = string -> string.length();
        // the following would be exactly the same, just with the :: notation instead of string -> string
        // Function<String, Integer> stringLength = String::length;

        assertEquals(15, stringLength.apply("What the f***?!"));
    }

    @Test public void
    binaryOperator_should_apply_something_onto_2_parameters() {

        // java.util.function.BinaryOperator
        // now we have 2 parameters... and one return value again
        BinaryOperator<Integer> multiply = (x, y) -> x * y;

        assertEquals(25, multiply.apply(5, 5));
        assertEquals(49, multiply.apply(7, 7));
    }

    @Test public void
    supplier_should_create_something_out_of_nothing() {

        // java.util.function.Supplier
        // now we have NO parameters... and again one return value
        Supplier<Person> personFactory = () -> new Person("The", "Terminator");

        assertEquals("Terminator", personFactory.get().getLastName());
    }


    @Test public void
    consumer_should_only_take_a_parameter_but_give_nothing_back() {

        // java.util.function.Consumer
        // now we have one parameter... but NO return value!
        Consumer<String> printThisStringMan = string -> System.out.println(string);

        printThisStringMan.accept("Print me, but don't assert me - just have a look into the console, right?! ");
    }
}

```