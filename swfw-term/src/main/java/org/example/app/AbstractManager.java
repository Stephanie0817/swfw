package org.example.app;

import java.util.List;

public interface AbstractManager {
    void addEntry(Object entry);
    List<Object> getAllEntries();
}