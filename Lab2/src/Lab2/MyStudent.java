//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 2

package Lab2;

import java.util.ArrayList;

public class MyStudent extends student{
    private static ArrayList<Course> courseList = new ArrayList<>();

    public static void addCourse(String course, int creditHours, char letterGrade) {
        Course newCourse = new Course(course, creditHours, letterGrade);
        courseList.add(newCourse);
    }

    public MyStudent(String fname, String lname) {
        super(fname, lname, courseList.size());
    }

    public String toString() {
        for(Course course : courseList) {
            super.createCourse(course.getCourseName(), course.getCreditHours(), course.getLetterGrade());
        }

        return super.toString();
    }
}
