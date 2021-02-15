//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

import java.util.Scanner;

public class Exercise_11_10 {
    /* Main method */
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Create a MyStack
        MyStack stack = new MyStack();

        // Prompt the user to enter five strings
        System.out.print("Enter five strings: ");
        for (int i = 0; i < 5; i++) {
            stack.push(input.next());
        }

        // Display in reverse order
        System.out.println("Stack: " + stack.toString());
    }
}
