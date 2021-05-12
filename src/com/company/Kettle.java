package com.company;

public class Kettle extends Technics {


    protected Kettle(String name, String color, String description) {
        super(name,color, description);
    }

    @Override
    protected String sound() {
        return "Свист";
    }
    protected String show() {
        return "Чайник";
    }
    protected String desc() {
        return "Электрический чайник";
    }
}
