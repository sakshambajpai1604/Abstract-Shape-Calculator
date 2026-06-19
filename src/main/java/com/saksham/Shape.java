package com.saksham;

abstract class Shape {
    protected String color;

    Shape(String color) {
        this.color = color;
    }

    abstract double area();
}
