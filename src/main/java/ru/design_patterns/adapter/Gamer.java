package ru.design_patterns.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Gamer {
    private String name;
    
    public Gamer(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    public int play(IGame iGame) {
        return iGame.flip();
    }
}
