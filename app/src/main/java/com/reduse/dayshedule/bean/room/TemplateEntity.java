package com.reduse.dayshedule.bean.room;


import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TemplateEntity {


    @PrimaryKey
    @NonNull
    public String id;
    public String title;

}
