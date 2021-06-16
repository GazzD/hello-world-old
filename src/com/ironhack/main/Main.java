package com.ironhack.main;

import com.ironhack.classes.Calculator;
import com.ironhack.classes.SuperUser;
import com.ironhack.classes.User;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world :D");
        oopClass();

    }

    public static void oopClass() {
        User.idCount++;
        User user = new User("Víctor", "vcardozof@gmai.com", 31);
        User user2 = new User("David", "ddiaz@gmai.com", 26);

        user.setName("Víctor2");
        user.lastname = "Cardozo";
        System.out.println(user.lastname);
        System.out.println(user.getName());


        System.out.println(user.getId());
        System.out.println(user2.getId());

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 4));

        System.out.println(user.getType());

        System.out.println(Calculator.PI);

        SuperUser superUser  = new SuperUser("Maria", "mcapaña@gmail.com", 27, "SENIOR DEVELOPER");

        System.out.println(superUser.getRole());
        System.out.println(superUser.getName());
    }

    public static void fileClass() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to this app");
        System.out.println("Please introduce your name");

        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        int age;

        do {
            System.out.println("Please introduce your age");
            age = scanner.nextInt();
        } while(age < 0);

        if (age < 18) {
            System.err.println("Forbidden access");
        } else  {
            System.out.println("Access granted");
        }
        scanner.close();

        FileWriter writer = new FileWriter("demo.txt", true);
        writer.write("Hola mundo :D\n");
        writer.write("Segunda línea\n");
        writer.close();

        File file = new File("demo.txt");
        scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }

        scanner.close();
    }

}
