package com.reduse.dayshedule.bean.model;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.reduse.dayshedule.bean.room.ElementsSetEntity;

import java.util.List;

@Dao
public interface ElementsSetDao {
    @Query("SELECT * FROM ElementsSetEntity")
    List<ElementsSetEntity> getAllElementsSet();

    @Query("SELECT * FROM ElementsSetEntity WHERE id == :idParam")
    ElementsSetEntity getElementsSetById(String idParam);

    @Insert
    void add(ElementsSetEntity elementsSetEntity);

    @Delete
    void delete(ElementsSetEntity elementsSetEntity);

    @Update
    void update(ElementsSetEntity elementsSetEntity);
}
