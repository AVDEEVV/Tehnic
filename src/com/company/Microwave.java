package com.company;

public class Microwave extends Technics {

    protected Microwave(String name, String color, String description) {
        super(name, color, description);
    }

    @Override
    protected String sound() {
        return "Жужжание";
    }
    protected String show() {
        return "Микроволновая печь";
    }
    protected String desc() {
        return "Встраиваемая микроволновая печь";
    }
}
