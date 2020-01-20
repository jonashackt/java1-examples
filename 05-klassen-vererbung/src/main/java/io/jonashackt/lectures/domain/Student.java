package io.jonashackt.lectures.domain;

public class Student extends Person implements SuperEmployee {

    private int semester;

    public Student(String name) {
        super(name);
        semester = 1;
    }

    public String getName() {
        return "I'am a " + AcademicGrade.NOOB;
    }

    public void setCurrentSemester(int semester) {
        this.semester = semester;
    }

    public int getCurrentSemester() {
        return semester;
    }

    @Override
    public String toString() {
        return "Student mit dem Namen '" + this.getName() + "' im Semester " + this.semester;
    }

    @Override
    public int getId() {
        return 4711;
    }

    @Override
    public String getMitarbeiterId() {
        return "4711";
    }
}
