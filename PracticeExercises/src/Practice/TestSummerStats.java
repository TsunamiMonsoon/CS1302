//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 9

package Practice;


import java.util.Scanner;
import java.text.NumberFormat;

public class TestSummerStats {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();



        double[] averageArray;
        double[][] sortArray;



        int people = 0;
        int years = 0;
        int row = 0;
        int column = 0;
        int employeeNumber = 0;
        int checkYear = 0;



        System.out.print("Enter the number of people:");
        people = input.nextInt();

        System.out.print("Enter the number of years worked:");
        years = input.nextInt();

        System.out.print("\nWhat employee's total salary would you like to check?:");
        employeeNumber = input.nextInt();

        System.out.print("\nWhat year would you like to check for highest employee salary?:");
        checkYear = input.nextInt();



        SummerStats Stat1 = new SummerStats(people, years);
        averageArray = new double[years];
        sortArray = new double[people][years];



        Stat1.fillAverage();
        Stat1.sortArray();
        averageArray = Stat1.getAverageArray();
        sortArray = Stat1.getSortedArray();



        System.out.println("\nTable with employees starting at number 0 and increasing going down\nand years starting at 0 and increasing to the right.\n");
        Stat1.printSummerStats();


        System.out.print("\nThe employee made the most money in year " + checkYear + " is:" + (int)Stat1.individualYear(checkYear));
        System.out.print("\nThe employee that made the most money is:" + Stat1.highestPaid());
        System.out.print("\nThe most profitable year was:" + Stat1.profitableYear());
        System.out.print("\nSum of income for all employees:" + fmt.format(Stat1.statSum()));
        System.out.println("\nSalary for Employee " + employeeNumber + ":\t\t\t\t" + fmt.format(Stat1.individualSalary(employeeNumber)));

        System.out.println("\nYearly Averages:\n___________________________");
        for (column = 0; column < averageArray.length; column++) {
            System.out.print("Year: " + column + "\t\t");
        }

        System.out.println();

        for (column = 0; column < averageArray.length; column++) {
            System.out.print(fmt.format(averageArray[column]) + "\t");
        }

        System.out.println("\n\nSorted Array:\n___________________________");
        for (row = 0; row < sortArray.length; row++) {
            for (column = 0; column < sortArray[row].length; column++) {
                System.out.print(fmt.format(sortArray[row][column]) + " ");
            }
            System.out.println();
        }
    }
}

