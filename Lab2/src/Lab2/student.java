//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 2

package Lab2;

public class student {

    public String firstName;
    public String lastName;
    public Course [] courses;


    public student(String firstName, String lastName, int numCourses) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.courses = new Course [numCourses];

    }

    public void createCourse (String courseName, int creditHours, char letterGrade) {
        Course CR = new Course(courseName, creditHours, letterGrade);
        boolean t = false;
        int i = 0;
        while (!t) {
            if (courses[i] == null) {
                courses[i] = CR;
                t = true;
            }
            i++;
        }
    }

    public double computeGPA() {
        double points = 0;
        double creditHours = 0;

        for (int i = 0; i < this.courses.length; i++) {
            points += (courses[i].getCreditHours() * courses[i].getQualityPoints());
            creditHours += courses[i].getCreditHours();
        }
        return points / creditHours;
    }

    public String toString() {
        return "Student " + firstName + " " + lastName + " has a " + computeGPA() + " GPA";
    }



}
