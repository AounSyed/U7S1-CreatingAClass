package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {public static void main(String[] args) {
    CheckingAccount test = new CheckingAccount();
    test.name = "Damien";
    test.totalbalance = 500;
    test.deposit(1000);
    test.displayCustomer();
}
}
