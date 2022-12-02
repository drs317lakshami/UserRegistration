package com.bridgelabz.regex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3");
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
            case 5:
            	Registration.validPasswordRule1();
                break;
            case 6:
            	Registration.validPasswordRule2();
                break;
            case 7:
            	Registration.validPasswordRule3();
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
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Mobile Number is valid");
        else
            System.out.println("Mobile Number is Invalid");
    }

    public static void validPasswordRule1() {
        System.out.print("Enter Password Rule1 : ");
        String passwordRule1 = scanner.nextLine();
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule1 is valid");
        else
            System.out.println("Password must have 8 character");
    }

    public static void validPasswordRule2() {
        System.out.print("Enter Password Rule2 : ");
        String passwordRule2 = scanner.nextLine();
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule2 is valid");
        else
            System.out.println("Password must have atleast one uppercase letter");
    }

    public static void validPasswordRule3() {
        System.out.print("Enter Password Rule3 : ");
        String passwordRule3 = scanner.nextLine();
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();

        if (result)
            System.out.println("Password Rule3 is valid");
        else
            System.out.println("Password must have atleast one numeric number");
    }
}