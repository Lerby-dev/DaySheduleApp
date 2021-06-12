package com.reduse.dayshedule.bean.model;

import java.util.UUID;

public class Element {

    private String title;
    private UUID id;
    private double time;
    public Element(){
        this.id = UUID.randomUUID();
    }
    public Element(String title, double time) {
        this.title = title;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
