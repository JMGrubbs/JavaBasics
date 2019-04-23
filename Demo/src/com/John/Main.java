package com.John;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("1");
        placesToVisit.add("2");
        placesToVisit.add("3");
        placesToVisit.add("4");
        placesToVisit.add("5");
        placesToVisit.add("6");

        printList(placesToVisit);

        placesToVisit.add(0, "7");
        printList(placesToVisit);

        placesToVisit.remove(0);
        printList(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i= linkedList.iterator();
        while(i.hasNext()){
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("===========================");
    }
}
