package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String fullName;
    private double cash;


    public Customer(String fName, String lName, double money) {
        firstName = fName;
        lastName = lName;
        cash = money;
        fullName = firstName + " " + lastName;
    }

    public Customer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        fullName = firstName + " " + lastName;
        cash = 0.0;
    }
}
