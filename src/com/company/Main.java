package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(500000);
        System.out.println("БАНКОВСКИЙ СЧЕТ :" + bankAccount.getAmount()+"com.");
        System.out.println("СКОЛЬКО ХОТИТЕ ВЗЯТЬ ДЕНЕГ ?");
        System.out.println("ХОЧУ ВЗЯТЬ 65000");
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextByte();



        while (true){
            try {
                System.out.println(bankAccount.getAmount());
                bankAccount.withdraw(m);



            }catch (LimitExpetion r){
                System.out.println(r.getMessage());
                try {
                    bankAccount.withdraw((int) bankAccount.getAmount());



                }catch (LimitExpetion limitExpetion){
                    limitExpetion.printStackTrace();
                }
                break;
            }

        }
    }




}
