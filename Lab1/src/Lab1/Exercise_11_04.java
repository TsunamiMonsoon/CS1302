//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Lab 1

package Lab1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Exercise_11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getIntegerList();
        Integer max = max(list);
        System.out.println("Max = " + max);
    }

    private static ArrayList<Integer> getIntegerList() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers ending with 0: ");
        int next = scanner.nextInt();
        while (next != 0) {
            list.add(next);
            next = scanner.nextInt();
        }
        return list;
    }

    public static Integer max(ArrayList<Integer> list) {
        return list.isEmpty() ? null : Collections.max(list);
    }
}
