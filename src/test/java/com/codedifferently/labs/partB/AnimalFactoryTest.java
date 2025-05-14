package com.codedifferently.labs.partB;

import partB.factories.AnimalFactory;

import java.util.Date;

public class AnimalFactoryTest {
    public static void main(String[] args) {
        AnimalFactory dog = new AnimalFactory();
        AnimalFactory cat = new AnimalFactory();

        dog.createDog("Woofus", new Date(2005-11-21));
        cat.createCat("Whiskers", new Date(2010-1-8));
    }
}
