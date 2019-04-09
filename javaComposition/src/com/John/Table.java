package com.John;

public class Table {
    private int dementions;
    private String color;

    public Table(int dementions, String color) {
        this.dementions = dementions;
        this.color = color;
    }

    public void setDrinkOnTable(){
        System.out.println("clink");
    }

    public int getDementions() {
        return dementions;
    }

    public String getColor() {
        return color;
    }
}
