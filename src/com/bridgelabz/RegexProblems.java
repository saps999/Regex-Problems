package com.bridgelabz;

import java.util.*;
import java.util.regex.Pattern;

public class RegexProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First name: ");
        boolean firstName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + firstName);

        System.out.println(" ");

        System.out.print("Enter last name: ");
        boolean lastName = Pattern.matches("[A-Z][a-z]{3,}", sc.next());
        System.out.println("Result : " + lastName);

        System.out.println(" ");

        System.out.print("Enter your e-mail id: ");
        boolean email = Pattern.matches("[a-zA-Z0-9]+[@][a-zA-Z]{3,15}[.][a-zA-Z]{2,5}", sc.next());
        System.out.println("Result : " + email);

        System.out.println(" ");
    }
}
