//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 9

package Practice;


public class Exercise_09_07 {

    public static void main(String[] args) {

        Account account = new Account(1122, 20000);


        account.setAnnualInterestRate(4.5);


        account.withdraw(2500);


        account.deposit(3000);


        System.out.println("\n          Account Statement");
        System.out.println("------------------------------------------");
        System.out.println("Account ID: " + account.getId());
        System.out.println("Date created: " + account.getDateCreated());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly interest: $%.2f\n",
                account.getMonthlyInterest());
    }
}

