//Class:1302/04
//Term: Spring 2018
//Name:Heather Willis
//Instructor: Tejaswini Nalamothu
//Assignment: Practice 9

package Practice;


import java.text.NumberFormat;

public class SummerStats {



    NumberFormat fmt = NumberFormat.getCurrencyInstance();



    double[][] stats;
    double[][] sortedArray;
    double[] averageSalary;



    SummerStats(int a, int b) {
        stats = new double[a][b];
        sortedArray = new double[a][b];
        averageSalary = new double[b];
        fillArray(a,b);
        fillSort();
    }




    public double individualSalary(int employee) {
        int count = 0;
        int column = 0;
        double total = 0;
        for (column = 0; column < stats[0].length; column++) {
            total = total + stats[employee][column];
        }
        return total;
    }


    public double individualYear(int year) {
        int count = 0;
        int column = 0;
        int employee = 0;
        int row = 0;
        double max = 0;

        for (row = 0; row < stats.length; row++) {
            if (max < stats[row][year]) {
                employee = row;
                max = stats[row][year];
            }

        }
        return employee;
    }


    public int highestPaid() {
        int count = 0;
        int row = 0;
        int column = 0;
        int employee = 0;
        double rowSum = 0;
        double max = 0;

        for (row = 0; row < stats.length; row++) {
            rowSum = 0;
            for (column = 0; column < stats[row].length; column++) {
                rowSum = rowSum + stats[row][column];
            }
            if (rowSum > max) {
                max = rowSum;
                employee = row;
            }
        }

        return employee;
    }


    public int profitableYear() {
        int count = 0;
        int row = 0;
        int column = 0;
        int year = 0;
        double columnSum = 0;
        double max = 0;

        for (column = 0; column < stats[0].length; column++) {
            columnSum = 0;
            for (row = 0; row < stats.length; row++) {
                columnSum = columnSum + stats[row][column];
            }
            if (columnSum > max) {
                max = columnSum;
                year = column;
            }
        }

        return year;
    }


    public void printSummerStats() {
        int count = 0;
        int row = 0;
        int column = 0;
        for (row = 0; row < stats.length; row++) {
            for (column = 0; column < stats[row].length; column++) {
                System.out.print(fmt.format(stats[row][column]) + " ");
            }
            System.out.println();
        }
    }


    public double statSum() {
        double sum = 0;
        int row = 0;
        int column = 0;

        for (row = 0; row < stats.length; row++) {
            for (column = 0; column < stats[row].length; column++) {
                sum = sum + stats[row][column];
            }
        }
        return sum;
    }


    public void fillArray(int row, int column) {
        int count = 0;
        for (row = 0; row < stats.length; row++) {
            for (column = 0; column < stats[row].length; column++) {
                stats[row][column] = Math.random() * 250000;
            }
        }
    }


    public void fillSort() {
        int row = 0;
        int column = 0;
        int count = 0;
        for (row = 0; row < sortedArray.length; row++) {
            for (column = 0; column < sortedArray[row].length; column++) {
                sortedArray[row][column] = stats[row][column];
            }
        }
    }


    public void fillAverage() {
        int count = 0;
        int row = 0;
        int column = 0;
        int year = 0;
        double columnSum = 0;
        double average = 0;

        for (column = 0; column < stats[0].length; column++) {
            for (row = 0; row < stats.length; row++) {
                columnSum = columnSum + stats[row][column];
            }
            average = columnSum / stats.length;
            averageSalary[column] = average;
            columnSum = 0;
        }
    }


    public void sortArray() {
        int count = 0;
        int row = 0;
        int column = 0;
        double rowSum = 0;
        double rowSum2 = 0;
        boolean swapped = true;

        double[][] tempArray = new double[1][1];


        while(swapped) {
            swapped = false;
            for (row = 0; row < sortedArray.length - 1; row++) {
                rowSum = 0;
                rowSum2 = 0;
                for (column = 0; column < sortedArray[row].length; column++) {
                    rowSum = rowSum + sortedArray[row][column];
                    rowSum2 = rowSum2 + sortedArray[row + 1][column];
                }
                if (rowSum2 > rowSum) {
                    for (column = 0; column < sortedArray[row].length; column++) {
                        tempArray[0][0] = sortedArray[row][column];
                        sortedArray[row][column] = sortedArray[row + 1][column];
                        sortedArray[row + 1][column] = tempArray[0][0];
                        swapped = true;
                    }
                }
            }
        }
    }


    public double[][] getSortedArray() {
        return sortedArray;
    }


    public double[] getAverageArray() {
        return averageSalary;
    }
}

