package com.costaroot;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(2.3);
        System.out.println("Area = "+c1.areaCircle());
        System.out.println("Count objects= "+c1.circleCount());
    }
}
