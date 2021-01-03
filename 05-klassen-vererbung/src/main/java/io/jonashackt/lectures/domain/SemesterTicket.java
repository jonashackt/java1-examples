package io.jonashackt.lectures.domain;

public class SemesterTicket {

    private long id;

    public SemesterTicket() {
        this.id = Math.round(Math.random());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
