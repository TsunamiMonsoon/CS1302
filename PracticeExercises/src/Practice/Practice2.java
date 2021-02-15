//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 2

package Practice;


public class Practice2 {

    private int id = 0;
    private String name = "";
    private double gpa = 0.0;

    public Practice2() {
    }


    public Practice2 (int id, String name, double gpa) {

        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getid() {
        return id;
    }

    public String getname() {
        return name;
    }

    public double getgpa() {
        return gpa;
    }

    public void setid(int id) {
        this.id = id;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setgpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean equals(int id) {
        return this.id == id;
    }

    public boolean equals(String name) {
        return this.name.equals(name);
    }

    public boolean equals(double gpa) {
        return this.gpa == gpa;
    }

    public String toStringid() {
        return Integer.toString(id);
    }

    public String toStringgpa() {
        return Double.toString(gpa);
    }
}

