//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 2

package Practice;

public class Practice2_1 {

    public static void main(String [] args) {

        Practice2 student1 = new Practice2();

        // printing default value
        System.out.println("ID: " + student1.getid() + " Name: " + student1.getname() + " GPA: " + student1.getgpa());
        student1.setid(3);
        student1.setname("rob");
        student1.setgpa(3.82);

        // printing get methods student1
        System.out.println("ID: " + student1.getid() + " Name: " + student1.getname() + " GPA: " + student1.getgpa());

        Practice2 student2 = new Practice2(4, "jack", 2.9);

        // printing get methods student2
        System.out.println("ID: " + student2.getid() + " Name: " + student2.getname() + " GPA: " + student2.getgpa());

        // printing toString id/gpa
        System.out.println(student2.toStringid());
        System.out.println(student2.toStringgpa());

        // printing true or false
        System.out.println(student2.equals(2.9));
        System.out.println(student2.equals(3));
        System.out.println(student2.equals("heather"));


    }
}

