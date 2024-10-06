package ru.design_patterns.adapter;

public class AdapterCoin implements IGame {
    Coin coin;

    public AdapterCoin(Coin coin) {
        this.coin = coin;
    }

    public int flip() {
        return coin.toss();
    }
}
