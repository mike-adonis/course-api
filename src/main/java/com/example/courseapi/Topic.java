package com.example.courseapi;

public class Topic {
    private String description;
    private  String id;
    private String name;

    public Topic(String description, String id, String name) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Topic() {}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

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
}
