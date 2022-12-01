package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number");
        switch (scanner.nextInt()){
            case 1:
                Registration.validFirstName();
                break;
            case 2:
                Registration.validLastName();
                break;
            case 3:
                Registration.validEmail();
                break;
            case 4:
                Registration.validMobileNumber();
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

    public static void validEmail() {
        System.out.print("Enter Email : ");
        String email = scanner.next();
        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Email is valid");
        else
            System.out.println("Email is Invalid");
    }

    public static void validMobileNumber() {
        System.out.print("Enter Mobile Number : ");
        String mobileNo = scanner.nextLine();
        String regex = "^[9]{1}[1]{1}[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Mobile Number is valid");
        else
            System.out.println("Mobile Number is Invalid");
    }
}