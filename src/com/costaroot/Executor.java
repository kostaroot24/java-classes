package com.costaroot;

import com.costaroot.numbers.Fraction;

public class Executor {

    public void run(){
        testNumber();
    }

    private void testNumber(){
        Fraction x = new Fraction(1l,(short) 25);
        System.out.println(x.toString());
    }
}
