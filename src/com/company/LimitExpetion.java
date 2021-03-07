package com.company;

public class LimitExpetion extends Exception {
    private double remaingAmout;
    public LimitExpetion(String message,double remaingAmout){
        super(message);
        this.remaingAmout = remaingAmout;
    }
    public double getRemaingAmout(){
        return remaingAmout;
    }
}
