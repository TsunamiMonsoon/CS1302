//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students;

    // Constructor
    /* Create a Course object */
    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<String>();
    }

    // Methods
    public void addStudent(String student) {
        students.add(student);
    }

    /*Return students in an array */
    public String[] getStudents() {
        String[] a = new String[students.size()];
        return students.toArray(a);
    }

    /* Return number of students */
    public int getNumberOfStudents() {
        return students.size();
    }

    /*Return course name */
    public String getCourseName() {
        return courseName;
    }

    /* Drop a student for list */
    public void dropStudent(String student) {
        students.remove(student);
    }
}
