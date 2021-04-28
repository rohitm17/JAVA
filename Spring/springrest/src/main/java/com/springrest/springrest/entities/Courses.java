package com.springrest.springrest.entities;

public class Courses {

    private long id;
    private String name;
    private String description;

    public Courses(long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Courses() {
        super();
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", name='" + getName() + "'" + ", description='" + getDescription() + "'"
                + "}";
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
