package io.jonashackt.lectures.domain;

public class HasNoAcademicGradeException extends Exception {

    public HasNoAcademicGradeException() {
        super();
    }

    public HasNoAcademicGradeException(String message) {
        super(message);
    }

    public HasNoAcademicGradeException(String message, Throwable cause) {
        super(message, cause);
    }
}
