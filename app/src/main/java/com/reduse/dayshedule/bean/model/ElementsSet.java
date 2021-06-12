package com.reduse.dayshedule.bean.model;

import java.util.ArrayList;
import java.util.UUID;

public class ElementsSet {
    private ArrayList<Element> elements;
    private UUID id;


    public ElementsSet(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ArrayList<Element> getElements() {
        return elements;
    }

    public void setElements(ArrayList<Element> elements) {
        this.elements = elements;
    }
}
