package com.John;

public class Room {
    private TV tv;
    private Sofa sofa;
    private Table coffeeTablee;
    private Carpet plad;

    public Room(TV tv, Sofa sofa, Table coffeeTablee, Carpet plad) {
        this.tv = tv;
        this.sofa = sofa;
        this.coffeeTablee = coffeeTablee;
        this.plad = plad;
    }

    public void sitDown(){
        sofa.sitOnSofa();
    }

    public void setDownDrink(){
        coffeeTablee.setDrinkOnTable();
    }

    public void turnonTV(){
        tv.playMovie();
    }

    public TV getTv() {
        return tv;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Table getCoffeeTablee() {
        return coffeeTablee;
    }

    public Carpet getPlad() {
        return plad;
    }
}
