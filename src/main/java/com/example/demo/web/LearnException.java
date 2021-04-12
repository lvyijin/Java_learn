package com.example.demo.web;

public class LearnException {
    public static void main(String[] args){
        CheckingAccount ca = new CheckingAccount(100);
        System.out.printf("deposit $%f\n", 500.0);
        ca.deposit(500);
        try{
            ca.withdraw(100);
            System.out.printf("withdraw $%f\n", 100.0);
            ca.withdraw(700);
            System.out.printf("withdraw $%f\n", 700.0);
        }catch (InsufficientBalanceException e){
            System.out.printf("need $%f\n", e.getNeeds());
            e.printStackTrace();
        }


    }
}

class CheckingAccount{
    private int carNumber;
    private float balance;
    public CheckingAccount(int carNumber){
        this.carNumber = carNumber;
    }

    public void deposit(float amount){
        this.balance += amount;
    }

    public void withdraw(float amount) throws InsufficientBalanceException {
        if(this.balance - amount > 0){
            this.balance -= amount;
        }else {
            throw new InsufficientBalanceException(this.balance-amount);
        }
    }

}

class InsufficientBalanceException extends Exception{
    private float needs;
    public InsufficientBalanceException(float needs){
        this.needs = needs;
    }
    public float getNeeds(){
        return this.needs;
    }
}

