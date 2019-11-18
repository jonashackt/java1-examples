package io.jonashackt.lectures.domain;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private final String name;
    private final CourseType courseType;
    private final int creditPoints;
    private List<Student> applications = new ArrayList<>();

    public Course(String name, CourseType courseType, int creditPoints) {
        this.name = name;
        this.courseType = courseType;
        this.creditPoints = creditPoints;
    }

    public void apply(Student student) {
        applications.add(student);
    }

    public int getNumberOfApplications() {
        return applications.size();
    }
}
