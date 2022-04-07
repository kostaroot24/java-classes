package com.costaroot;

import com.costaroot.vehicles.Car;

public class Main {

    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Circle c2 = new Circle(2.3);
        System.out.println("Area = "+c1.areaCircle());
        System.out.println("Count objects= "+c1.circleCount());
        Car bmw = new Car("bmw");
        System.out.println(bmw.toString());
        new Executor().run();
    }
}
