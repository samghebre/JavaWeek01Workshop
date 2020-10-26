package com.codedifferently.part01;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        if(name.equals("Hakeem") || name.equals("Rasheeda")) {
            System.out.println("Hello, " + name);
        }
        else {
            System.out.println("Sorry! I didn't recognize your name. ");
        }
    }
}
