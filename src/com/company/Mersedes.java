package com.company;

public class Mersedes extends Car {
    public String country;


    public Mersedes(String name, String country) {
        super(name);
        this.country = country;
    }

    @Override
    public void print() {
        System.out.println("Страна:"+ country +
                "\nИмя:"+ name);
    }
}
