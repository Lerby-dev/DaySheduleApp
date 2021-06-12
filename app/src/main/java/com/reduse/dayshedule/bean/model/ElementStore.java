package com.reduse.dayshedule.bean.model;



import java.util.List;
import java.util.UUID;

public interface ElementStore {
    List<Element> getElement();
    Element getById(UUID id);
    void deleteElement(Element element);
    void deleteElement(UUID id);
    void insert(Element element);

    void addListener(Listener listener);
    void removeListener(Listener listener);

    interface Listener{
        void onElementListChanged();
    }
}
