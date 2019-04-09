package com.John;

import javax.sound.midi.Soundbank;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tails;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,
               int eyes, int legs, int tails, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tails = tails;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        this.chew();
        super.eat();
    }

    private void chew(){
        System.out.println("dogs chew(overide eat)");
    }

    public void walk(){
        System.out.println("Dog walks");
        move( 5);
    }

    public void run(){
        System.out.println("Dog runs");
        move(10);
    }
}
