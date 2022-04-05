package com.costaroot;

public class Circle {
    private static int countClass = 0;
    private double radius;

    public Circle ( double radius ){
        this.radius = radius;
        countClass++;
    }

    public double areaCircle(){
        return radius * radius * Math.PI;
    }

    public int circleCount(){
        return countClass;
    }
}
