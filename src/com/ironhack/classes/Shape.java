package com.ironhack.classes;

public abstract class Shape {
    private int height;
    private int width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public abstract double calculateArea();

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
