package com.John;

public class Main {

    public static void main(String[] args) {
	    Animal animal = new Animal("Animal", 1, 1, 5,
                5);

	    Dog dog = new Dog("Lab", 1, 1, 20,
                60, 2, 4, 1, 20, "Short");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
