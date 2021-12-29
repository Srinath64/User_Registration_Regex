package org.example;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 UC-1 User need to enter a valid First Name
 */
public class UserRegistration
{
    public static void checkValidFirstName(String firstName) {

        boolean isFirstName;
        String firstNameRegex = "[A-Z]{1}[a-z]{2,}";
        Pattern patternObject = Pattern.compile(firstNameRegex);
        if (firstName == null) {
            isFirstName = false;
        }
        Matcher matcherObject = patternObject.matcher(firstName);
        isFirstName =  matcherObject.matches();

        if(isFirstName)
            System.out.println(firstName+" is an Valid First Name");
        else
            System.err.println(firstName+" is an Invalid First Name");
    }

    public static void main(String[] args) {

        System.out.println("---------- Welcome To User Registration ----------");

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter Your First Name");
        String firstName = scannerObject.next();
        checkValidFirstName(firstName);

        scannerObject.close();

    }
}
