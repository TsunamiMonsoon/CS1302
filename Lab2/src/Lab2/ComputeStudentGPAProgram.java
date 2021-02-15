//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 2

package Lab2;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ComputeStudentGPAProgram {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the first name: ");
            String fname = input.nextLine();

            System.out.print("Enter the last name: ");
            String lname = input.nextLine();

            input.close();
            File file = new File("grade/" + fname + "-" + lname + ".csv");
            Scanner reader = new Scanner(file);

            while(reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] line_split = line.split(",");

                MyStudent.addCourse(line_split[0], Integer.parseInt(line_split[1]), line_split[2].charAt(0));
            }
            reader.close();

            MyStudent student = new MyStudent(fname, lname);
            System.out.println(student);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
