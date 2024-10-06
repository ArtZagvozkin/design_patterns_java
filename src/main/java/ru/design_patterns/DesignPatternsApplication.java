package ru.design_patterns;

import ru.design_patterns.adapter.AdapterCoin;
import ru.design_patterns.adapter.Coin;
import ru.design_patterns.adapter.Dice;
import ru.design_patterns.adapter.Gamer;

public class DesignPatternsApplication {
    public static void main(String[] args) {
        runAdapter();
    }

    private static void runAdapter() {
        Dice dice = new Dice();
        Coin coin = new Coin();
        AdapterCoin adapterCoin = new AdapterCoin(coin);
        Gamer gamer1 = new Gamer("Иван");

        System.out.printf("Игрок %s бросил кость: %d\n", gamer1, gamer1.play(dice));
        System.out.printf("Игрок %s бросил монету: %d\n", gamer1, gamer1.play(adapterCoin));
    }
}
