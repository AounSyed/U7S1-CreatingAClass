package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Dog;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

public class DogTest {
    public static void main(String[] args) {
        Dog test = new Dog("", new Date(), 2);
        Food food = new Food();

        test.setName("Roof");
        test.setBirthDate(new Date(4-6-2021));
        test.speak();
        test.eat(food);
        test.getId();
        Assertions.assertTrue(test instanceof Animal);
        Assertions.assertTrue(test instanceof Mammal);
    }
}
