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

    public void setFractionPart(short fractionPart) {
        this.fractionPart = fractionPart;
    }

    @Override
    public String toString() {
        return "Number= " + intPart +
                "," + fractionPart;
    }

    public int countOfDec(){
        return String.valueOf( fractionPart ).length();
    }

    private void dropNumber( int count ){
        System.out.println("Blocked!");
    }

    public void addition( Fraction num ){
        System.out.println("Will be add"+num.toString());
        int check = this.countOfDec();
        if ( this.countOfDec() == num.countOfDec() ) {
            this.fractionPart = (short) (num.getFractionPart() + fractionPart);
        }else{
            if ( this.countOfDec() > num.countOfDec() ){
                num.setFractionPart( ( short ) (num.getFractionPart() *
                        Math.pow(10,this.countOfDec() - num.countOfDec() )));
            }else {
                this.setFractionPart( ( short ) (this.getFractionPart() *
                        Math.pow(10,num.countOfDec() - this.countOfDec() )));
            }
            this.fractionPart = (short) (num.getFractionPart() + fractionPart);
        }
        System.out.println(this.toString());
    }
}
