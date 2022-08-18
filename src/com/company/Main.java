package com.company;

public class Main {

    public static void main(String[] args) {
    creatObjekt("Бмв").print();
        System.out.println("--------");
    creatObjekt("Мерседес").print();
        System.out.println("-------");
    creatObjekt("Тойота").print();
    }
    public static Car creatObjekt (String classname){
        switch (classname){
            case "Бмв":
                return new Bmw("Бмв","Черный");
            case "Мерседес":
                return new Mersedes("Мерседес","Германия");
            case "Тойота":
                return new Toyota("Тойота",2022);
            default:
                return null;
        }
    }
        }


