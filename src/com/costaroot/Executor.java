package com.costaroot;

import com.costaroot.numbers.Fraction;

public class Executor {

    public void run(){
        testNumber();
    }

    private void testNumber(){
        Fraction x = new Fraction(1l,( short ) 52);
        System.out.println(x.toString());
        //x.addition(new Fraction(10l, ( short ) 831));
        x.compareNum(new Fraction(1l,( short ) 501));
        x.mulplyNum(new Fraction(10l,( short ) 1));
    }
}
