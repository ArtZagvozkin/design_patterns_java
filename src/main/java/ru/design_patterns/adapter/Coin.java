package ru.design_patterns.adapter;

import java.util.Random;

public class Coin {
    Random rand;

    public Coin() {
        rand = new Random();
    }

    //бросок монеты
    public int toss() {
        return rand.nextInt(2);
    }
}
