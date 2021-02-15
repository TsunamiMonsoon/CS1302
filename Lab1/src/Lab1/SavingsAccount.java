//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

public class SavingsAccount extends Account {

    //Construct a default CheckingAccount
    public SavingsAccount() {
        super();
    }

    //* Construct a SavingsAccount with id, balance
    public SavingsAccount(int id, double balance) {
        super(id, balance);
    }
    // Decrease balance by amount
    public void withdraw(double amount) {
        if (amount < getBalance()) {
            setBalance(getBalance() - amount);
        }
        else
            System.out.println("Error! Savings account overdrawn transtaction rejected");
    }
}
