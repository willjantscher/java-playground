package com.galvanize;

public class BankAccount {
    public long balance;

    public void deposit(long cents) {
        balance += cents;
    }
    public void withdraw(long cents) {
        balance -= cents;
    }
    public long balance() {
        return balance;
    }
    public boolean isOverDrawn() {
        if(balance < 0) {
            return true;
        } else {
            return false;
        }
    }
}
