package com.example.homework1_animalbattle;

public abstract class Animal {
    protected int strength;

    public Animal(int strength) {
        this.strength = strength;
    }

    // Abstract method to be overridden in subclasses
    public abstract String battle(Animal other);
}