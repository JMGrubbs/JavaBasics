package com.John;

public class Sofa {
    private String meterial;
    private String color;
    private int size;

    public Sofa(String meterial, String color, int size) {
        this.meterial = meterial;
        this.color = color;
        this.size = size;
    }

    public void sitOnSofa(){
        System.out.println("Ahh so comfy!!!");
    }
    public String getMeterial() {
        return meterial;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
