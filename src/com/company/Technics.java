package com.company;

public class Technics {

    // Constructor
    protected Technics(String name, String color, String description) {
        this.name = name;
        this.color = color;
        this.description = description;
    }

    // Fields
    protected String name;

    protected String color;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    protected String description;


    // Methods
    protected String sound() {
        return sound();
    }
    protected String show() {
        return show();
    }
    protected String desc() {
        return desc();
    }


    // Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
