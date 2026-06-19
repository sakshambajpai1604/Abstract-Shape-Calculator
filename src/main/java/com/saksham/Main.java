package com.saksham;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle("Red", 5));
        shapes.add(new Rectangle("Blue", 4, 6));
        shapes.add(new Triangle("Green", 3, 4, 5));

        for (Shape shape : shapes) {
            System.out.printf("%.2f%n", shape.area());
        }

        // Uncommenting the line below will cause a compile-time error
        // Shape s = new Shape("Black");
    }
}