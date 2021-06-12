package com.reduse.dayshedule.bean.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.reduse.dayshedule.bean.model.Element;

import java.util.ArrayList;

@Entity
public class ElementsSetEntity {

    @PrimaryKey
    @NonNull
    public String id;
    public ArrayList<Element> elements;

}
