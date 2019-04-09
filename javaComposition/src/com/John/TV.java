package com.John;

public class TV {

    private int size;
    private int resolution;
    private boolean smart;

    public TV(int size, int resolution, boolean smart) {
        this.size = size;
        this.resolution = resolution;
        this.smart = smart;
    }


    public void playMovie(){
        System.out.println("Play movies");
    }

    private int getSize() {
        return size;
    }

    private int getResolution() {
        return resolution;
    }

    private boolean isSmart() {
        return smart;
    }
}
