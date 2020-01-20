package io.jonashackt.lectures.domain;

public class FacilityManager extends Person implements Employee {

    public FacilityManager(String name) {
        super(name);
    }

    @Override
    public String getMitarbeiterId() {

        return "subunternehmer.getId()";
    }
}
