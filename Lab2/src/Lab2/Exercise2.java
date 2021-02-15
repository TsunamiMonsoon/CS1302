//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 2

package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Scanner;

public class Exercise2 {

    public static void main (String [] args) {


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scan.nextInt();
        System.out.println("Enter the gender: ");
        String gender = scan.next();
        System.out.println("Enter the name: ");
        String name = scan.next();

        try {
            File file;
            Scanner sc = new Scanner(new File("babyNames" + year + ".txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] linearray = line.split("\t");

                if(gender.equals("m"))
                {
                    if(name.equals(linearray[1]))
                    {
                        System.out.println(name + " is ranked " + linearray[0] + " in year " + year);
                    }
                }

                if(gender.equals("f"))
                {
                    if(name.equals(linearray[3]))
                    {
                        System.out.println(name + " is ranked " + linearray[0] + " in year " + year);
                    }
                }
            }

        }
        catch(FileNotFoundException	e) {
            System.out.println("file not found");

        }


    }
}