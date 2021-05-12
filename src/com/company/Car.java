package com.company;

public class Car extends Technics {

    protected Car(String name, String color, String description) {
        super(name, color, description);
    }

    @Override
    protected String sound() {
        return "ррр";
    }
    protected String show() {
        return "Jaguar";
    }
    protected String desc() {
        return "Легковой автомобиль";
    }
}
