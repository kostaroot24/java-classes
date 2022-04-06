package com.costaroot.vehicles;

public class Car {
    private String carName;
    private boolean isMove;
    private boolean isEngine;
    private double speed;

    public Car ( String carName ){
        this.carName = carName;
        speed = 0;
        isEngine = false;
        isMove = false;
    }

    public void startEngine(){
        if ( isEngine ){
            System.out.println("Engine was run before");
        }else{
            isEngine = true;
            System.out.println("Engine run success");
        }
    }

    public void stopEngine(){
        if ( isMove ){
            System.out.println("Please stop car before");
        }else if( isEngine ){
            System.out.println("Engine is stopped");
            isEngine = false;
        }else {
            System.out.println("Engine is not running! Please, check!");
        }
    }

    @Override
    public String toString() {
        return "carName='" + carName + '\'';
    }

    public void startMove ( double speed){
        if ( isEngine ){
            this.speed = speed;
            isMove = true;
            System.out.println("Car start run with "+speed+" km/h");
        }else{
            System.out.println("Please start engine before!");
        }
    }
}
