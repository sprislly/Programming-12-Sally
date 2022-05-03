package com.sally.module1.l3;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> shape = new ArrayList<>();
        shape.add(10);
        shape.add(5);
        shape.add(4);
        shape.add(2);
        shape.add(8);
        shape.add(12);
        shape.add(6);
        shape.add(3);
        shape.add(9);
        shape.add(18);

        System.out.println("Circles:");

        for (Integer integer : shape) {
            System.out.println(new Circle(integer));
        }

        System.out.println("\nTriangles:");

        for(int i = 0; i < shape.size() - 1; i++) {
            System.out.println(new Triangle(shape.get(i), shape.get(i+1)));
        }
    }
}
