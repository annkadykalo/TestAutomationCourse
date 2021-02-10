package com.birds;

public class Penguin extends NonFlyingBird{

    @Override
    public String sing() {
        return "FR-FR-FRR!";
    }

    @Override
    public int layEggs() {
        return 1;
    }
}
