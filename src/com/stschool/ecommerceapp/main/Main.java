package com.stschool.ecommerceapp.main;

import com.stschool.ecommerceapp.controller.CustomerController;
import com.stschool.ecommerceapp.model.Customer;
import com.stschool.ecommerceapp.ui.CustomerMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Welcome to Ecommerce--");
        System.out.println("1.SignUp");
        System.out.print("Enter Your Choice: ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                CustomerMenu customerMenu = new CustomerMenu();
                Customer customer = new Customer();
                customer = customerMenu.inputSignUpData();
                CustomerController customerController = new CustomerController();
                customerController.handleInputSignupData(customer);
                break;

        }
    }
}
