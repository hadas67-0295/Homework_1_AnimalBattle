package com.example.homework1_animalbattle;

public class Monkey extends Animal {
    public Monkey() {
        super(7);
    }
    @Override
    public String battle(Animal other) {
        if (this.strength == other.strength) {
            return "it is a tie";
        } else if (this.strength > other.strength) {
            return "Monkey wins";
        }
        return "";
    }
}