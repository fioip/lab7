package Encapsulation;

public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance){
        this.balance = newBalance;
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount myBalance = new BankAccount();
        myBalance.setBalance(1234.67);

        double deposit = 100;
        deposit += myBalance.getBalance();
        System.out.println(deposit);
    }
}
