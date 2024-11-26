package com.example.homework1_animalbattle;

public class Lion extends Animal{
    public Lion() {
        super(10);
    }

    @Override
    public String battle(Animal other) {
        if (this.strength == other.strength) {
            return "it is a tie";
        } else if (this.strength > other.strength) {
            return "Lion wins";
        }
        return "";
    }
}
