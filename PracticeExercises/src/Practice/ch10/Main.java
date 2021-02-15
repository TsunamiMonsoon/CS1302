//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 10

package Practice.ch10;

public class Main {

    public static void main(String[] args) {

        /** Create three Student objects **/
        student janDoe = new student("Jan", "Doe", 5);
        student johnSmith = new student("John", "Smith", 5);
        student davidHill = new student("David", "Hill", 3);
        /** Add courses to janDoe **/
        janDoe.createCourse("Math", 4, 'A');
        janDoe.createCourse("English", 3, 'A');
        janDoe.createCourse("CS", 4, 'A');
        janDoe.createCourse("Chemistry", 3, 'B');
        janDoe.createCourse("Health", 2, 'B');
        /** Add courses to johnSmith **/
        johnSmith.createCourse("Math", 4, 'B');
        johnSmith.createCourse("English", 3, 'B');
        johnSmith.createCourse("CS", 4, 'C');
        johnSmith.createCourse("Chemistry", 3, 'C');
        johnSmith.createCourse("Health", 2, 'B');
        /** Add courses to davidHill **/
        davidHill.createCourse("Math", 4, 'C');
        davidHill.createCourse("English", 3, 'A');
        davidHill.createCourse("Health", 2, 'A');
        /** Print out Student objects **/
        System.out.println(janDoe);
        System.out.println(johnSmith);
        System.out.println(davidHill);
    }

}

