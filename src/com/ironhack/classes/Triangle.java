package com.ironhack.classes;

public class Triangle extends Shape {

    public Triangle(int height, int width) {
        super(height, width);
    }

    public double calculateArea() {
        return getWidth() * getHeight() / 2;
    }
}
