package com.company;

public class Ship extends Technics {

    protected Ship(String name, String color, String description) {
        super(name, color, description);
    }

    @Override
    protected String sound() {
        return "Гул";
    }
    protected String show() {
        return "Корабль";
    }
    protected String desc() {
        return "Корабль оснащен паровым двигателем";
    }
}
