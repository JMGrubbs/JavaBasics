package com.John;

public class Main {

    public static void main(String[] args) {
        TV bigTV = new TV(70, 1980, true);
        Sofa blackSofa = new Sofa("lether", "black", 4);
        Table squareTable = new Table(7070, "white");
        Carpet pladCarpet = new Carpet(150150, "pladWhiteBlack");
	    Room livingRoom = new Room(bigTV,blackSofa,squareTable,pladCarpet);

        livingRoom.sitDown();
        livingRoom.setDownDrink();
	    livingRoom.turnonTV();

    }
}
