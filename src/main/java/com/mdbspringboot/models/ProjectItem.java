package com.mdbspringboot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("projectitems")
public class ProjectItem {
    @Id
    private String id;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getNotes() {
        return notes;
    }

    public void setNotes(List<String> notes) {
        this.notes = notes;
    }

    private String description;
    private List<String> notes;

    public ProjectItem(String id, String name, String description, List<String> notes) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.notes = notes;
    }

}
