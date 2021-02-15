//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1
package Lab1;

import java.util.Date;
import java.util.Set;

public class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated;

    // Constructors
    Account() {
        this(0, 0);
    }

    // Creates an account with the id and initial balance
    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
        dateCreated = new Date();
    }


    // Set id
    public void setId(int id) {
        this.id = id;
    }

    // Set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Set annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }


    // Return id
    public int getId() {
        return id;
    }

    // Return balance
    public double getBalance() {
        return balance;
    }

    // Return annualInterestRate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Return dateCreated
    public String getDateCreated() {
        return dateCreated.toString();
    }

    // Return monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }


    // Return monthly interest
    public double getMonthlyInterest() {
        return balance * (getMonthlyInterestRate() / 100);
    }

    //* Decrease balance by amount
    public void withdraw(double amount) {
        balance -= amount;
    }

    // Increase balance by amount
    public void deposit(double amount) {
        balance += amount;
    }


    public String toString() {
        return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
                + "\nBalance: $" + String.format("%.2f", balance) +
                "\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
    }
}
