package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalInterfacesTest {

    @Test public void
    predicate_should_check_something() {

        // java.util.function.Predicate
        Predicate<Integer> isGreaterThen5 = x -> x > 5;

        assertEquals(false, isGreaterThen5.test(4));
        assertEquals(true, isGreaterThen5.test(6));
    }

    @Test public void
    function_should_apply_something_onto_a_parameter() {

        // java.util.function.Function
        // String is the parameter, Integer is the return value
        Function<String, Integer> stringLength = string -> string.length();

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
}
