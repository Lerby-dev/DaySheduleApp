package com.reduse.dayshedule.bean.model;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.reduse.dayshedule.bean.room.TemplateEntity;

import java.util.List;

@Dao
public interface TemplateDao {

    @Query("SELECT * FROM TemplateEntity")
    List<TemplateEntity> getAllTemplate();

    @Query("SELECT * FROM TemplateEntity WHERE id == :idParam")
    TemplateEntity getTemplateById(String idParam);

    @Insert
    void add(TemplateEntity templateEntity);

    @Delete
    void delete(TemplateEntity templateEntity);

    @Update
    void update(TemplateEntity templateEntity);
}
