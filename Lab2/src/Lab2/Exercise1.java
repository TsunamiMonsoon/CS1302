//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 2

package Lab2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Exercise1 {

    public static void main(String [] args) throws FileNotFoundException {

        File speech = new File("speech.txt");
        Scanner scan = new Scanner(speech);
        int wordCount = 0;

        while (scan.hasNext()) {
            String line = scan.nextLine();
            if (!line.equals("")) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (!(words[i].equals("--"))) {
                        wordCount++;
                    }
                }
            }

        }

        scan.close();

        System.out.println("Word count: " + wordCount);
    }
}
