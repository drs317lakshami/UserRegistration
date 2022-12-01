package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {
    	Registration.validFirstName();
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
}