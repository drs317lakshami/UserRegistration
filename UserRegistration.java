package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name");
        switch (scanner.nextInt()){
            case 1:
                Registration.validFirstName();
                break;
            case 2:
                Registration.validLastName();
                break;
        }
    }
}

 class Registration {

    public static final Scanner scanner = new Scanner(System.in);

    public static void validFirstName() {
        System.out.print("Enter the First Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is Invalid");
    }

    public static void validLastName() {
        System.out.print("Enter the Last Name : ");
        String name = scanner.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Last name is valid");
        else
            System.out.println("Last name is Invalid");
    }
}