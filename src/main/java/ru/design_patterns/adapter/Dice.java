package ru.design_patterns.adapter;

import java.util.Random;

//Игральная кость
public class Dice implements IGame {
    Random rand;

    public Dice() {
        rand = new Random();
    }

    //Бросок кости
    public int flip() {
        return rand.nextInt(6) + 1;
    }
}
