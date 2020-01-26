package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoreStreamsTest {

    @Test public void
    should_add_int_values() {

        Integer[] integers = { 1, 2, 5, 9, 10, 33};
        int sum = 0;

        for(int integer : integers ) {
            sum = sum + integer;
        }

        assertEquals(60, sum);
    }

    @Test public void
    should_add_int_values_with_stream_and_reduce() {

        Integer[] integers = { 1, 2, 5, 9, 10, 33};
        int sum = 0;

        sum = Arrays.asList(integers).stream().reduce((x, y) -> x + y).get();

        assertEquals(60, sum);
    }
}
