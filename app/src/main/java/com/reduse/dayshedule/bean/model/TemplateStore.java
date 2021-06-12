package com.reduse.dayshedule.bean.model;

import java.util.List;
import java.util.UUID;

public interface TemplateStore {

    List<Template> getTemplate();
    Template getById(UUID id);
    void deleteTemplate(Template template);
    void deleteTemplate(UUID id);
    void insert(Template template);

    void addListener(Listener listener);
    void removeListener(Listener listener);

    interface Listener{
        void onTemplateListChanged();
    }
}
