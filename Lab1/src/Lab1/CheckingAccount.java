//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    // Construct a default
    public CheckingAccount() {
        super();
        overdraftLimit = -20;
    }

    // Construct a CheckingAccount with id, balance and overdraftLimit
    public CheckingAccount(int id, double balance, double overdraftLimit) {
        super(id, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // Set a new overdraft limit
    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    // Return overdraft limit
    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    // Decrease balance by amount
    public void withdraw(double amount) {
        if (getBalance() - amount > overdraftLimit) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Amount exceeds overdraft limit.");
    }


    public String toString() {
        return super.toString() + "\nOverdraft limit: $" + String.format("%.2f", overdraftLimit);
    }
}
