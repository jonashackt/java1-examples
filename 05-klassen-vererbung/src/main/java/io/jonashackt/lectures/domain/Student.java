package io.jonashackt.lectures.domain;

public class Student extends Person implements Employee {
    private int semester;

    public Student(String name) {
        super(name);
        semester = 1;
    }

    public void setCurrentSemester(int semester) {
        this.semester = semester;
    }

    public int getCurrentSemester() {
        return semester;
    }
}
