package oop;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anna", 100);
        //account.deposit(1000);
        try {
            account.withdraw(150);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(account.getBalance());
    }
}
