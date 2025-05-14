package com.codedifferently.labs.partB;

import partB.animals.Cat;
import partB.animals.Dog;
import partB.storage.DogHouse;

import java.util.Date;

public class DogHouseTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rory", new Date(12-12-2009), 3);

        DogHouse.add(dog1);
        DogHouse.remove(dog1);
        DogHouse.remove(3);
        DogHouse.getDogById(3);
        DogHouse.getNumberOfDogs();
    }
}
