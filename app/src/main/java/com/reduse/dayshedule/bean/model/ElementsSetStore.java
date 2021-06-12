package com.reduse.dayshedule.bean.model;

import java.util.List;
import java.util.UUID;

public interface ElementsSetStore {
    List<ElementsSet> getElementsSet();
    ElementsSet getById(UUID id);
    void deleteElementsSet(ElementsSet elementsSet);
    void deleteElementsSet(UUID id);
    void insert(ElementsSet elementsSet);

    void addListener(Listener listener);
    void removeListener(Listener listener);

    interface Listener{
        void onElementsSetListChanged();
    }
}
