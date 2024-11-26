package com.example.homework1_animalbattle;

public class Elephant extends Animal {
    public Elephant() {
        super(20);
    }
    @Override
    public String battle(Animal other) {
        if (this.strength == other.strength) {
            return "it is a tie";
        } else if (this.strength > other.strength) {
            return "Elephant wins";
        }
        return "";
    }
}