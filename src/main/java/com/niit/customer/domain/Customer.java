package com.niit.customer.domain;

public class Customer {
    private int id;
    private String firstname;
    private String lastname;
    private String email;
    private String address;
    private long phone;

    public Customer() {
    }

    public Customer(int id, String firstname, String lastname, String email, String address, long phone) {a
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.phone = phone;
    }
}
