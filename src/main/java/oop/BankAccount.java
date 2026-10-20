package oop;

public class BankAccount {

    private String owner;
    private double balance;


    public BankAccount(String owner, double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Your balance has to be positive. Currently your balance is " + balance);
        }

        this.owner = owner;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0. The value " + amount + " is wrong.");
        }
        balance = balance + amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0. The value " + amount + " is wrong.");
        } else if (amount > balance) {
            throw new InsufficientFundsException("Balance " + balance + " has to be greater than amount " + amount);
        }
        balance = balance - amount;
    }
}
