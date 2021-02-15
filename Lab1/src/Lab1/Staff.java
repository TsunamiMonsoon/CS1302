//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

public class Staff
        extends Employee {

    private String title;

    // Constructors
    public Staff(String name, String address, String phone,
                 String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }


    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }


    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }
}
