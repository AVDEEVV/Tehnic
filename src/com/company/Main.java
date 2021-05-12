package com.company;

public class Main {

    public static void main(String[] args) {

        Ship ship = new Ship("Titanic", "Black", "Steel");
        System.out.println(ship.getName());
        System.out.println(ship.getDescription());
        System.out.println(ship.sound());
        System.out.println(ship.getColor());
        System.out.println(ship.show());
        System.out.println(ship.desc());
    }
}
