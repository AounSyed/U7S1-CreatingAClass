package com.codedifferently.labs.partB;

import partB.animals.Cat;
import partB.storage.CatHouse;

import java.util.Date;

public class CatHouseTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Whiskers", new Date(1-1-2000), 1);

        CatHouse.add(cat1);
        CatHouse.remove(cat1);
        CatHouse.remove(1);
        CatHouse.getCatById(1);
        CatHouse.getNumberOfCats();
    }
}
