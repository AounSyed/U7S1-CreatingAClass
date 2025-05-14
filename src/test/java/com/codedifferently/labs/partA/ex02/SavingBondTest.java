package com.codedifferently.labs.partA.ex02;

import partA.ex02.SavingBond;

public class SavingBondTest {
    public static void main(String[] args) {
        SavingBond test = new SavingBond();
        test.bond = 100;
        test.months = 3;

        test.termAndInterest();
    }
}
