package com.John;

public class Printer {

    private int tonerLvl;
    private int numOfPages;
    private boolean deuplex;

    public Printer(int tonerLvl, int numOfPages, boolean deuplex) {

        if(tonerLvl>0 && tonerLvl<=100){
            this.tonerLvl = tonerLvl;
        }else if(tonerLvl > 100){
            this.tonerLvl = 100;
        }
        this.numOfPages = numOfPages;
        this.deuplex = deuplex;
    }


    public void fillToner(){
        this.tonerLvl = 100;
        System.out.println("Toner Full!");
    }

    public void printPage(int pages){
        if(tonerLvl >=25){
            this.tonerLvl = this.tonerLvl - (2*pages);
            this.numOfPages = this.numOfPages + pages;
            System.out.println("You printed " + pages +
                                " pages. Toner at " + this.tonerLvl + "%" );
        }else{
            System.out.println("Not enough toner!! Please refill.");
        }
    }


    public int getTonerLvl() {
        System.out.println("tonerLvl is " + this.tonerLvl);
        return tonerLvl;
    }

    public int getNumOfPages() {
        System.out.println("Number of pages printed= " + this.numOfPages);
        return numOfPages;
    }

    public boolean isDeuplex() {
        return deuplex;
    }
}
