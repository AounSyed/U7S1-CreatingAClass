package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import partB.animals.Animal;
import partB.animals.Cat;
import partB.animals.Mammal;
import partB.food.Food;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    public static void main(String[] args) {
        Cat test = new Cat("", new Date(), 6);
        Food food = new Food();

        test.setName("Whiskers");
        test.setBirthDate(new Date(1-1-2000));
        test.speak();
        test.eat(food);
        test.getId();
        Assertions.assertTrue(test instanceof Animal);
        Assertions.assertTrue(test instanceof Mammal);
    }

}
