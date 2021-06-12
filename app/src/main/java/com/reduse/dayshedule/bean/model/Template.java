package com.reduse.dayshedule.bean.model;

import java.util.UUID;

public class Template {
    private String title;
    private UUID id;


    public Template(String title) {
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
