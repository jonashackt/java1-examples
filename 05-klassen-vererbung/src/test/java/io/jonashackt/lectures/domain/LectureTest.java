package io.jonashackt.lectures.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LectureTest {

    Student tom = new Student("Tom");

    Lecturer norbert = new Lecturer("Prof. Dr. Norbert");

    @Test
    void student_and_lecturer_should_extend_person() {

        boolean tomIsAPerson = false;
        if(tom instanceof Person) {
            tomIsAPerson = true;
        }
        assertEquals(true, tomIsAPerson);
    }

    @Test
    void student_and_lecturer_should_implement_employee() {

        boolean norbertIsEmployee = false;
        if(norbert instanceof Employee) {
            norbertIsEmployee = true;
        }
        assertEquals(true, norbertIsEmployee);
    }

    @Test
    void student_should_have_a_current_semester() {
        tom.setCurrentSemester(3);

        assertEquals(3, tom.getCurrentSemester());
    }

    @Test
    void student_should_get_semster_ticket() {
        assertNotNull(tom.getSemesterTicket());
    }

    @Test
    void lecturer_should_have_academic_grade() {
        norbert.setAcademicGrade(AcademicGrade.PROF_DR);

        assertEquals(AcademicGrade.PROF_DR, norbert.getAcademicGrade());
    }

    @Test
    void a_random_lecturer_should_be_at_least_a_Noob() {
        Lecturer noob = new Lecturer("Jonas");

        assertEquals(AcademicGrade.NOOB, noob.getAcademicGrade());
    }

    @Test
    void a_student_should_be_able_to_apply_to_a_course() {
        Student max = new Student("Maximilian");

        Course javaProgramming1 = new Course("Program with Java Vol. 1", CourseType.WINTER, 6);

        javaProgramming1.apply(max);

        assertEquals(1, javaProgramming1.getNumberOfApplications());
    }

    @Test
    void no_object_of_class_person_possible() {


        Person prof = new Lecturer("Norbert");

        Lecturer lecturer = (Lecturer)prof;

        Employee hausmeister = new FacilityManager("Moritz");
        StudentEmployee max = new Student("Max");
        Employee norbert = new Lecturer("Norbert");


        List<Employee> employees = new ArrayList<Employee>();
        employees.add(hausmeister);
        employees.add(max);
        employees.add(norbert);

        max.getSemesterTicket();

        hausmeister.getMitarbeiterId();

        norbert.getMitarbeiterId();



        ErfurterScriptEngineManager erfurterScriptEngineManager = new ErfurterScriptEngineManager();
        erfurterScriptEngineManager.getEngineByName("tolle Engine");
    }

    @Test
    void should_have_prof_dr_as_academicGrade() {
        // TODO: Enum
    }

    @Test
    void lecturer_should_throw_exception_if_only_noob() {
        Lecturer herbert = new Lecturer("Herbert");

        // TODO: Try / catch example

        // TODO: assertThrows example
    }
}
