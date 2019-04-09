package com.John;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(300, 5, true);
        printer.getNumOfPages();
        printer.getTonerLvl();

        printer.printPage(40);
        printer.printPage(40);
        printer.fillToner();
        printer.printPage(42);

    }
}
