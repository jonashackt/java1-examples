package io.jonashackt.lectures.domain;

public class Lecturer extends Person implements Employee {
    private AcademicGrade academicGrade;

    public Lecturer(String name) {
        super(name);
        this.academicGrade = AcademicGrade.NOOB;
    }

    public void setAcademicGrade(AcademicGrade academicGrade) {
        this.academicGrade = academicGrade;
    }

    public AcademicGrade getAcademicGrade() {
        return this.academicGrade;
    }

    @Override
    public String getMitarbeiterId() {
        return "Zentral-ID";
    }
}
