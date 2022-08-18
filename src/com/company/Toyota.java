package com.company;

public class Toyota extends Car{
     public int age;

    public Toyota(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(
                "Год выпуска:"+ age +
                        "\nИмя:" + name);

    }
}
