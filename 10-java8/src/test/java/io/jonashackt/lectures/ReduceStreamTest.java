package io.jonashackt.lectures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReduceStreamTest {

    private List<Integer> integers = Arrays.asList(new Integer[]{ 1, 2, 5, 9, 10, 33});

    @Test public void
    should_add_int_values() {

        int sum = 0;

        for(int integer : integers) {
            sum = sum + integer;
        }

        assertEquals(60, sum);
    }

    @Test public void
    should_add_int_values_with_stream_and_reduce() {

        int sum = 0;

        sum = integers.stream().reduce((x, y) -> x + y).get();

        assertEquals(60, sum);
    }
}
