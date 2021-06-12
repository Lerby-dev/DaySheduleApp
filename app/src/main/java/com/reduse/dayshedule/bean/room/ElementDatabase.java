package com.reduse.dayshedule.bean.room;


import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
            entities = {ElementEntity.class,ElementsSetEntity.class,TemplateEntity.class},
            version = 1,
            exportSchema = false
)
public abstract class ElementDatabase extends RoomDatabase {


    //TODO abstract elementDao func
}
