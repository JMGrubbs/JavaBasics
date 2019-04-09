package com.John;

class Car {
    private String name;
    private boolean engine;

    public Car(String name) {
        this.name = name;
        this.engine = true;
    }

    public String move() {
        return "Now moving";
    }

    public String hitBreak(){
        return "Hitting breaks!";
    }


    public String getName() {
        return name;
    }
}

class Pickup extends Car {
    public Pickup() {
        super("Pickup");
    }

    public String move() {
        return "Pickup now moving";
    }
}

class Accent extends Car {

    public Accent() {
        super("Accent");
    }

    @Override
    public String move() {
        return "Accent now moving";
    }
}

class Focus extends Car {

    public Focus() {
        super("Focus");
    }

    @Override
    public String move() {
        return "Focus now moving";
    }
}

class Forgetable extends Car {
    public Forgetable() {
        super("Forgetable now moving");
    }

    // No plot method
}


public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Car car = randomCar();
            System.out.println("Movie #" + i +
                    " : " + car.getName() + "\n" +
                    "Car: " + car.move() + "\n" +
                    "Car: " + car.hitBreak());
        }
    }

    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 4) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Pickup();
            case 2:
                return new Accent();
            case 3:
                return new Focus();
            case 4:
                return new Forgetable();
        }

        return null;
    }
}



