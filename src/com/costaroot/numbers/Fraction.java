package com.costaroot.numbers;

public class Fraction {
    private long intPart;
    private short fractionPart;

    public Fraction ( long intPart, short fractionPart ){
        this.intPart = intPart;
        this.fractionPart = fractionPart;
    }

    public long getIntPart(){
        return intPart;
    }

    public short getFractionPart(){
        return fractionPart;
    }

    @Override
    public String toString() {
        return "Number= " + intPart +
                "," + fractionPart;
    }

    public int countOfDec(){
        return String.valueOf( fractionPart ).length();
    }

    public void addition( Fraction num ){


    }
}
