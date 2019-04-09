package com.John;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats is your yearn of birth?");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int birthDate = scanner.nextInt();
            scanner.nextLine(); // <-- here to handle the enter key needed
            // for every input
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2018 - birthDate;
            if (age >= 0 && age <= 100){
                System.out.println("Your name is "+ name + " and you are "
                        + age + " years old");
            }else{
                System.out.println("Invalid year of birth");
            }
        }else{
            System.out.println("Unable to pares year of birth");
        }

        scanner.close();


    }
}
