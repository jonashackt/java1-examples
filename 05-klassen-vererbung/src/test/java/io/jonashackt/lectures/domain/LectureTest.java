package io.jonashackt.lectures.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectureTest {

    @Test
    void a_student_should_be_able_to_apply_to_a_course() {
        Student max = new Student("Maximilian");

        Course javaProgramming1 = new Course("Program with Java Vol. 1", CourseType.WINTER, 6);

        javaProgramming1.apply(max);

        assertEquals(1, javaProgramming1.getNumberOfApplications());
    }
}
