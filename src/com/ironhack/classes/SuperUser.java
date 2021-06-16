package com.ironhack.classes;

public class SuperUser extends User {
    private String role;

    public SuperUser(String name, String email, String role) {
        super(name, "Campaña", email);
        this.role = role;
    }

    public SuperUser(String name, String email, int age, String role) {
        super(name, email, age);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {

        if (super.getFullName() == "Maria Campaña") {
            System.out.println("no");
        }

        this.role = role;
    }
}
