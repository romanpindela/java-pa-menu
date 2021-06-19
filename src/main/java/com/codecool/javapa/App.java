package com.codecool.javapa;

import java.util.Scanner;

public class App {
    public static void main ( String[] args ) {

        String userInput;
        Scanner scanner = new Scanner(System.in);
        do {
            menu();
            userInput = scanner.nextLine();
            switch (userInput){
                case "1": option1(); break;
                case "2": option2(); break;
                case "3": option3(); break;
            }

        } while (!userInput.equals("q"));

    }

    private static void option3 () {

    }

    private static void option2 () {

    }

    private static void option1 () {

    }

    private static void menu () {
        System.out.println("Menu:");
        System.out.println("1. option1");
        System.out.println("2. option2");
        System.out.println("3. option3");
        System.out.println("q - quit program");
    }

}
