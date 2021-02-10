package com.birds;

public class Main {
    public static void main(String[] args) {
        Bird e1 = new Eagle();
        Bird e2 = new Penguin();

        System.out.println(e1.hasWings());
        System.out.println(e1.sing());

        System.out.println(e2.hasWings());
        System.out.println(e2.sing());
    }
}
