package com.pattern;

public class Main {
    public static void main (String[] args) {
        Soldier.Builder builder =  new Soldier.Builder()
                .setBadgeNumber(123)
                .setBloodType("1-")
                .setName("Jane")
                .setSex("woman")
                .setRank("officer");

        Soldier jane = builder.build();
        Soldier daria = builder
                        .setName("Daria")
                        .build();

//        System.out.println("Soldier " + jane.getName() + '\t' + jane.getRank());
//        System.out.println("Soldier " + daria.getName() + '\t' + daria.getRank());
//        System.out.println("Soldier " + jane.getName() + '\t' + jane.getRank());

        Triangle triangle1 = Triangle.getInstance();

        triangle1.setA(3);
        triangle1.setB(4);
        triangle1.setC(5);

        System.out.println("Perimeter 1: " + triangle1.calculatePerimeter());

        Triangle triangle2 = Triangle.getInstance();

        System.out.println("Perimeter 2: " + triangle1.calculatePerimeter());
    }
}
