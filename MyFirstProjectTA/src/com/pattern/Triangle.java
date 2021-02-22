package com.pattern;

public final class Triangle {
    private int a;
    private int b;
    private int c;

    private static Triangle instance = null;

    private Triangle (){
    }

    public static Triangle getInstance(){
        if (instance == null)
            instance = new Triangle();
        return instance;
    }

    public int calculatePerimeter(){
        return a + b + c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
