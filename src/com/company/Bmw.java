package com.company;

public class Bmw extends Car {
    public String color;


    public Bmw(String name, String color) {
        super(name);
        this.color = color;

    }


    @Override
    public void print() {
        System.out.println("Цвет:"+ color+
                "\nИмя:"+ name
                );
    }

}
