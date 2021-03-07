package com.company;

public class BankAccount {
    private double amount;
    public double getAmount(){
        return amount;
    }
    public double deposit(int sum){
        return amount += sum;
    }
    public void withdraw(int sum)throws LimitExpetion{
        if (amount<sum);
        throw new LimitExpetion("У вас не додосточно денег на счету.\nСчитано с карты:"+amount,amount);
    }
}
