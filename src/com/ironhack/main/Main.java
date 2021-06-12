package com.ironhack.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

//        String x = "  hola  mundo ";
//        x.trim();
//        System.out.println(x);

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Welcome to this app");
//        System.out.println("Please introduce your name");
//
//        String name = scanner.nextLine();
//        System.out.println("Hello " + name);
//
//        int age;
//
//        do {
//            System.out.println("Please introduce your age");
//            age = scanner.nextInt();
//        } while(age < 0);
//
//        if (age < 18) {
//            System.err.println("Forbidden access");
//        } else  {
//            System.out.println("Access granted");
//        }
//        scanner.close();

        FileWriter writer = new FileWriter("demo.txt", true);
        writer.write("Hola mundo :D\n");
        writer.write("Segunda línea\n");
        writer.close();

        File file = new File("demo.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();


    }
}
