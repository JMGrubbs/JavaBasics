package com.John;

public class Octopus extends Animal{

    private int tenticals;
    private int eyes;
    private String color;

    public Octopus(String name, int size, int weight,
                   int tenticals, int eyes, String color) {
        super(name, 1, 1, size, weight);
        this.tenticals = tenticals;
        this.eyes = eyes;
        this.color = color;
    }

    private void rest(){

    }

    private void moveMucles(){

    }

    private void moveTenticals(){

    }

    private void swim(int speed){
        moveMucles();
        moveTenticals();
        super.move(speed);
    }
}
