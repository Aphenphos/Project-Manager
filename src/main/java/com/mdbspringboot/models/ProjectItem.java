package com.mdbspringboot.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;
import java.util.UUID;

@Document("projectitems")
public class ProjectItem {
    @MongoId
    private UUID _id;

    private String name;

    public UUID getId() {
        return _id;
    }

    public void setId(UUID _id) {
        this._id = _id;
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

    public ProjectItem(String name, String description, List<String> notes) {
        super();
        this._id = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.notes = notes;
    }

}
