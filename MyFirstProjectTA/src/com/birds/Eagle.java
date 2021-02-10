package com.birds;

public class Eagle extends FlyingBird {
    @Override
    public String sing() {
        return "EW-EW-EW!";
    }

    @Override
    public int layEggs() {
        return 2;
    }
}
