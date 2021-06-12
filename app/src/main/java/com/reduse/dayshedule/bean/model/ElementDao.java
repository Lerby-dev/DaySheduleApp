package com.reduse.dayshedule.bean.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.reduse.dayshedule.bean.room.ElementEntity;

import java.util.List;

@Dao
public interface ElementDao {
    @Query("SELECT * FROM ElementEntity")
    List<ElementEntity> getAllElement();

    @Query("SELECT * FROM ElementEntity WHERE id == :idParam")
    ElementEntity getElementById(String idParam);

    @Insert
    void add(ElementEntity elementEntity);

    @Delete
    void delete(ElementEntity elementEntity);

    @Update
    void update(ElementEntity elementEntity);
}
