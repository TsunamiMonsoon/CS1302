//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

public class Faculty extends Employee {

    private String officeHours;
    private String rank;

    // Constructors

    public Faculty(String name, String address, String phone, String email,
                   int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    // Return officeHours
    public String getOfficeHours() {
        return officeHours;
    }

    //Set new officeHours
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    // Return rank
    public String getRank() {
        return rank;
    }

    // Set new rank
    public void setRank(String rank) {
        this.rank = rank;
    }


    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
}