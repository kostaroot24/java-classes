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
        boolean isOverLo = false;
        if ( this.countOfDec() == num.countOfDec() ) {
            this.fractionPart = ( short ) (num.getFractionPart() + fractionPart);
        }else{
            if ( this.countOfDec() > num.countOfDec() ){
                num.setFractionPart( ( short ) (num.getFractionPart() *
                        Math.pow(10,this.countOfDec() - num.countOfDec() )));
            }else {
                this.setFractionPart( ( short ) (this.getFractionPart() *
                        Math.pow(10,num.countOfDec() - this.countOfDec() )));
            }
            this.fractionPart = ( short ) (num.getFractionPart() + fractionPart);
        }
        if ( check < this.countOfDec() ){
            this.fractionPart = ( short ) ( this.fractionPart % Math.pow(10,check) );
            isOverLo = true;
        }
        if ( isOverLo ){
            this.intPart = num.getIntPart() + intPart + 1;
        }else{
            this.intPart = num.getIntPart() + intPart;
        }
        System.out.println(this.toString());
    }

    public void compareNum ( Fraction num ){
        if ( this.intPart == num.getIntPart() ){
            if ( this.countOfDec() == num.countOfDec()){
                if ( fractionPart == num.getFractionPart() ){
                    System.out.println("Number = "+this.toString()+" is same with "+
                            num.toString());
                }else if( fractionPart > num.fractionPart ){
                    System.out.println("Number = "+this.toString()+" more than "+
                            num.toString());
                }else{
                    System.out.println("Number = "+this.toString()+" less than "+
                            num.toString());
                }
            }else if( this.countOfDec() > num.countOfDec() ){
                System.out.println("This part in progress");
            }else{
                System.out.println("In progress");
            }
        }else if ( this.intPart > num.getFractionPart() ){
            System.out.println("Number = "+this.toString()+" more than"+
                    num.toString());
        }else{
            System.out.println("Number = "+this.toString()+" more than"+
                    num.toString());
        }
    }
}
