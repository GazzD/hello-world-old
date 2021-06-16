package com.ironhack.classes;

public class User {
    public static int idCount = 0;
    private int id;
    private String name;
    public String lastname;
    private String email;
    private int age;

    private final String TYPE = "AWESOME";

    public User(String name, String lastname, String email) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
    }

    public User(String name, String email, int age) {
        setId(++idCount);
        setName(name);
        setEmail(email);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 ? 0 : age;
    }

    public String getType() {
        return TYPE;
    }

    public String getFullName() {
        return name + "" + lastname;
    }
}
