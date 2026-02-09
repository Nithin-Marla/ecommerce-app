package com.stschool.ecommerceapp.ui;

import com.stschool.ecommerceapp.model.Customer;

import java.util.Scanner;

public class CustomerMenu {
    public Customer inputSignUpData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Id: ");
        String id = sc.next();
        System.out.print("Enter FirstName : ");
        String firstName = sc.next();
        System.out.print("Last name: ");
        String lastName = sc.next();
        System.out.print("ContactNumber: ");
        String contactNumber = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("password: ");
        String password = sc.next();

        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setContactNumber(contactNumber);
        customer.setEmail(email);
        customer.setPassword(password);
        sc.close();
        return customer;


    }
}
